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
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0, node1, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Not declared as a type name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12, node20);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(12, node28);
        boolean boolean31 = node30.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node6, node14, node20, node30, 45, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = node5.copyInformationFrom(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        // The following exception was thrown during execution in test generation
        try {
            node7.setDouble((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.FunctionType functionType3 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry6.createObjectType(objectType7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionTypeWithNewThisType(functionType3, objectType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType8);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        int int17 = node7.getIndexOfChild(node14);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = node7.getExistingIntProp((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = objectType4.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType.Property property7 = functionType5.getOwnSlot("[, hi!, , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(functionType5);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = objectType4.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = functionType5.getReferenceName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(functionType5);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = com.google.javascript.rhino.Node.BRACELESS_TYPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 41 + "'", int0 == 41);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isNew();
        boolean boolean12 = node10.isFalse();
        node10.putIntProp((int) '#', (int) '#');
        boolean boolean16 = node10.isReturn();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        java.lang.Object obj26 = node24.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship27 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node10, node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            node10.removeChild(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType50.findPropertyType("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = jSType52.isUnknownType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSType52);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry20.getNativeType(jSTypeNative38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType50.findPropertyType("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = jSType52.isNullable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSType52);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = objectType56.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = functionType50.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(objectType57);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor9 = charSequenceList7.iterator();
        int int10 = charSequenceList4.lastIndexOf((java.lang.Object) charSequenceItor9);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor33 = charSequenceList31.iterator();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList40 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList14, (java.lang.Cloneable) charSequenceList19, (java.lang.Cloneable) charSequenceList26, (java.lang.Cloneable) charSequenceList31, (java.lang.Cloneable) charSequenceList37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList14.spliterator();
        boolean boolean42 = charSequenceList4.contains((java.lang.Object) charSequenceList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = charSequenceList4.add((java.lang.CharSequence) "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charSequenceItor33);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(cloneableList40);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = node20.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node21.isOptionalArg();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean9 = node5.getBooleanProp(38);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node5.getExistingIntProp(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 44");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        node20.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo24 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        boolean boolean17 = node16.isNew();
        boolean boolean18 = node16.isFalse();
        com.google.javascript.rhino.Node node19 = node6.srcrefTree(node16);
        node6.setOptionalArg(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12, node27);
        boolean boolean30 = node27.isGetElem();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node27.addChildToFront(node35);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node35.children();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean48 = node47.isObjectLit();
        int int49 = node47.getLineno();
        int int50 = node47.getLength();
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node47);
        java.lang.String str52 = node42.checkTreeEquals(node47);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(12, node58);
        node60.setLength(51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node35, node47, node60, 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 40 + "'", int49 == 40);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isArrayLit();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(12, node18);
        java.lang.Object obj22 = node20.getProp((int) '#');
        com.google.javascript.rhino.Node node23 = node10.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        int int25 = node2.getIndexOfChild(node23);
        com.google.javascript.rhino.Node node26 = node23.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry53.createObjectType(objectType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        boolean boolean59 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        boolean boolean63 = jSTypeRegistry62.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry76.createObjectType(objectType77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry81.createObjectType(objectType82);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        boolean boolean87 = jSTypeRegistry86.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList88 = com.google.common.collect.ImmutableList.of(jSTypeRegistry53, jSTypeRegistry58, jSTypeRegistry62, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76, jSTypeRegistry81, jSTypeRegistry86);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray89 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry66.createUnionType(jSTypeNativeArray89);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.createOptionalNullableType(jSType90);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate92 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = jSType90.setValidator(jSTypePredicate92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList88);
        org.junit.Assert.assertNotNull(jSTypeNativeArray89);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(jSType91);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        functionType88.clearCachedValues();
        boolean boolean90 = functionType88.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray91 = new com.google.javascript.rhino.jstype.JSType[] { functionType88 };
        com.google.javascript.rhino.Node node92 = jSTypeRegistry11.createParameters(jSTypeArray91);
        jSTypeRegistry11.clearTemplateTypeNames();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jSTypeArray91);
        org.junit.Assert.assertNotNull(node92);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = com.google.javascript.rhino.Node.JSDOC_INFO_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getTypeOfThis();
        boolean boolean53 = objectType52.matchesNumberContext();
        boolean boolean54 = objectType52.isInterface();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor7 = charSequenceList4.listIterator();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        boolean boolean19 = charSequenceList16.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        int int25 = charSequenceList23.size();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor30 = charSequenceList28.iterator();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList34 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        int int36 = charSequenceList34.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList37 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList11, (java.lang.Cloneable) charSequenceList16, (java.lang.Cloneable) charSequenceList23, (java.lang.Cloneable) charSequenceList28, (java.lang.Cloneable) charSequenceList34);
        boolean boolean38 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence41 = charSequenceList28.set((int) 'a', (java.lang.CharSequence) "InputId: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charSequenceItor30);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(cloneableList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue1);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = node7.getChildBefore(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = com.google.javascript.rhino.Node.OPT_ARG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("EQ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        boolean boolean21 = node7.isRegExp();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        boolean boolean28 = node26.isEmpty();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(12, node34);
        boolean boolean37 = node36.isNew();
        boolean boolean38 = node36.isFalse();
        node36.putIntProp((int) '#', (int) '#');
        boolean boolean42 = node36.isReturn();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceChildAfter(node26, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12, node12);
        boolean boolean15 = node12.isGetElem();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node12.addChildToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = charSequenceList4.contains((java.lang.Object) node20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = charSequenceList4.add((java.lang.CharSequence) "function ({939717413}): function (this:me, {365018168}): me");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node6.addChildToFront(node14);
        node14.setIsSyntheticBlock(false);
        boolean boolean18 = node14.isGetterDef();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(41, node14, 49, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor52 = charSequenceList50.iterator();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList33, (java.lang.Cloneable) charSequenceList38, (java.lang.Cloneable) charSequenceList45, (java.lang.Cloneable) charSequenceList50, (java.lang.Cloneable) charSequenceList56);
        boolean boolean60 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        int int61 = charSequenceList50.size();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(charSequenceItor52);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "function ({939717413}): function (this:me, {365018168}): me", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList3.replaceAll(charSequenceUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream30 = charSequenceList15.stream();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceStream30);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node15.isGetElem();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node15.addChildToFront(node23);
        boolean boolean25 = node23.isDefaultCase();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean32 = node31.isObjectLit();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(12, node31);
        boolean boolean34 = node33.isArrayLit();
        boolean boolean35 = node33.isSwitch();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(12, node41);
        java.lang.Object obj45 = node43.getProp((int) '#');
        com.google.javascript.rhino.Node node46 = node33.copyInformationFromForTree(node43);
        int int47 = node23.getIndexOfChild(node46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = node7.getChildBefore(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node8.isArrayLit();
        boolean boolean10 = node8.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        java.lang.Object obj20 = node18.getProp((int) '#');
        com.google.javascript.rhino.Node node21 = node8.copyInformationFromForTree(node18);
        boolean boolean22 = node21.isQuotedString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(2, node21, node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList2 = com.google.common.collect.ImmutableList.of(iOException1);
        org.junit.Assert.assertNotNull(iOExceptionList2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor52 = charSequenceList50.iterator();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList33, (java.lang.Cloneable) charSequenceList38, (java.lang.Cloneable) charSequenceList45, (java.lang.Cloneable) charSequenceList50, (java.lang.Cloneable) charSequenceList56);
        boolean boolean60 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean66 = node65.isObjectLit();
        int int67 = charSequenceList50.indexOf((java.lang.Object) boolean66);
        charSequenceList50.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList71 = charSequenceList50.subList((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(charSequenceItor52);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry2.createNamedType("Not declared as a type name", "[, hi!, , ]", (int) (byte) 0, (int) (short) 1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isNew();
        boolean boolean19 = node17.isFalse();
        node17.putIntProp((int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry2.createInterfaceType("", node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor52 = charSequenceList50.iterator();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList33, (java.lang.Cloneable) charSequenceList38, (java.lang.Cloneable) charSequenceList45, (java.lang.Cloneable) charSequenceList50, (java.lang.Cloneable) charSequenceList56);
        boolean boolean60 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean66 = node65.isObjectLit();
        int int67 = charSequenceList50.indexOf((java.lang.Object) boolean66);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList50.replaceAll(charSequenceUnaryOperator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(charSequenceItor52);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = objectType4.getConstructor();
        boolean boolean6 = objectType4.isFunctionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = null;
        objectType4.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry12.createObjectType(objectType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = objectType14.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType16 = objectType4.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNull(functionType15);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        java.lang.Object obj17 = node15.getProp((int) '#');
        boolean boolean18 = node15.isBreak();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        boolean boolean27 = node24.isGetElem();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node24.addChildToFront(node32);
        boolean boolean34 = node32.isDefaultCase();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        boolean boolean43 = node42.isArrayLit();
        boolean boolean44 = node42.isSwitch();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        java.lang.Object obj54 = node52.getProp((int) '#');
        com.google.javascript.rhino.Node node55 = node42.copyInformationFromForTree(node52);
        int int56 = node32.getIndexOfChild(node55);
        // The following exception was thrown during execution in test generation
        try {
            node5.addChildrenAfter(node15, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry20.getNativeObjectType(jSTypeNative38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        boolean boolean17 = node13.isGetterDef();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node13);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            node13.addChildrenToFront(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(staticSourceFile18);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        fileLevelJsDocBuilder5.append("EQ");
        fileLevelJsDocBuilder5.append("");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        com.google.javascript.rhino.jstype.JSType jSType98 = functionType90.getPropertyType("hi!");
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList99 = functionType90.getSubTypes();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNull(functionTypeList99);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.getTypeOfThis();
        boolean boolean54 = functionType50.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        boolean boolean10 = node6.isGetProp();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        boolean boolean27 = node26.isNew();
        boolean boolean28 = node26.isFalse();
        com.google.javascript.rhino.Node node29 = node16.srcrefTree(node26);
        node16.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) '#', node6, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        java.lang.Object obj10 = node8.getProp((int) '#');
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node18.isArrayLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        java.lang.Object obj29 = node27.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node27.setStaticSourceFile(staticSourceFile30);
        com.google.javascript.rhino.Node node32 = node27.cloneTree();
        com.google.javascript.rhino.Node node33 = node18.copyInformationFromForTree(node32);
        com.google.javascript.rhino.Node node34 = node8.clonePropsFrom(node18);
        com.google.javascript.rhino.Node node35 = node18.removeFirstChild();
        boolean boolean36 = node18.isGetElem();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean43 = node42.isObjectLit();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(12, node42);
        boolean boolean45 = node44.isArrayLit();
        boolean boolean46 = node44.isSwitch();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(12, node52);
        java.lang.Object obj56 = node54.getProp((int) '#');
        com.google.javascript.rhino.Node node57 = node44.copyInformationFromForTree(node54);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newExpr(node57);
        node57.setOptionalArg(false);
        boolean boolean61 = node57.isDebugger();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean68 = node67.isObjectLit();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(12, node67);
        java.lang.Object obj71 = node69.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile72 = null;
        node69.setStaticSourceFile(staticSourceFile72);
        com.google.javascript.rhino.Node node74 = node69.cloneTree();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean81 = node80.isObjectLit();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(12, node80);
        boolean boolean83 = node80.isGetElem();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node80.addChildToFront(node88);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((-1), node18, node57, node74, node80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node15 = node9.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo16 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        int int97 = functionType90.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = null;
        functionType90.setJSDocInfo(jSDocInfo98);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean94 = functionType89.canBeCalled();
        java.lang.String str95 = functionType89.getReferenceName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry15.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative97 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType98 = jSTypeRegistry15.getNativeObjectType(jSTypeNative97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = com.google.javascript.rhino.Node.IS_NAMESPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 46 + "'", int0 == 46);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.getTypeOfThis();
        boolean boolean55 = objectType54.isNoResolvedType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, , ]", jSTypeNative1);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec5 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative7);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative10 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec11 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative10);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = null;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative14 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec15 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative14);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec16 = null;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative18 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec19 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecList20 = com.google.common.collect.ImmutableList.of(assertionFunctionSpec2, assertionFunctionSpec5, assertionFunctionSpec8, assertionFunctionSpec11, assertionFunctionSpec12, assertionFunctionSpec15, assertionFunctionSpec16, assertionFunctionSpec19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 4");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        node20.setOptionalArg(false);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags24 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags24.setReturnsTainted();
        sideEffectFlags24.setMutatesThis();
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags(sideEffectFlags24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int0 = com.google.javascript.rhino.Node.VAR_ARGS_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        com.google.javascript.rhino.jstype.JSType jSType98 = functionType90.getPropertyType("hi!");
        boolean boolean99 = jSType98.isEnumType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor7 = charSequenceList4.listIterator();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        boolean boolean19 = charSequenceList16.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        int int25 = charSequenceList23.size();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor30 = charSequenceList28.iterator();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList34 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        int int36 = charSequenceList34.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList37 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList11, (java.lang.Cloneable) charSequenceList16, (java.lang.Cloneable) charSequenceList23, (java.lang.Cloneable) charSequenceList28, (java.lang.Cloneable) charSequenceList34);
        boolean boolean38 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence41 = charSequenceList4.set((int) (short) -1, (java.lang.CharSequence) "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charSequenceItor30);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(cloneableList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        node7.putBooleanProp(10, true);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = node7.useSourceInfoFromForTree(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getTypeOfThis();
        boolean boolean53 = objectType52.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        boolean boolean62 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        boolean boolean66 = jSTypeRegistry65.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry79.createObjectType(objectType80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.ErrorReporter errorReporter87 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry89 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter87, true);
        boolean boolean90 = jSTypeRegistry89.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList91 = com.google.common.collect.ImmutableList.of(jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry65, jSTypeRegistry69, jSTypeRegistry74, jSTypeRegistry79, jSTypeRegistry84, jSTypeRegistry89);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray92 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry69.createUnionType(jSTypeNativeArray92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSType93.toObjectType();
        boolean boolean95 = objectType52.canTestForShallowEqualityWith(jSType93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = objectType52.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType97 = functionType96.autoboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList91);
        org.junit.Assert.assertNotNull(jSTypeNativeArray92);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(functionType96);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean98 = functionType90.isPropertyInExterns("");
        java.lang.Iterable iterable99 = functionType90.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(iterable99);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        boolean boolean10 = charSequenceList8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence13 = charSequenceList8.set((int) '4', (java.lang.CharSequence) "SHEQ  40");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int0 = com.google.javascript.rhino.Node.FLAG_NO_THROWS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            node7.appendStringTree(appendable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor75 = charSequenceList12.listIterator();
        java.lang.CharSequence charSequence76 = charSequenceItor75.next();
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
        org.junit.Assert.assertNotNull(charSequenceItor75);
        org.junit.Assert.assertEquals("'" + charSequence76 + "' != '" + "" + "'", charSequence76, "");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        node20.setOptionalArg(false);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(12, node29);
        java.lang.Object obj33 = node31.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = null;
        node31.setStaticSourceFile(staticSourceFile34);
        node31.setIsSyntheticBlock(true);
        boolean boolean38 = node31.isSetterDef();
        boolean boolean39 = node31.isHook();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean50 = node49.isObjectLit();
        int int51 = node49.getLineno();
        int int52 = node49.getLength();
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node49);
        java.lang.String str54 = node44.checkTreeEquals(node49);
        boolean boolean55 = node44.isDo();
        com.google.javascript.rhino.Node node56 = node31.srcref(node44);
        // The following exception was thrown during execution in test generation
        try {
            node20.removeChild(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 40 + "'", int51 == 40);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        functionType88.clearCachedValues();
        boolean boolean90 = functionType88.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray91 = new com.google.javascript.rhino.jstype.JSType[] { functionType88 };
        com.google.javascript.rhino.Node node92 = jSTypeRegistry11.createParameters(jSTypeArray91);
        // The following exception was thrown during execution in test generation
        try {
            node92.setSideEffectFlags((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got PARAM_LIST");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jSTypeArray91);
        org.junit.Assert.assertNotNull(node92);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(12, node9);
        boolean boolean12 = node11.isArrayLit();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        java.lang.Object obj23 = node21.getProp((int) '#');
        com.google.javascript.rhino.Node node24 = node11.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        int int26 = node3.getIndexOfChild(node24);
        boolean boolean27 = node24.wasEmptyNode();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 1, node24, node28, node32, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        int int0 = com.google.javascript.rhino.Node.POST_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.common.collect.ImmutableList.Builder<java.lang.Class<?>> wildcardClassBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<java.lang.Class<?>> wildcardClassList1 = wildcardClassBuilder0.build();
        org.junit.Assert.assertNotNull(wildcardClassBuilder0);
        org.junit.Assert.assertNotNull(wildcardClassList1);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        // The following exception was thrown during execution in test generation
        try {
            double double42 = node23.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ [parenthesized: 35] is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor75 = charSequenceList12.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceItor75.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
        org.junit.Assert.assertNotNull(charSequenceItor75);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        boolean boolean52 = functionType50.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = functionType50.canTestForEqualityWith(jSType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        boolean boolean11 = node7.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = node7.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node4);
        boolean boolean9 = node4.isInstanceOf();
        boolean boolean10 = node4.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.setLastGeneration(false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("unknown");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(unknown)" + "'", str1, "(unknown)");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.clearAllFlags();
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        boolean boolean54 = functionType50.hasProperty("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = functionType50.testForEquality(jSType55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node8.isArrayLit();
        boolean boolean10 = node8.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        java.lang.Object obj20 = node18.getProp((int) '#');
        com.google.javascript.rhino.Node node21 = node8.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        node21.setOptionalArg(false);
        boolean boolean25 = node21.isDebugger();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType26 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType27 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList28 = com.google.common.collect.ImmutableList.of(subclassType26, subclassType27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(12, node34);
        boolean boolean37 = node36.isNew();
        boolean boolean38 = node36.isFalse();
        node36.putIntProp((int) '#', (int) '#');
        boolean boolean42 = node36.isReturn();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(12, node48);
        java.lang.Object obj52 = node50.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship53 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType27, node36, node50);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(12, node59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean68 = node67.isObjectLit();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(12, node67);
        boolean boolean70 = node69.isNew();
        boolean boolean71 = node69.isFalse();
        com.google.javascript.rhino.Node node72 = node59.srcrefTree(node69);
        boolean boolean73 = node69.isTypeOf();
        boolean boolean74 = node69.isGetElem();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean81 = node80.isObjectLit();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(12, node80);
        boolean boolean83 = node82.isArrayLit();
        boolean boolean84 = node82.isSwitch();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean91 = node90.isObjectLit();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(12, node90);
        java.lang.Object obj94 = node92.getProp((int) '#');
        com.google.javascript.rhino.Node node95 = node82.copyInformationFromForTree(node92);
        boolean boolean96 = node95.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.Bind bind97 = new com.google.javascript.jscomp.CodingConvention.Bind(node50, node69, node95);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node98 = new com.google.javascript.rhino.Node(100, node21, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + subclassType26 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType26.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType27 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType27.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        com.google.javascript.rhino.Node node12 = node7.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            node7.setString("SHEQ  40");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        boolean boolean17 = node16.isNew();
        boolean boolean18 = node16.isFalse();
        com.google.javascript.rhino.Node node19 = node6.srcrefTree(node16);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        boolean boolean28 = node27.isNew();
        boolean boolean29 = node27.isFalse();
        boolean boolean30 = node27.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(12, node36);
        boolean boolean39 = node36.isGetElem();
        com.google.javascript.rhino.Node node40 = node27.srcrefTree(node36);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(12, node46);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean55 = node54.isObjectLit();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(12, node54);
        boolean boolean57 = node56.isNew();
        boolean boolean58 = node56.isFalse();
        com.google.javascript.rhino.Node node59 = node46.srcrefTree(node56);
        node46.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(32, node19, node36, node46, 49, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        int int0 = com.google.javascript.rhino.Node.INPUT_ID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 53 + "'", int0 == 53);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean98 = functionType90.isPropertyInExterns("");
        java.util.Set<java.lang.String> strSet99 = functionType90.getOwnPropertyNames();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(strSet99);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry11.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType88, "", "Named type with empty name component", 35, 10);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate97 = null;
        boolean boolean98 = jSType96.setValidator(jSTypePredicate97);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = objectType4.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType6 = objectType5.unboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(objectType5);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        fileLevelJsDocBuilder5.append("EQ");
        fileLevelJsDocBuilder5.append("function (?): ?");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int int0 = com.google.javascript.rhino.Node.SLASH_V;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 54 + "'", int0 == 54);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        boolean boolean54 = functionType50.hasProperty("Named type with empty name component");
        boolean boolean55 = functionType50.isReturnTypeInferred();
        boolean boolean56 = functionType50.hasAnyTemplateInternal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType50.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor52 = charSequenceList50.iterator();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList33, (java.lang.Cloneable) charSequenceList38, (java.lang.Cloneable) charSequenceList45, (java.lang.Cloneable) charSequenceList50, (java.lang.Cloneable) charSequenceList56);
        boolean boolean60 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        boolean boolean62 = charSequenceList8.add((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence64 = charSequenceList8.remove(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(charSequenceItor52);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isArrayLit();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(12, node18);
        java.lang.Object obj22 = node20.getProp((int) '#');
        com.google.javascript.rhino.Node node23 = node10.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        int int25 = node2.getIndexOfChild(node23);
        boolean boolean26 = node2.isComma();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ASSIGN_MOD [, hi!, , ] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList3 = com.google.common.collect.ImmutableList.of(subclassType1, subclassType2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(12, node9);
        boolean boolean12 = node11.isNew();
        boolean boolean13 = node11.isFalse();
        node11.putIntProp((int) '#', (int) '#');
        boolean boolean17 = node11.isReturn();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        java.lang.Object obj27 = node25.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship28 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node11, node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean34 = node33.isObjectLit();
        int int35 = node33.getLineno();
        int int36 = node33.getLength();
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node33);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        boolean boolean47 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry64.createObjectType(objectType65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        boolean boolean75 = jSTypeRegistry74.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList76 = com.google.common.collect.ImmutableList.of(jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry59, jSTypeRegistry64, jSTypeRegistry69, jSTypeRegistry74);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode77 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry74.setResolveMode(resolveMode77);
        node33.putProp((int) 'a', (java.lang.Object) resolveMode77);
        node11.addChildToFront(node33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(50, node33, 40, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 40 + "'", int35 == 40);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList76);
        org.junit.Assert.assertTrue("'" + resolveMode77 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode77.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node15 = node9.cloneNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isArrayLit();
        boolean boolean25 = node23.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean32 = node31.isObjectLit();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(12, node31);
        java.lang.Object obj35 = node33.getProp((int) '#');
        com.google.javascript.rhino.Node node36 = node23.copyInformationFromForTree(node33);
        com.google.javascript.rhino.Node node37 = node36.getParent();
        boolean boolean38 = node9.hasChild(node37);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(12, node44);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(12, node52);
        boolean boolean55 = node54.isNew();
        boolean boolean56 = node54.isFalse();
        com.google.javascript.rhino.Node node57 = node44.srcrefTree(node54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = node37.isEquivalentToTyped(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getPrototype();
        boolean boolean53 = functionType50.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType50.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType50.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectType55);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType4 = jSTypeRegistry1.getNativeType(jSTypeNative3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType2);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        com.google.javascript.rhino.jstype.JSType jSType98 = functionType90.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType99 = jSType98.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNull(parameterizedType99);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        com.google.javascript.rhino.Node node12 = node7.cloneTree();
        com.google.javascript.rhino.Node node13 = node7.removeChildren();
        int int14 = node13.getLineno();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot56 = functionType50.getSlot("");
        boolean boolean57 = functionType50.isGlobalThisType();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = functionType50.testForEquality(jSType58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
        org.junit.Assert.assertNull(staticSlot56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.rhino.InputId inputId14 = new com.google.javascript.rhino.InputId("");
        node7.setInputId(inputId14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node7.getExistingIntProp(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 15");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        java.lang.Object[] objArray35 = charSequenceList8.toArray();
        boolean boolean36 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        fileLevelJsDocBuilder42.append("EQ");
        boolean boolean45 = charSequenceList4.contains((java.lang.Object) fileLevelJsDocBuilder42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence47 = charSequenceList4.remove(15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList18 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean19 = charSequenceList12.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        boolean boolean21 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = charSequenceList8.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charSequenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean94 = functionType89.canBeCalled();
        java.lang.String str95 = functionType89.getReferenceName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry15.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType97 = functionType89.autoboxesTo();
        boolean boolean98 = functionType89.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType99 = functionType89.getTypeOfThis();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node5.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node22 = node5.getAncestor(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = node22.isScript();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFalse();
        node7.putIntProp((int) '#', (int) '#');
        boolean boolean13 = node7.isArrayLit();
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            node7.appendStringTree(appendable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        boolean boolean52 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.getIndexType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType53);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType89.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = null;
        functionType91.setJSDocInfo(jSDocInfo92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSTypeRegistry15.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType91);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable95 = functionType91.getParameters();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertNotNull(nodeIterable95);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (byte) -1, (int) ' ', 4);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12, node12);
        boolean boolean15 = node12.isGetElem();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node12.addChildToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = charSequenceList4.contains((java.lang.Object) node20);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = objectType4.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = functionType5.matchesInt32Context();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(functionType5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        boolean boolean6 = jSTypeRegistry2.isForwardDeclaredType("");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry13.createObjectType(objectType14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        boolean boolean19 = jSTypeRegistry18.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        boolean boolean23 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry26.createObjectType(objectType27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSTypeRegistry31.createObjectType(objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        boolean boolean47 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList48 = com.google.common.collect.ImmutableList.of(jSTypeRegistry13, jSTypeRegistry18, jSTypeRegistry22, jSTypeRegistry26, jSTypeRegistry31, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray49 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry26.createUnionType(jSTypeNativeArray49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry53.createObjectType(objectType54);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = objectType55.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] { objectType55 };
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry10.createFunctionType(jSType50, jSTypeArray57);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot60 = functionType58.getSlot("");
        boolean boolean61 = functionType58.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = functionType58.getConstructor();
        java.lang.String str63 = functionType58.toDebugHashCodeString();
        boolean boolean64 = functionType58.hasInstanceType();
        boolean boolean65 = functionType58.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.overwriteDeclaredType("function ({939717413}): function (this:me, {365018168}): me", (com.google.javascript.rhino.jstype.JSType) functionType58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList48);
        org.junit.Assert.assertNotNull(jSTypeNativeArray49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNull(objectType56);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertNull(staticSlot60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(functionType62);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "function ({1678768302}): function (this:me, {1305467542}): me" + "'", str63, "function ({1678768302}): function (this:me, {1305467542}): me");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        boolean boolean17 = node13.isGetterDef();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node13);
        java.lang.Class<?> wildcardClass19 = node13.getClass();
        com.google.common.collect.ImmutableList<java.lang.reflect.AnnotatedElement> annotatedElementList20 = com.google.common.collect.ImmutableList.of((java.lang.reflect.AnnotatedElement) wildcardClass19);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(staticSourceFile18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(annotatedElementList20);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry2.createNamedType("Not declared as a type name", "[, hi!, , ]", (int) (byte) 0, (int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        boolean boolean20 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        boolean boolean24 = jSTypeRegistry23.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry27.createObjectType(objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry42.createObjectType(objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        boolean boolean48 = jSTypeRegistry47.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList49 = com.google.common.collect.ImmutableList.of(jSTypeRegistry14, jSTypeRegistry19, jSTypeRegistry23, jSTypeRegistry27, jSTypeRegistry32, jSTypeRegistry37, jSTypeRegistry42, jSTypeRegistry47);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray50 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry27.createUnionType(jSTypeNativeArray50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = objectType56.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { objectType56 };
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry11.createFunctionType(jSType51, jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType59.getBindReturnType(0);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.jstype.ObjectType.Property property64 = functionType59.getOwnSlot("unknown");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType59.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList49);
        org.junit.Assert.assertNotNull(jSTypeNativeArray50);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(objectType57);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNull(property64);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList77 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList77, charSequenceArray76);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList83 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean84 = charSequenceList77.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream85 = charSequenceList77.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
        org.junit.Assert.assertNotNull(charSequenceArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(charSequenceList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(charSequenceStream85);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node5.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node22 = node5.getAncestor(10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(12, node28);
        boolean boolean31 = node30.isArrayLit();
        boolean boolean32 = node30.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node30.siblings();
        node30.putBooleanProp(10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = node22.useSourceInfoIfMissingFrom(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeIterable33);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType52.getIndexType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType52.setPrototypeBasedOn(objectType54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSType53);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean10 = node6.getBooleanProp(38);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node18.isArrayLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        java.lang.Object obj29 = node27.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node27.setStaticSourceFile(staticSourceFile30);
        com.google.javascript.rhino.Node node32 = node27.cloneTree();
        com.google.javascript.rhino.Node node33 = node18.copyInformationFromForTree(node32);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.siblings();
        com.google.javascript.rhino.Node node35 = node33.getFirstChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(12, node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType45 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType46 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList47 = com.google.common.collect.ImmutableList.of(subclassType45, subclassType46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(12, node53);
        boolean boolean56 = node55.isNew();
        boolean boolean57 = node55.isFalse();
        node55.putIntProp((int) '#', (int) '#');
        boolean boolean61 = node55.isReturn();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean68 = node67.isObjectLit();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(12, node67);
        java.lang.Object obj71 = node69.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship72 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType46, node55, node69);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(2, node6, node35, node43, node69, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + subclassType45 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType45.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType46 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType46.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList47);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node6.addChildToFront(node14);
        boolean boolean16 = node6.isGetProp();
        boolean boolean17 = node6.isTry();
        com.google.javascript.rhino.Node node18 = node6.cloneNode();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList23 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int25 = charSequenceList23.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean32 = node31.isObjectLit();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(12, node31);
        boolean boolean34 = node31.isGetElem();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node31.addChildToFront(node39);
        com.google.javascript.rhino.Node node41 = node39.getLastSibling();
        boolean boolean42 = charSequenceList23.contains((java.lang.Object) node39);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(12, node48);
        boolean boolean51 = node48.isGetElem();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node48.addChildToFront(node56);
        java.lang.String str58 = node39.checkTreeEquals(node48);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(12, node64);
        boolean boolean67 = node66.isArrayLit();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean74 = node73.isObjectLit();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(12, node73);
        int int76 = node66.getIndexOfChild(node73);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean83 = node82.isObjectLit();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(12, node82);
        java.lang.Object obj86 = node84.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile87 = null;
        node84.setStaticSourceFile(staticSourceFile87);
        com.google.javascript.rhino.Node node89 = node84.cloneTree();
        com.google.javascript.rhino.Node node90 = node84.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) (short) 1, node18, node48, node66, node84, 31, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(charSequenceList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n" + "'", str58, "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n");
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        java.lang.Object[] objArray35 = charSequenceList8.toArray();
        boolean boolean36 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        fileLevelJsDocBuilder42.append("EQ");
        boolean boolean45 = charSequenceList4.contains((java.lang.Object) fileLevelJsDocBuilder42);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12, node20);
        boolean boolean23 = node22.isArrayLit();
        boolean boolean24 = node22.isSwitch();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        java.lang.Object obj34 = node32.getProp((int) '#');
        com.google.javascript.rhino.Node node35 = node22.copyInformationFromForTree(node32);
        boolean boolean36 = node22.isRegExp();
        java.lang.String str37 = node22.toString();
        // The following exception was thrown during execution in test generation
        try {
            node7.removeChild(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EQ" + "'", str37, "EQ");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags5.setReturnsTainted();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(sideEffectFlags5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getTypeOfThis();
        boolean boolean53 = objectType52.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        boolean boolean62 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        boolean boolean66 = jSTypeRegistry65.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry79.createObjectType(objectType80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.ErrorReporter errorReporter87 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry89 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter87, true);
        boolean boolean90 = jSTypeRegistry89.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList91 = com.google.common.collect.ImmutableList.of(jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry65, jSTypeRegistry69, jSTypeRegistry74, jSTypeRegistry79, jSTypeRegistry84, jSTypeRegistry89);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray92 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry69.createUnionType(jSTypeNativeArray92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSType93.toObjectType();
        boolean boolean95 = objectType52.canTestForShallowEqualityWith(jSType93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = objectType52.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType97 = functionType96.getOwnerFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList91);
        org.junit.Assert.assertNotNull(jSTypeNativeArray92);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(functionType96);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        functionType52.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType52.getPropertyType("[, hi!, , ]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType52.getTopMostDefiningType("Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        boolean boolean43 = node7.isDefaultCase();
        boolean boolean44 = node7.isEmpty();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.rhino.InputId inputId14 = new com.google.javascript.rhino.InputId("");
        node7.setInputId(inputId14);
        java.lang.String str16 = inputId14.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "InputId: " + "'", str16, "InputId: ");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getLastSibling();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean19 = node13.isEquivalentToTyped(node18);
        boolean boolean20 = node18.isTypeOf();
        int int21 = node18.getSourcePosition();
        boolean boolean22 = node18.isFor();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        java.lang.Object obj18 = node16.getProp((int) '#');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        boolean boolean27 = node26.isArrayLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(12, node33);
        java.lang.Object obj37 = node35.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = null;
        node35.setStaticSourceFile(staticSourceFile38);
        com.google.javascript.rhino.Node node40 = node35.cloneTree();
        com.google.javascript.rhino.Node node41 = node26.copyInformationFromForTree(node40);
        com.google.javascript.rhino.Node node42 = node16.clonePropsFrom(node26);
        com.google.javascript.rhino.Node node43 = node26.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = node4.getChildBefore(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo42 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.String[] strArray7 = new java.lang.String[] { "function ({1150383454}): function (this:me, {173962701}): me", "InputId: Unknown class name", "function (?): ?", "InputId: Unknown class name", "function ({939717413}): function (this:me, {365018168}): me", "function ({89774946}): function (this:me, {1297374001}): me", "function ({1150383454}): function (this:me, {173962701}): me" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.Spliterator<java.lang.String> strSpliterator10 = strSet8.spliterator();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor20 = charSequenceList18.iterator();
        int int21 = charSequenceList15.lastIndexOf((java.lang.Object) charSequenceItor20);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        int int27 = charSequenceList25.size();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList30 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        boolean boolean33 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor44 = charSequenceList42.iterator();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList48 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        int int50 = charSequenceList48.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList51 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList30, (java.lang.Cloneable) charSequenceList37, (java.lang.Cloneable) charSequenceList42, (java.lang.Cloneable) charSequenceList48);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator52 = charSequenceList25.spliterator();
        boolean boolean53 = charSequenceList15.contains((java.lang.Object) charSequenceList25);
        int int54 = charSequenceList15.size();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator55 = charSequenceList15.spliterator();
        java.util.Collection[] collectionArray57 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray58 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray57;
        charSequenceCollectionArray58[0] = charSequenceList15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray61 = strSet8.toArray(charSequenceCollectionArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charSequenceItor44);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(cloneableList51);
        org.junit.Assert.assertNotNull(charSequenceSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(charSequenceSpliterator55);
        org.junit.Assert.assertNotNull(collectionArray57);
        org.junit.Assert.assertNotNull(charSequenceCollectionArray58);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean3 = node2.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ASSIGN_MOD [, hi!, , ] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(12, node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node9);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(12, node17);
        java.lang.Object obj21 = node19.getProp((int) '#');
        boolean boolean22 = node19.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(12, node29);
        boolean boolean32 = node29.isGetElem();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node29.addChildToFront(node37);
        com.google.javascript.rhino.Node node39 = node37.getLastSibling();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean43 = node37.isEquivalentToTyped(node42);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node19, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) '#', nodeArray44, 0, 4095);
        boolean boolean48 = node47.isLocalResultCall();
        boolean boolean49 = node9.isEquivalentToTyped(node47);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] { node47 };
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(100, nodeArray50, 38, 50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(8, nodeArray50, 53, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        int int20 = node18.getLineno();
        int int21 = node18.getLength();
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node18);
        java.lang.String str23 = node13.checkTreeEquals(node18);
        com.google.javascript.rhino.Node node24 = node18.cloneNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        boolean boolean33 = node32.isArrayLit();
        boolean boolean34 = node32.isSwitch();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        java.lang.Object obj44 = node42.getProp((int) '#');
        com.google.javascript.rhino.Node node45 = node32.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = node45.getParent();
        boolean boolean47 = node18.hasChild(node46);
        com.google.javascript.rhino.Node node48 = node7.useSourceInfoIfMissingFrom(node18);
        // The following exception was thrown during execution in test generation
        try {
            node7.setString("Node tree inequality:\nTree1:\nEQ [parenthesized: 35]\n    SHEQ  40\n\n\nTree2:\nSHEQ  40\n\n\nSubtree1: EQ [parenthesized: 35]\n    SHEQ  40\n\n\nSubtree2: SHEQ  40\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ 40 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        int int6 = charSequenceList2.size();
        int int7 = charSequenceList2.size();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isLabel();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(sideEffectFlags6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        boolean boolean19 = node18.isParamList();
        // The following exception was thrown during execution in test generation
        try {
            node18.setSideEffectFlags(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor52 = charSequenceList50.iterator();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList33, (java.lang.Cloneable) charSequenceList38, (java.lang.Cloneable) charSequenceList45, (java.lang.Cloneable) charSequenceList50, (java.lang.Cloneable) charSequenceList56);
        boolean boolean60 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        int int61 = charSequenceList50.size();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(charSequenceItor52);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(12, node44);
        java.lang.Object obj48 = node46.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = null;
        node46.setStaticSourceFile(staticSourceFile49);
        com.google.javascript.rhino.Node node51 = node46.cloneTree();
        boolean boolean52 = node51.isOptionalArg();
        boolean boolean53 = node51.isWhile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry7.createInterfaceType("Node tree inequality:\nTree1:\nEQ [parenthesized: 35]\n    SHEQ  40\n\n\nTree2:\nSHEQ  40\n\n\nSubtree1: EQ [parenthesized: 35]\n    SHEQ  40\n\n\nSubtree2: SHEQ  40\n", node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("unknown");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getPrototype();
        boolean boolean53 = functionType50.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getRestrictedTypeGivenToBooleanOutcome(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType50.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { false, booleanLiteralSet7, true };
        java.io.Serializable[] serializableArray10 = charSequenceList2.toArray(serializableArray9);
        charSequenceList2.clear();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry17.createObjectType(objectType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        boolean boolean23 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        boolean boolean27 = jSTypeRegistry26.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry35.createObjectType(objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry40.createObjectType(objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList52 = com.google.common.collect.ImmutableList.of(jSTypeRegistry17, jSTypeRegistry22, jSTypeRegistry26, jSTypeRegistry30, jSTypeRegistry35, jSTypeRegistry40, jSTypeRegistry45, jSTypeRegistry50);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray53 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry30.createUnionType(jSTypeNativeArray53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = objectType59.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] { objectType59 };
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry14.createFunctionType(jSType54, jSTypeArray61);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot64 = functionType62.getSlot("");
        boolean boolean65 = functionType62.isFunctionPrototypeType();
        int int66 = functionType62.getPropertiesCount();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet67 = functionType62.getPossibleToBooleanOutcomes();
        boolean boolean68 = charSequenceList2.contains((java.lang.Object) booleanLiteralSet67);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.CharSequence> charSequenceItor70 = charSequenceList2.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList52);
        org.junit.Assert.assertNotNull(jSTypeNativeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNull(objectType60);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(staticSlot64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet67 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet67.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry2.createNamedType("Not declared as a type name", "[, hi!, , ]", (int) (byte) 0, (int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        boolean boolean20 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        boolean boolean24 = jSTypeRegistry23.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry27.createObjectType(objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry42.createObjectType(objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        boolean boolean48 = jSTypeRegistry47.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList49 = com.google.common.collect.ImmutableList.of(jSTypeRegistry14, jSTypeRegistry19, jSTypeRegistry23, jSTypeRegistry27, jSTypeRegistry32, jSTypeRegistry37, jSTypeRegistry42, jSTypeRegistry47);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray50 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry27.createUnionType(jSTypeNativeArray50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = objectType56.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { objectType56 };
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry11.createFunctionType(jSType51, jSTypeArray58);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot61 = functionType59.getSlot("");
        boolean boolean62 = functionType59.isInterface();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] { functionType59 };
        com.google.javascript.rhino.Node node64 = jSTypeRegistry2.createOptionalParameters(jSTypeArray63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 50);
        boolean boolean68 = node67.isAssignAdd();
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.EnumType enumType70 = jSTypeRegistry2.createEnumType("function ({78584469}): function (this:me, {412571282}): me", node67, jSType69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList49);
        org.junit.Assert.assertNotNull(jSTypeNativeArray50);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(objectType57);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNull(staticSlot61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isNew();
        boolean boolean12 = node10.isFalse();
        node10.putIntProp((int) '#', (int) '#');
        boolean boolean16 = node10.isReturn();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        java.lang.Object obj26 = node24.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship27 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node10, node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        int int34 = node32.getLineno();
        int int35 = node32.getLength();
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry40.createObjectType(objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        boolean boolean46 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry53.createObjectType(objectType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        boolean boolean74 = jSTypeRegistry73.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList75 = com.google.common.collect.ImmutableList.of(jSTypeRegistry40, jSTypeRegistry45, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode76 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry73.setResolveMode(resolveMode76);
        node32.putProp((int) 'a', (java.lang.Object) resolveMode76);
        node10.addChildToFront(node32);
        node32.setCharno((int) ' ');
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 40 + "'", int34 == 40);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList75);
        org.junit.Assert.assertTrue("'" + resolveMode76 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode76.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        boolean boolean54 = objectType53.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        int int30 = charSequenceList15.size();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator31 = charSequenceList15.spliterator();
        java.lang.Object[] objArray32 = charSequenceList15.toArray();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(charSequenceSpliterator31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, hi!]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node33.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(staticSourceFile34);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        boolean boolean15 = node7.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node7.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        node24.setLength(51);
        com.google.javascript.rhino.Node node27 = node7.useSourceInfoFrom(node24);
        boolean boolean28 = node7.isComma();
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildrenToBack(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry11.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.hasProperty("Named type with empty name component");
        boolean boolean94 = functionType89.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = functionType89.getBindReturnType(37);
        com.google.javascript.rhino.jstype.ObjectType objectType97 = null;
        boolean boolean98 = jSTypeRegistry11.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType96, objectType97);
        com.google.javascript.rhino.jstype.JSType jSType99 = functionType96.collapseUnion();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str2 = jSDocInfo0.getDeprecationReason();
        boolean boolean3 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.lang.String str5 = jSDocInfo0.getMeaning();
        boolean boolean6 = jSDocInfo0.isExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getPropertyType("EQ");
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        boolean boolean65 = jSTypeRegistry64.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        boolean boolean69 = jSTypeRegistry68.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry77.createObjectType(objectType78);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry82.createObjectType(objectType83);
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85, true);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry87.createObjectType(objectType88);
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry92 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90, true);
        boolean boolean93 = jSTypeRegistry92.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList94 = com.google.common.collect.ImmutableList.of(jSTypeRegistry59, jSTypeRegistry64, jSTypeRegistry68, jSTypeRegistry72, jSTypeRegistry77, jSTypeRegistry82, jSTypeRegistry87, jSTypeRegistry92);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray95 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry72.createUnionType(jSTypeNativeArray95);
        com.google.javascript.rhino.jstype.ObjectType objectType97 = jSType96.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair98 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType50, jSType96);
        com.google.javascript.rhino.jstype.JSType jSType99 = typePair98.typeB;
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList94);
        org.junit.Assert.assertNotNull(jSTypeNativeArray95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        boolean boolean15 = node7.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node7.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        node24.setLength(51);
        com.google.javascript.rhino.Node node27 = node7.useSourceInfoFrom(node24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = node27.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function ({78584469}): function (this:me, {412571282}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(12, node48);
        boolean boolean51 = node48.isGetElem();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node48.addChildToFront(node56);
        node48.setOptionalArg(true);
        com.google.javascript.rhino.Node node60 = node7.srcrefTree(node48);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node7.siblings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo62 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeIterable61);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        boolean boolean6 = node4.isHook();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node8.isArrayLit();
        boolean boolean10 = node8.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node8.siblings();
        node8.putBooleanProp(10, true);
        boolean boolean15 = node8.isName();
        node8.setSourceEncodedPositionForTree(38);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12, node26);
        boolean boolean29 = node28.isArrayLit();
        boolean boolean30 = node28.isSwitch();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(12, node36);
        java.lang.Object obj40 = node38.getProp((int) '#');
        com.google.javascript.rhino.Node node41 = node28.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node41);
        int int43 = node20.getIndexOfChild(node41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) '4');
        node20.addChildrenToFront(node45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) 'a', node8, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry11.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.hasProperty("Named type with empty name component");
        boolean boolean94 = functionType89.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = functionType89.getBindReturnType(37);
        com.google.javascript.rhino.jstype.ObjectType objectType97 = null;
        boolean boolean98 = jSTypeRegistry11.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType96, objectType97);
        jSTypeRegistry11.incrementGeneration();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFalse();
        boolean boolean10 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node16.isGetElem();
        com.google.javascript.rhino.Node node20 = node7.srcrefTree(node16);
        node7.setType(29);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        boolean boolean10 = node7.isNull();
        boolean boolean11 = node7.isLabelName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo13 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("InputId: ");
        jSDocInfo0.addSuppression("EQ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue2.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue6.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue7.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue5.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue1.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue14.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue16.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.or(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue13.and(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue7.xor(ternaryValue15);
        boolean boolean22 = ternaryValue7.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        com.google.javascript.rhino.Node node12 = node7.cloneTree();
        boolean boolean13 = node12.isOptionalArg();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12, node27);
        boolean boolean30 = node29.isNew();
        boolean boolean31 = node29.isFalse();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node29);
        node12.addChildrenToFront(node29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo34 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        functionType52.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType52.getParameterType();
        boolean boolean56 = functionType52.isNumberValueType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType52.toMaybeFunctionType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(functionType57);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        boolean boolean11 = charSequenceList8.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor22 = charSequenceList20.iterator();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList3, (java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList26);
        int int30 = charSequenceList15.size();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator31 = charSequenceList15.spliterator();
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList15.replaceAll(charSequenceUnaryOperator32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(charSequenceSpliterator31);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Named type with empty name component");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getLastSibling();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean19 = node13.isEquivalentToTyped(node18);
        boolean boolean20 = node18.isTypeOf();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = node18.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isFunctionPrototypeType();
        int int54 = functionType50.getPropertiesCount();
        boolean boolean55 = functionType50.isConstructor();
        int int56 = functionType50.getPropertiesCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope57 = functionType50.getParentScope();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(jSTypeStaticScope57);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot56 = functionType50.getSlot("");
        boolean boolean57 = functionType50.isGlobalThisType();
        boolean boolean58 = functionType50.matchesObjectContext();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
        org.junit.Assert.assertNull(staticSlot56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
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
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean81 = node80.isObjectLit();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(12, node80);
        boolean boolean83 = node82.isArrayLit();
        boolean boolean84 = node82.isSwitch();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean91 = node90.isObjectLit();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(12, node90);
        java.lang.Object obj94 = node92.getProp((int) '#');
        com.google.javascript.rhino.Node node95 = node82.copyInformationFromForTree(node92);
        com.google.javascript.rhino.Node node96 = node95.getParent();
        boolean boolean97 = node95.isReturn();
        int int98 = charSequenceList12.lastIndexOf((java.lang.Object) boolean97);
        java.lang.Object[] objArray99 = charSequenceList12.toArray();
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(objArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray99), "[, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray99), "[, hi!, , ]");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType50.findPropertyType("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.getParentScope();
        boolean boolean54 = functionType50.hasImplementedInterfaces();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = functionType50.setValidator(jSTypePredicate55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) (byte) 10, 29, (int) (byte) 1, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        java.lang.Object obj18 = node16.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node16.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node21 = node16.cloneTree();
        com.google.javascript.rhino.Node node22 = node7.copyInformationFromForTree(node21);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node7.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator24 = nodeIterable23.spliterator();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(nodeSpliterator24);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(12, node44);
        boolean boolean47 = node46.isArrayLit();
        boolean boolean48 = node46.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node46.siblings();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry30.createInterfaceType("function ({1275564869}): function (this:me, {522090601}): me", node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNull(inputId50);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "InputId: Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isArrayLit();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(12, node18);
        java.lang.Object obj22 = node20.getProp((int) '#');
        com.google.javascript.rhino.Node node23 = node10.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        int int25 = node2.getIndexOfChild(node23);
        boolean boolean26 = node2.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ASSIGN_MOD [, hi!, , ] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildToBack(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        java.lang.Object[] objArray35 = charSequenceList8.toArray();
        boolean boolean36 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        fileLevelJsDocBuilder42.append("EQ");
        boolean boolean45 = charSequenceList4.contains((java.lang.Object) fileLevelJsDocBuilder42);
        java.lang.CharSequence charSequence46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = charSequenceList4.add(charSequence46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor9 = charSequenceList7.iterator();
        int int10 = charSequenceList4.lastIndexOf((java.lang.Object) charSequenceItor9);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor33 = charSequenceList31.iterator();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList40 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList14, (java.lang.Cloneable) charSequenceList19, (java.lang.Cloneable) charSequenceList26, (java.lang.Cloneable) charSequenceList31, (java.lang.Cloneable) charSequenceList37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList14.spliterator();
        boolean boolean42 = charSequenceList4.contains((java.lang.Object) charSequenceList14);
        int int43 = charSequenceList4.size();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        java.lang.Object obj54 = node52.getProp((int) '#');
        boolean boolean55 = node52.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile56 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node52);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(12, node62);
        boolean boolean65 = node62.isGetElem();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node62.addChildToFront(node70);
        com.google.javascript.rhino.Node node72 = node70.getLastSibling();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean76 = node70.isEquivalentToTyped(node75);
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] { node52, node75 };
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) '#', nodeArray77, 0, 4095);
        int int81 = charSequenceList4.indexOf((java.lang.Object) node80);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition82 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean83 = typePosition82.hasBrackets();
        int int84 = typePosition82.getPositionOnEndLine();
        int int85 = typePosition82.getEndLine();
        com.google.javascript.rhino.Node node86 = typePosition82.getItem();
        int int87 = charSequenceList4.lastIndexOf((java.lang.Object) typePosition82);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean89 = jSDocInfo88.hasEnumParameterType();
        boolean boolean90 = jSDocInfo88.hasBaseType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = charSequenceList4.remove((java.lang.Object) jSDocInfo88);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charSequenceItor33);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(cloneableList40);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(staticSourceFile56);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray38 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry15.createUnionType(jSTypeNativeArray38);
        jSTypeRegistry15.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        boolean boolean52 = jSTypeRegistry51.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        boolean boolean56 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry64.createObjectType(objectType65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        boolean boolean80 = jSTypeRegistry79.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList81 = com.google.common.collect.ImmutableList.of(jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry55, jSTypeRegistry59, jSTypeRegistry64, jSTypeRegistry69, jSTypeRegistry74, jSTypeRegistry79);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray82 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry59.createUnionType(jSTypeNativeArray82);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry86.createObjectType(objectType87);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = objectType88.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] { objectType88 };
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry43.createFunctionType(jSType83, jSTypeArray90);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot93 = functionType91.getSlot("");
        boolean boolean94 = functionType91.isFunctionPrototypeType();
        boolean boolean96 = jSTypeRegistry15.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType91, "Not declared as a type name");
        boolean boolean98 = functionType91.isPropertyTypeDeclared("unknown");
        com.google.javascript.rhino.jstype.FunctionType functionType99 = functionType91.getConstructor();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(jSTypeNativeArray38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList81);
        org.junit.Assert.assertNotNull(jSTypeNativeArray82);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNull(staticSlot93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNull(functionType99);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean10 = node6.getBooleanProp(38);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node18.isArrayLit();
        boolean boolean20 = node18.isSwitch();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12, node26);
        java.lang.Object obj30 = node28.getProp((int) '#');
        com.google.javascript.rhino.Node node31 = node18.copyInformationFromForTree(node28);
        boolean boolean32 = node18.isRegExp();
        java.lang.String str33 = node18.toString();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean44 = node43.isObjectLit();
        int int45 = node43.getLineno();
        int int46 = node43.getLength();
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node43);
        java.lang.String str48 = node38.checkTreeEquals(node43);
        boolean boolean49 = node38.isDo();
        boolean boolean50 = node38.isSyntheticBlock();
        int int52 = node38.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        java.util.Set<java.lang.String> strSet54 = node38.getDirectives();
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(46, node6, node18, node38, node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EQ" + "'", str33, "EQ");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 40 + "'", int45 == 40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertNull(strSet54);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        java.lang.String str55 = functionType50.toDebugHashCodeString();
        boolean boolean56 = functionType50.hasInstanceType();
        boolean boolean57 = functionType50.isUnknownType();
        boolean boolean58 = functionType50.hasInstanceType();
        boolean boolean59 = functionType50.isNoObjectType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "function ({713096708}): function (this:me, {787405429}): me" + "'", str55, "function ({713096708}): function (this:me, {787405429}): me");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }
}
