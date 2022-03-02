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
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry2.createDefaultObjectUnion(jSType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSType10.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = functionType12.isNominalConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(functionType12);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry6.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry6.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSType14.dereference();
        boolean boolean16 = objectType15.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = objectType15.getCtorImplementedInterfaces();
        boolean boolean18 = objectType15.isNativeObjectType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cloneableList3.remove((java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.subList((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (10) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.hasOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cloneableList3.addAll((int) 'a', (java.util.Collection<java.lang.Cloneable>) cloneableList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.hasOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isTrue();
        boolean boolean38 = node36.isBreak();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 1, node24, node27, node31, node36, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildToBack(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        int int7 = namePosition5.getStartLine();
        int int8 = cloneableList3.lastIndexOf((java.lang.Object) namePosition5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isFalse();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.hasOneChild();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.isBreak();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) 1, node12, node15, node19, node24, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = cloneableList3.add((java.lang.Cloneable) node24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        node2.removeProp((int) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        node8.removeProp((int) (short) 10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isFalse();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList19 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList23 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node22);
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { node14, node18, node22 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList25 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList25, cloneableArray24);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition27 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str28 = stringPosition27.getItem();
        boolean boolean29 = cloneableList25.remove((java.lang.Object) str28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean36 = node35.isFalse();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isFalse();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean44 = node43.isTrue();
        boolean boolean45 = node43.isBreak();
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { cloneableList25, node32, node35, node39, node43 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList47 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList47, cloneableArray46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = cloneableList47.add((java.lang.Cloneable) node51);
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenAfter(node8, node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(cloneableList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(cloneableList23);
        org.junit.Assert.assertNotNull(cloneableArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cloneableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        int int7 = namePosition5.getStartLine();
        int int8 = cloneableList3.lastIndexOf((java.lang.Object) namePosition5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        boolean boolean14 = cloneableList13.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition15 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int16 = namePosition15.getStartLine();
        int int17 = namePosition15.getStartLine();
        int int18 = cloneableList13.lastIndexOf((java.lang.Object) namePosition15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cloneableList3.addAll((int) (byte) 0, (java.util.Collection<java.lang.Cloneable>) cloneableList13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList24 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node23);
        boolean boolean25 = node23.isString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = node20.removeChildAfter(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(cloneableList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = node2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isFalse();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isTrue();
        boolean boolean38 = node36.hasOneChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isTrue();
        boolean boolean43 = node41.isBreak();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 1, node29, node32, node36, node41, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node47 = node24.useSourceInfoIfMissingFromForTree(node41);
        boolean boolean48 = node24.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = cloneableList3.add((java.lang.Cloneable) node24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node2.getExistingIntProp((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = node39.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean44 = node20.isDefaultCase();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isFalse();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.hasOneChild();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean61 = node60.isTrue();
        boolean boolean62 = node60.isBreak();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 1, node48, node51, node55, node60, (int) (byte) 1, 4095);
        com.google.javascript.rhino.jstype.JSType jSType66 = node65.getJSType();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean74 = node73.isFalse();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean78 = node77.isTrue();
        boolean boolean79 = node77.hasOneChild();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean83 = node82.isTrue();
        boolean boolean84 = node82.isBreak();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) 1, node70, node73, node77, node82, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable88 = node87.children();
        // The following exception was thrown during execution in test generation
        try {
            node20.addChildrenAfter(node65, node87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable88);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.subList(0, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (4095) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isFalse();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean34 = node33.isTrue();
        boolean boolean35 = node33.hasOneChild();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean39 = node38.isTrue();
        boolean boolean40 = node38.isBreak();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 1, node26, node29, node33, node38, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node44 = node21.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node21.isThrow();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isFalse();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean61 = node60.isTrue();
        boolean boolean62 = node60.hasOneChild();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean66 = node65.isTrue();
        boolean boolean67 = node65.isBreak();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (byte) 1, node53, node56, node60, node65, (int) (byte) 1, 4095);
        boolean boolean71 = node53.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        boolean boolean84 = objectType83.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry48.createObjectType("hi!", node53, objectType83);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(40, node21, node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objectType85);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream18 = cloneableList13.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Cloneable> cloneableList21 = cloneableList13.subList((int) (byte) 1, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 29");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableStream18);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isFalse();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isTrue();
        boolean boolean43 = node41.hasOneChild();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isTrue();
        boolean boolean48 = node46.isBreak();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 1, node34, node37, node41, node46, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder52 = node46.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = jSTypeRegistry56.createParameterizedType(objectType71, jSType82);
        java.util.Set set85 = parameterizedType84.getOwnPropertyNames();
        boolean boolean86 = parameterizedType84.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType87 = parameterizedType84.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry2.createFromTypeNodes(node46, "hi!", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(parameterizedType84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(jSType87);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        java.util.function.UnaryOperator<java.lang.Cloneable> cloneableUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            cloneableList35.replaceAll(cloneableUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.hasOneChild();
        node21.addChildrenToFront(node25);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean36 = node35.isFalse();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isTrue();
        boolean boolean41 = node39.hasOneChild();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean45 = node44.isTrue();
        boolean boolean46 = node44.isBreak();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 1, node32, node35, node39, node44, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) '4', node21, node39, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node2.toString(false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = parameterizedType30.toMaybeParameterizedType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{proxy:{proxy:{1874555938}}}" + "'", str50, "{proxy:{proxy:{1874555938}}}");
        org.junit.Assert.assertNotNull(parameterizedType51);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType68 = functionType66.getTopMostDefiningType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node15.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder21.append("{proxy:{proxy:{649633010}}}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85, true);
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType89 = null;
        boolean boolean90 = jSTypeRegistry87.resetImplicitPrototype(jSType88, objectType89);
        com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry87.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType96 = jSType95.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType97 = jSTypeRegistry69.createParameterizedType(objectType84, jSType95);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable98 = parameterizedType97.getCtorExtendedInterfaces();
        boolean boolean99 = functionType66.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(objectType96);
        org.junit.Assert.assertNotNull(parameterizedType97);
        org.junit.Assert.assertNotNull(objectTypeIterable98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        jSTypeRegistry2.forwardDeclareType("Unknown class name");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType6 = jSTypeRegistry2.getNativeObjectType(jSTypeNative5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cloneableList3.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.hasOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 1, node8, node11, node15, node20, (int) (byte) 1, 4095);
        boolean boolean26 = node2.isEquivalentTo(node8);
        boolean boolean27 = node8.isName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isTrue();
        node30.removeProp((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = node8.removeChildAfter(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            node15.setSideEffectFlags((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream18 = cloneableList13.stream();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isFalse();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList30 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node29);
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { node21, node25, node29 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList32 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList32, cloneableArray31);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition34 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str35 = stringPosition34.getItem();
        boolean boolean36 = cloneableList32.remove((java.lang.Object) str35);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream37 = cloneableList32.stream();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean41 = node40.isFalse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList45 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList49 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node48);
        java.lang.Cloneable[] cloneableArray50 = new java.lang.Cloneable[] { node40, node44, node48 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList51 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList51, cloneableArray50);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition53 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str54 = stringPosition53.getItem();
        boolean boolean55 = cloneableList51.remove((java.lang.Object) str54);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream56 = cloneableList51.stream();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isFalse();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList64 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList68 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node67);
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { node59, node63, node67 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList70 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList70, cloneableArray69);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition72 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str73 = stringPosition72.getItem();
        boolean boolean74 = cloneableList70.remove((java.lang.Object) str73);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream75 = cloneableList70.stream();
        com.google.common.collect.ImmutableList<java.util.stream.Stream<java.lang.Cloneable>> cloneableStreamList76 = com.google.common.collect.ImmutableList.of(cloneableStream18, cloneableStream37, cloneableStream56, cloneableStream75);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableStream18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(cloneableList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(cloneableList30);
        org.junit.Assert.assertNotNull(cloneableArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cloneableStream37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(cloneableList45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(cloneableList49);
        org.junit.Assert.assertNotNull(cloneableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cloneableStream56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(cloneableList64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(cloneableList68);
        org.junit.Assert.assertNotNull(cloneableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cloneableStream75);
        org.junit.Assert.assertNotNull(cloneableStreamList76);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isFalse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node16);
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { node8, node12, node16 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList19 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList19, cloneableArray18);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition21 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str22 = stringPosition21.getItem();
        boolean boolean23 = cloneableList19.remove((java.lang.Object) str22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isFalse();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList31 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList35 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node34);
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { node26, node30, node34 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList37 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList37, cloneableArray36);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition39 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str40 = stringPosition39.getItem();
        boolean boolean41 = cloneableList37.remove((java.lang.Object) str40);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream42 = cloneableList37.stream();
        boolean boolean43 = cloneableList19.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = cloneableList3.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(cloneableList17);
        org.junit.Assert.assertNotNull(cloneableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(cloneableList31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(cloneableList35);
        org.junit.Assert.assertNotNull(cloneableArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cloneableStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        boolean boolean7 = node2.isLocalResultCall();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = node2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node7);
        boolean boolean9 = cloneableList8.isEmpty();
        boolean boolean10 = cloneableList8.isEmpty();
        java.lang.Object[] objArray11 = cloneableList8.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cloneableList4.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSType77.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = functionType66.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNull(functionType79);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        int int7 = namePosition5.getStartLine();
        int int8 = cloneableList3.lastIndexOf((java.lang.Object) namePosition5);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList12.asList();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node16);
        boolean boolean18 = cloneableList17.isEmpty();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList22 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node21);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList23 = cloneableList22.asList();
        com.google.common.collect.ImmutableCollection<java.lang.Cloneable> cloneableCollection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Cloneable>> cloneableCollectionList25 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection<java.lang.Cloneable>) cloneableList3, (com.google.common.collect.ImmutableCollection<java.lang.Cloneable>) cloneableList13, (com.google.common.collect.ImmutableCollection<java.lang.Cloneable>) cloneableList17, (com.google.common.collect.ImmutableCollection<java.lang.Cloneable>) cloneableList23, cloneableCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 4");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(cloneableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(cloneableList22);
        org.junit.Assert.assertNotNull(cloneableList23);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.isOr();
        boolean boolean27 = node24.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = jSTypeRegistry30.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        boolean boolean47 = objectType46.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = objectType46.getCtorImplementedInterfaces();
        boolean boolean49 = objectType46.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        boolean boolean62 = objectType61.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = objectType61.getCtorImplementedInterfaces();
        boolean boolean64 = objectType61.isNativeObjectType();
        boolean boolean65 = objectType46.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType61);
        boolean boolean67 = objectType46.hasProperty("hi!");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean75 = node74.isFalse();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean79 = node78.isTrue();
        boolean boolean80 = node78.hasOneChild();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean84 = node83.isTrue();
        boolean boolean85 = node83.isBreak();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 1, node71, node74, node78, node83, (int) (byte) 1, 4095);
        boolean boolean89 = node71.isDelProp();
        boolean boolean90 = node71.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry30.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType46, node71);
        // The following exception was thrown during execution in test generation
        try {
            node20.addChildAfter(node24, node71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(errorReporter34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(functionType91);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        node20.detachChildren();
        com.google.javascript.rhino.InputId inputId22 = null;
        node20.setInputId(inputId22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        boolean boolean22 = node4.isDelProp();
        boolean boolean23 = node4.isIn();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isFalse();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isTrue();
        boolean boolean36 = node34.hasOneChild();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isTrue();
        boolean boolean41 = node39.isBreak();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 1, node27, node30, node34, node39, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(100, node4, node44, 29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { node6, node10, node14 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList17 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList17, cloneableArray16);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition19 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str20 = stringPosition19.getItem();
        boolean boolean21 = cloneableList17.remove((java.lang.Object) str20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isFalse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList33 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node32);
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { node24, node28, node32 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition37 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str38 = stringPosition37.getItem();
        boolean boolean39 = cloneableList35.remove((java.lang.Object) str38);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream40 = cloneableList35.stream();
        boolean boolean41 = cloneableList17.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = cloneableList3.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertNotNull(cloneableArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(cloneableList33);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cloneableStream40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.subList(10, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (10) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        boolean boolean22 = node16.isCase();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(41, node26, (int) (short) 1, 40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList35 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node34);
        boolean boolean36 = node34.isTrue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node16, node29, node31, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(cloneableList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String[] strArray1 = new java.lang.String[] { "Unknown class name" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList2 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strComparableList2);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList12.asList();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList21 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node20);
        boolean boolean22 = cloneableList21.isEmpty();
        boolean boolean23 = cloneableList21.isEmpty();
        java.lang.Object[] objArray24 = cloneableList21.toArray();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList28 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node27);
        boolean boolean29 = cloneableList28.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition30 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int31 = namePosition30.getStartLine();
        int int32 = namePosition30.getStartLine();
        int int33 = cloneableList28.lastIndexOf((java.lang.Object) namePosition30);
        com.google.common.collect.ImmutableCollection[] immutableCollectionArray35 = new com.google.common.collect.ImmutableCollection[5];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableCollection<java.lang.Cloneable>[] cloneableCollectionArray36 = (com.google.common.collect.ImmutableCollection<java.lang.Cloneable>[]) immutableCollectionArray35;
        cloneableCollectionArray36[0] = cloneableList8;
        cloneableCollectionArray36[1] = cloneableList12;
        cloneableCollectionArray36[2] = cloneableList17;
        cloneableCollectionArray36[3] = cloneableList21;
        cloneableCollectionArray36[4] = cloneableList28;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableCollection<java.lang.Cloneable>[] cloneableCollectionArray47 = cloneableList3.toArray(cloneableCollectionArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: com.google.javascript.rhino.Node$StringNode");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(cloneableList17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(cloneableList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(cloneableList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(immutableCollectionArray35);
        org.junit.Assert.assertNotNull(cloneableCollectionArray36);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        java.util.Set<java.lang.String> strSet67 = functionType66.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = null;
        functionType66.setPropertyJSDocInfo("{proxy:{proxy:{649633010}}}", jSDocInfo69);
        java.lang.Iterable iterable71 = functionType66.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType66.getReturnType();
        boolean boolean73 = jSType72.isRecordType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(iterable71);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        boolean boolean54 = objectType51.isEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType55 = objectType51.autoboxesTo();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType55);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Cloneable> cloneableList7 = cloneableList4.subList(40, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (40) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        java.util.Set<java.lang.String> strSet67 = functionType66.getOwnPropertyNames();
        boolean boolean68 = functionType66.isNumberObjectType();
        com.google.javascript.rhino.Node node70 = functionType66.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType66.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(functionType71);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        node20.detachChildren();
        com.google.javascript.rhino.Node node22 = node20.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = node22.isLabelName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode0 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        org.junit.Assert.assertTrue("'" + resolveMode0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode0.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.hasOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 1, node8, node11, node15, node20, (int) (byte) 1, 4095);
        boolean boolean26 = node2.isEquivalentTo(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo27 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        node21.detachChildren();
        com.google.javascript.rhino.Node node23 = node21.removeFirstChild();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.hasOneChild();
        boolean boolean29 = node26.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(2147483647, node23, node26, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean10 = node9.isFalse();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList18 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node17);
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { node9, node13, node17 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList20 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList20, cloneableArray19);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition22 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str23 = stringPosition22.getItem();
        boolean boolean24 = cloneableList20.remove((java.lang.Object) str23);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream25 = cloneableList20.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable26 = cloneableList3.set((int) (byte) 0, (java.lang.Cloneable) cloneableList20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(cloneableList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(cloneableList18);
        org.junit.Assert.assertNotNull(cloneableArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cloneableStream25);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        com.google.javascript.rhino.Node node7 = namePosition5.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray8 = new com.google.javascript.rhino.JSDocInfo.NamePosition[] { namePosition5 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray9 = cloneableList4.toArray(namePositionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: com.google.javascript.rhino.Node$StringNode");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(namePositionArray8);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = jSType33.isBooleanValueType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cloneableList3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId4 = null;
        node3.setInputId(inputId4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor6 = cloneableList4.listIterator(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (12) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setReturnsTainted();
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 0, node3, node8, 49, 49);
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node12.getExistingIntProp((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId13);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = objectType11.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = objectType31.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(objectType31);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.lang.Object[] objArray6 = cloneableList3.toArray();
        java.lang.Object[] objArray7 = cloneableList3.toArray();
        java.util.Collection<java.lang.Cloneable> cloneableCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cloneableList3.removeAll(cloneableCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSType23.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType26 = jSType23.restrictByNotNullOrUndefined();
        boolean boolean27 = objectType11.isSubtype(jSType26);
        boolean boolean28 = objectType11.isStringValueType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType29 = objectType11.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType30 = parameterizedType29.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNull(functionType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(parameterizedType29);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node39, "Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo43 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId5 = null;
        node4.setInputId(inputId5);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        boolean boolean12 = node10.isString();
        node10.setSourceFileForTesting("hi!");
        boolean boolean15 = node10.isLocalResultCall();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.hasOneChild();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node19, node22, node26, node31, (int) (byte) 1, 4095);
        node36.detachChildren();
        com.google.javascript.rhino.Node node38 = node36.removeFirstChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList42 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node41);
        boolean boolean43 = node41.isFalse();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node4, node10, node38, node41 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(39, nodeArray44, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(cloneableList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType66.getReturnType();
        java.util.Set<java.lang.String> strSet68 = functionType66.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            functionType69.clearCachedValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(functionType69);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        jSTypeRegistry2.clearNamedTypes();
        boolean boolean55 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry2.createInterfaceType("({proxy:{proxy:{1321644185}}})", node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry2.createUnionType(jSTypeArray8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.hasOneChild();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.isBreak();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node13, node16, node20, node25, (int) (byte) 1, 4095);
        boolean boolean31 = node16.isParamList();
        node16.addSuppression("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType65 = jSTypeRegistry37.createParameterizedType(objectType52, jSType63);
        java.util.Set set66 = parameterizedType65.getOwnPropertyNames();
        boolean boolean67 = parameterizedType65.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        boolean boolean73 = jSTypeRegistry70.resetImplicitPrototype(jSType71, objectType72);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry70.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSType78.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSType78.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSType78.restrictByNotNullOrUndefined();
        boolean boolean82 = parameterizedType65.canAssignTo(jSType78);
        boolean boolean84 = parameterizedType65.isPropertyTypeInferred("");
        boolean boolean85 = parameterizedType65.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = parameterizedType65.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType88 = parameterizedType65.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean89 = parameterizedType65.isNominalType();
        boolean boolean90 = parameterizedType65.isNominalType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.createFromTypeNodes(node16, "Named type with empty name component", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(parameterizedType65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNull(functionType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        boolean boolean21 = node6.isParamList();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.hasOneChild();
        boolean boolean28 = node25.isVarArgs();
        int int29 = node25.getType();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node36 = node32.useSourceInfoFromForTree(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) '#', node25, node32, (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildrenToFront(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = jSTypeRegistry56.createParameterizedType(objectType71, jSType82);
        java.util.Set set85 = parameterizedType84.getOwnPropertyNames();
        boolean boolean86 = parameterizedType84.isNoObjectType();
        boolean boolean87 = parameterizedType84.isAllType();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean90 = objectType52.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType84, node89);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType84.getImplicitPrototype();
        boolean boolean92 = parameterizedType35.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(parameterizedType35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(parameterizedType84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(objectType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node20.siblings();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isFalse();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.hasOneChild();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean61 = node60.isTrue();
        boolean boolean62 = node60.isBreak();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 1, node48, node51, node55, node60, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean70 = node69.isTrue();
        boolean boolean71 = node69.hasOneChild();
        node65.addChildrenToFront(node69);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean80 = node79.isFalse();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean84 = node83.isTrue();
        boolean boolean85 = node83.hasOneChild();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean89 = node88.isTrue();
        boolean boolean90 = node88.isBreak();
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) (byte) 1, node76, node79, node83, node88, (int) (byte) 1, 4095);
        node93.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceChild(node69, node93);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.lang.Object[] objArray6 = cloneableList3.toArray();
        java.lang.Object[] objArray7 = cloneableList3.toArray();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isFalse();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isTrue();
        boolean boolean20 = node18.hasOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isTrue();
        boolean boolean25 = node23.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 1, node11, node14, node18, node23, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isFalse();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean41 = node40.isTrue();
        boolean boolean42 = node40.hasOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean46 = node45.isTrue();
        boolean boolean47 = node45.isBreak();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) 1, node33, node36, node40, node45, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node51 = node28.useSourceInfoIfMissingFromForTree(node45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = cloneableList3.remove((java.lang.Object) node51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder1 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, true);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        boolean boolean7 = jSTypeRegistry4.resetImplicitPrototype(jSType5, objectType6);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSType12.dereference();
        boolean boolean14 = objectType13.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType13.getCtorImplementedInterfaces();
        boolean boolean16 = objectType13.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder17 = objectTypeBuilder1.add(objectType13);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType>> objectTypeBuilderList18 = com.google.common.collect.ImmutableList.of(objectTypeBuilder0, objectTypeBuilder17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        boolean boolean25 = jSTypeRegistry21.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = objectType37.getCtorImplementedInterfaces();
        boolean boolean40 = objectType37.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        boolean boolean53 = objectType52.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = objectType52.getCtorImplementedInterfaces();
        boolean boolean55 = objectType52.isNativeObjectType();
        boolean boolean56 = objectType37.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType52);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry21.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType52, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry64.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSType72.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = null;
        boolean boolean80 = jSTypeRegistry77.resetImplicitPrototype(jSType78, objectType79);
        boolean boolean81 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        jSTypeRegistry77.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry77.createUnionType(jSTypeArray83);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry21.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType73, false, jSTypeArray83);
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType85.getReturnType();
        java.util.Set<java.lang.String> strSet87 = functionType85.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType88 = functionType85.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder89 = objectTypeBuilder0.add((com.google.javascript.rhino.jstype.ObjectType) functionType88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeBuilder0);
        org.junit.Assert.assertNotNull(objectTypeBuilder1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeBuilder17);
        org.junit.Assert.assertNotNull(objectTypeBuilderList18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNull(functionType88);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList25 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node28);
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { node20, node24, node28 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList31 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31, cloneableArray30);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition33 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str34 = stringPosition33.getItem();
        boolean boolean35 = cloneableList31.remove((java.lang.Object) str34);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream36 = cloneableList31.stream();
        boolean boolean37 = cloneableList13.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator38 = cloneableList13.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean50 = node49.isFalse();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isTrue();
        boolean boolean55 = node53.hasOneChild();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean59 = node58.isTrue();
        boolean boolean60 = node58.isBreak();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 1, node46, node49, node53, node58, (int) (byte) 1, 4095);
        boolean boolean64 = node46.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry41.createObjectType("hi!", node46, objectType76);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        boolean boolean84 = jSTypeRegistry81.resetImplicitPrototype(jSType82, objectType83);
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry81.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSType89.dereference();
        boolean boolean91 = objectType90.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection92 = jSTypeRegistry41.getDirectImplementors(objectType90);
        jSTypeRegistry41.clearNamedTypes();
        boolean boolean94 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        boolean boolean95 = cloneableList13.remove((java.lang.Object) jSTypeRegistry41);
        java.lang.Object[] objArray96 = cloneableList13.toArray();
        java.util.function.UnaryOperator<java.lang.Cloneable> cloneableUnaryOperator97 = null;
        // The following exception was thrown during execution in test generation
        try {
            cloneableList13.replaceAll(cloneableUnaryOperator97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(cloneableList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(cloneableArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cloneableStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cloneableSpliterator38);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(markerList0);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        boolean boolean5 = node4.isAnd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean13 = node12.isFalse();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.hasOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isTrue();
        boolean boolean23 = node21.isBreak();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 1, node9, node12, node16, node21, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isTrue();
        boolean boolean32 = node30.hasOneChild();
        node26.addChildrenToFront(node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean41 = node40.isFalse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean45 = node44.isTrue();
        boolean boolean46 = node44.hasOneChild();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean50 = node49.isTrue();
        boolean boolean51 = node49.isBreak();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) 1, node37, node40, node44, node49, (int) (byte) 1, 4095);
        java.lang.String str55 = node40.getString();
        node40.setLineno(39);
        node40.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(49, node4, node30, node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType66.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node20.siblings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean44 = node20.isDefaultCase();
        node20.putIntProp((int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = node20.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = parameterizedType30.getJSDocInfo();
        parameterizedType30.clearCachedValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(jSDocInfo32);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream18 = cloneableList13.stream();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList22 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node21);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList23 = cloneableList22.asList();
        boolean boolean24 = cloneableList22.isEmpty();
        boolean boolean25 = cloneableList13.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Cloneable> cloneableItor27 = cloneableList13.listIterator(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 41");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableStream18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(cloneableList22);
        org.junit.Assert.assertNotNull(cloneableList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node6 = node2.useSourceInfoFromForTree(node5);
        boolean boolean7 = node2.isAdd();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isFalse();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isTrue();
        boolean boolean20 = node18.hasOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isTrue();
        boolean boolean25 = node23.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 1, node11, node14, node18, node23, (int) (byte) 1, 4095);
        java.lang.String str29 = node14.getString();
        boolean boolean30 = node14.isParamList();
        boolean boolean31 = node14.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenToBack(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cloneableList3.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable8 = cloneableList3.remove(49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        java.util.Set<java.lang.String> strSet67 = functionType66.getOwnPropertyNames();
        boolean boolean68 = functionType66.isNumberObjectType();
        com.google.javascript.rhino.Node node70 = functionType66.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType71.getImplicitPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(functionType71);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean46 = node45.isQuotedString();
        node45.setWasEmptyNode(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = new com.google.javascript.rhino.JSTypeExpression(node45, "{proxy:{proxy:{1321644185}}}");
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(43);
        // The following exception was thrown during execution in test generation
        try {
            node43.replaceChild(node45, node52);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.forwardDeclareType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.isNoObjectType();
        boolean boolean39 = parameterizedType36.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType36);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = parameterizedType36.setValidator(jSTypePredicate41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectType40);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = com.google.javascript.rhino.Node.NO_SIDE_EFFECTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor41 = cloneableList35.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            cloneableItor41.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cloneableItor41);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.hasOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 1, node8, node11, node15, node20, (int) (byte) 1, 4095);
        boolean boolean26 = node2.isEquivalentTo(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = node2.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        boolean boolean21 = node3.isDelProp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo22 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        node60.detachChildren();
        com.google.javascript.rhino.InputId inputId62 = null;
        node60.setInputId(inputId62);
        com.google.javascript.rhino.Node node64 = node7.copyInformationFrom(node60);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList68 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node67);
        boolean boolean69 = node67.isString();
        node67.setSourceFileForTesting("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node72 = node64.removeChildAfter(node67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(cloneableList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        java.lang.String str61 = node46.getString();
        boolean boolean62 = node46.isParamList();
        java.util.Set<java.lang.String> strSet63 = node46.getDirectives();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = cloneableList4.add((java.lang.Cloneable) node46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(parameterizedType35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(strSet63);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        boolean boolean39 = objectType18.hasProperty("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        boolean boolean61 = node43.isDelProp();
        boolean boolean62 = node43.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType18, node43);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType63.getReturnType();
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList65 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType63.setImplementedInterfaces(objectTypeList65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(jSType64);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        boolean boolean10 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry9.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        boolean boolean25 = objectType24.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = objectType24.getCtorImplementedInterfaces();
        boolean boolean27 = objectType24.isNativeObjectType();
        jSTypeRegistry9.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry31.resetImplicitPrototype(jSType32, objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry49.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSType57.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = jSTypeRegistry31.createParameterizedType(objectType46, jSType57);
        java.util.Set set60 = parameterizedType59.getOwnPropertyNames();
        boolean boolean61 = parameterizedType59.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry64.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSType72.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSType72.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSType72.restrictByNotNullOrUndefined();
        boolean boolean76 = parameterizedType59.canAssignTo(jSType72);
        boolean boolean78 = parameterizedType59.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry9.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType59, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean85 = parameterizedType59.isPropertyTypeDeclared("unknown");
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType59, jSTypeList86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(parameterizedType59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node1, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int int0 = com.google.javascript.rhino.Node.DECR_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node7);
        boolean boolean9 = cloneableList8.isEmpty();
        boolean boolean10 = cloneableList8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cloneableList3.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode54 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry2.setResolveMode(resolveMode54);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry2.getNativeType(jSTypeNative56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection53);
        org.junit.Assert.assertTrue("'" + resolveMode54 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode54.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        boolean boolean32 = objectType11.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType33 = objectType11.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        boolean boolean71 = jSTypeRegistry68.resetImplicitPrototype(jSType69, objectType70);
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry68.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSType76.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry50.createParameterizedType(objectType65, jSType76);
        java.util.Set set79 = parameterizedType78.getOwnPropertyNames();
        boolean boolean80 = parameterizedType78.isNoObjectType();
        boolean boolean81 = parameterizedType78.isAllType();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean84 = objectType46.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType78, node83);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType85 = jSType33.resolve(errorReporter34, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(parameterizedType78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        boolean boolean39 = objectType18.hasProperty("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        boolean boolean61 = node43.isDelProp();
        boolean boolean62 = node43.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType18, node43);
        com.google.javascript.rhino.jstype.TemplateType templateType64 = objectType18.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = templateType64.isConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNull(templateType64);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue2.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue0.xor(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(41, node3, (int) (short) 1, 40);
        int int7 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isFalse();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isTrue();
        boolean boolean20 = node18.hasOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isTrue();
        boolean boolean25 = node23.isBreak();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 1, node11, node14, node18, node23, (int) (byte) 1, 4095);
        java.lang.String str29 = node14.getString();
        boolean boolean30 = node14.isParamList();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isFalse();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isTrue();
        boolean boolean43 = node41.hasOneChild();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isTrue();
        boolean boolean48 = node46.isBreak();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 1, node34, node37, node41, node46, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildBefore(node14, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry2.getNativeObjectType(jSTypeNative10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry6.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = jSTypeRegistry6.getErrorReporter();
        jSTypeRegistry6.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.hasOneChild();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node19, node22, node26, node31, (int) (byte) 1, 4095);
        boolean boolean37 = node19.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        boolean boolean50 = objectType49.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry14.createObjectType("hi!", node19, objectType49);
        boolean boolean52 = objectType49.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        objectType49.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry6.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType49, false, jSTypeArray56);
        com.google.javascript.rhino.Node node58 = jSTypeRegistry2.createParameters(jSTypeArray56);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList62 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node61);
        com.google.javascript.rhino.jstype.JSType jSType63 = node61.getJSType();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId68 = null;
        node67.setInputId(inputId68);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder70 = node67.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            node58.addChildBefore(node61, node67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(errorReporter10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(cloneableList62);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder70);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream18 = cloneableList13.stream();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        boolean boolean22 = cloneableList13.add((java.lang.Cloneable) node21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable24 = cloneableList13.remove(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 48, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableStream18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = parameterizedType30.toObjectType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNull(functionType45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objectType48);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = com.google.javascript.rhino.Node.IS_DISPATCHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 47 + "'", int0 == 47);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean18 = node17.isFalse();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isTrue();
        boolean boolean23 = node21.hasOneChild();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.isBreak();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node14, node17, node21, node26, (int) (byte) 1, 4095);
        boolean boolean32 = node8.isEquivalentTo(node14);
        boolean boolean33 = node14.isName();
        // The following exception was thrown during execution in test generation
        try {
            cloneableList3.add(42, (java.lang.Cloneable) node14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor8 = cloneableList3.listIterator(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (4095) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableStream6);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor41 = cloneableList35.listIterator();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean46 = node45.isFalse();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList50 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList54 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node53);
        java.lang.Cloneable[] cloneableArray55 = new java.lang.Cloneable[] { node45, node49, node53 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList56 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList56, cloneableArray55);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition58 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str59 = stringPosition58.getItem();
        boolean boolean60 = cloneableList56.remove((java.lang.Object) str59);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isFalse();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList68 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node67);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList72 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node71);
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { node63, node67, node71 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList74 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList74, cloneableArray73);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition76 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str77 = stringPosition76.getItem();
        boolean boolean78 = cloneableList74.remove((java.lang.Object) str77);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream79 = cloneableList74.stream();
        boolean boolean80 = cloneableList56.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList74);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator81 = cloneableList56.spliterator();
        boolean boolean82 = cloneableList56.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable83 = cloneableList35.set(2147483647, (java.lang.Cloneable) cloneableList56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cloneableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cloneableItor41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(cloneableList50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(cloneableList54);
        org.junit.Assert.assertNotNull(cloneableArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(cloneableList68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(cloneableList72);
        org.junit.Assert.assertNotNull(cloneableArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(cloneableStream79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(cloneableSpliterator81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean14 = node13.isFalse();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean18 = node17.isTrue();
        boolean boolean19 = node17.hasOneChild();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isTrue();
        boolean boolean24 = node22.isBreak();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 1, node10, node13, node17, node22, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean36 = node35.isFalse();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isTrue();
        boolean boolean41 = node39.hasOneChild();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean45 = node44.isTrue();
        boolean boolean46 = node44.isBreak();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 1, node32, node35, node39, node44, (int) (byte) 1, 4095);
        node49.detachChildren();
        node49.setVarArgs(true);
        node27.addChildToFront(node49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = cloneableList6.add((java.lang.Cloneable) node27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.isInterface();
        java.lang.String str4 = jSDocInfo2.getOriginalCommentString();
        boolean boolean5 = jSDocInfo2.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isInterface();
        jSDocInfo6.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isInterface();
        java.lang.String str12 = jSDocInfo10.getOriginalCommentString();
        boolean boolean13 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isInterface();
        boolean boolean16 = jSDocInfo14.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo14.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean19 = jSDocInfo18.isInterface();
        jSDocInfo18.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.isInterface();
        boolean boolean24 = jSDocInfo22.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isInterface();
        boolean boolean27 = jSDocInfo25.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo25.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isInterface();
        boolean boolean31 = jSDocInfo29.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo29.getEnumParameterType();
        boolean boolean33 = jSDocInfo29.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.isInterface();
        java.lang.String str36 = jSDocInfo34.getOriginalCommentString();
        boolean boolean37 = jSDocInfo34.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.isInterface();
        java.lang.String str40 = jSDocInfo38.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo38.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean43 = jSDocInfo42.isInterface();
        jSDocInfo42.setLicense("");
        boolean boolean46 = jSDocInfo42.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isInterface();
        jSDocInfo47.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.isInterface();
        boolean boolean53 = jSDocInfo51.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = jSDocInfo51.getEnumParameterType();
        boolean boolean55 = jSDocInfo51.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray56 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo47, jSDocInfo51 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList57 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo2, jSDocInfo6, jSDocInfo10, jSDocInfo14, jSDocInfo18, jSDocInfo22, jSDocInfo25, jSDocInfo29, jSDocInfo34, jSDocInfo38, jSDocInfo42, jSDocInfoArray56);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo2.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(jSTypeExpression41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jSTypeExpression54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoArray56);
        org.junit.Assert.assertNotNull(jSDocInfoList57);
        org.junit.Assert.assertNull(jSTypeExpression58);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        boolean boolean5 = node2.isScript();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isString();
        node8.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = node2.srcref(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        node15.setVarArgs(true);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            node8.addChildAfter(node15, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        node42.detachChildren();
        node42.setVarArgs(true);
        node20.addChildToFront(node42);
        node20.putBooleanProp(45, false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.asList();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags6.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cloneableList5.remove((java.lang.Object) sideEffectFlags6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType4 = jSTypeRegistry2.createNullableType(jSType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        int int7 = namePosition5.getStartLine();
        int int8 = cloneableList3.lastIndexOf((java.lang.Object) namePosition5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Cloneable> cloneableList11 = cloneableList3.subList((int) 'a', 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (97) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType35.collapseUnion();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(parameterizedType35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType40);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node3);
        boolean boolean5 = node3.isFalse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean13 = node12.isFalse();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.hasOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isTrue();
        boolean boolean23 = node21.isBreak();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 1, node9, node12, node16, node21, (int) (byte) 1, 4095);
        boolean boolean27 = node3.isEquivalentTo(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isTrue();
        boolean boolean32 = node30.isBreak();
        boolean boolean33 = node30.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node30);
        boolean boolean35 = node30.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:{proxy:{69867283}}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = jSTypeRegistry11.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry18.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSType26.dereference();
        boolean boolean28 = objectType27.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = objectType27.getCtorImplementedInterfaces();
        boolean boolean30 = objectType27.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        boolean boolean43 = objectType42.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = objectType42.getCtorImplementedInterfaces();
        boolean boolean45 = objectType42.isNativeObjectType();
        boolean boolean46 = objectType27.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType42);
        boolean boolean48 = objectType27.hasProperty("hi!");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isFalse();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isTrue();
        boolean boolean61 = node59.hasOneChild();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean65 = node64.isTrue();
        boolean boolean66 = node64.isBreak();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 1, node52, node55, node59, node64, (int) (byte) 1, 4095);
        boolean boolean70 = node52.isDelProp();
        boolean boolean71 = node52.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType27, node52);
        boolean boolean74 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType72, "function (): {proxy:{1288677244}}");
        jSTypeRegistry2.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = jSTypeRegistry2.getEachReferenceTypeWithProperty("");
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        com.google.javascript.rhino.Node node83 = node82.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry2.createInterfaceType("{proxy:{proxy:{1168420562}}}", node82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNull(errorReporter8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(node83);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:{proxy:{649633010}}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.toObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(parameterizedType35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(functionType41);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = objectType55.setValidator(jSTypePredicate56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection53);
        org.junit.Assert.assertNotNull(objectType55);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        java.lang.Object obj5 = node3.getProp(30);
        boolean boolean6 = node3.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.hasOneChild();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.isBreak();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node13, node16, node20, node25, (int) (byte) 1, 4095);
        boolean boolean31 = node30.isGetProp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry2.createInterfaceType("({proxy:{proxy:{1874555938}}})", node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNull(errorReporter8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.lang.Cloneable cloneable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable8 = cloneableList3.set(54, cloneable7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean44 = node20.isDefaultCase();
        boolean boolean45 = node20.isAssignAdd();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags46 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags46.setThrows();
        sideEffectFlags46.setMutatesGlobalState();
        sideEffectFlags46.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags(sideEffectFlags46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.InputId inputId1 = com.google.javascript.jscomp.NodeUtil.getInputId(node0);
        org.junit.Assert.assertNull(inputId1);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.hasOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.isBreak();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 1, node8, node11, node15, node20, (int) (byte) 1, 4095);
        boolean boolean26 = node2.isEquivalentTo(node8);
        com.google.javascript.rhino.Node node27 = node2.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder28 = node27.new FileLevelJsDocBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.rhino.Node$FileLevelJsDocBuilder with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            cloneableList3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableStream6);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = jSType52.hasDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNull(functionType45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType52);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList25 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node28);
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { node20, node24, node28 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList31 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31, cloneableArray30);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition33 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str34 = stringPosition33.getItem();
        boolean boolean35 = cloneableList31.remove((java.lang.Object) str34);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream36 = cloneableList31.stream();
        boolean boolean37 = cloneableList13.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator38 = cloneableList13.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean50 = node49.isFalse();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isTrue();
        boolean boolean55 = node53.hasOneChild();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean59 = node58.isTrue();
        boolean boolean60 = node58.isBreak();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 1, node46, node49, node53, node58, (int) (byte) 1, 4095);
        boolean boolean64 = node46.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry41.createObjectType("hi!", node46, objectType76);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        boolean boolean84 = jSTypeRegistry81.resetImplicitPrototype(jSType82, objectType83);
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry81.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSType89.dereference();
        boolean boolean91 = objectType90.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection92 = jSTypeRegistry41.getDirectImplementors(objectType90);
        jSTypeRegistry41.clearNamedTypes();
        boolean boolean94 = jSTypeRegistry41.shouldTolerateUndefinedValues();
        boolean boolean95 = cloneableList13.remove((java.lang.Object) jSTypeRegistry41);
        com.google.javascript.rhino.Node node97 = com.google.javascript.rhino.Node.newNumber((double) 0L);
        boolean boolean98 = cloneableList13.equals((java.lang.Object) node97);
        boolean boolean99 = node97.isFor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(cloneableList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(cloneableArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cloneableStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cloneableSpliterator38);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = jSType33.isGlobalThisType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = jSTypeRegistry11.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry18.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSType26.dereference();
        boolean boolean28 = objectType27.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = objectType27.getCtorImplementedInterfaces();
        boolean boolean30 = objectType27.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        boolean boolean43 = objectType42.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = objectType42.getCtorImplementedInterfaces();
        boolean boolean45 = objectType42.isNativeObjectType();
        boolean boolean46 = objectType27.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType42);
        boolean boolean48 = objectType27.hasProperty("hi!");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isFalse();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isTrue();
        boolean boolean61 = node59.hasOneChild();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean65 = node64.isTrue();
        boolean boolean66 = node64.isBreak();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 1, node52, node55, node59, node64, (int) (byte) 1, 4095);
        boolean boolean70 = node52.isDelProp();
        boolean boolean71 = node52.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType27, node52);
        boolean boolean74 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType72, "function (): {proxy:{1288677244}}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType72.getTopMostDefiningType("{proxy:{proxy:{2144970728}}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNull(errorReporter8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = jSTypeRegistry10.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        boolean boolean42 = objectType41.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = objectType41.getCtorImplementedInterfaces();
        boolean boolean44 = objectType41.isNativeObjectType();
        boolean boolean45 = objectType26.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType41);
        boolean boolean47 = objectType26.hasProperty("hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean55 = node54.isFalse();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean59 = node58.isTrue();
        boolean boolean60 = node58.hasOneChild();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isTrue();
        boolean boolean65 = node63.isBreak();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) 1, node51, node54, node58, node63, (int) (byte) 1, 4095);
        boolean boolean69 = node51.isDelProp();
        boolean boolean70 = node51.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry10.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType26, node51);
        com.google.javascript.rhino.Node node72 = functionType71.getSource();
        boolean boolean73 = functionType71.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType71.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionType74);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        boolean boolean39 = objectType18.hasProperty("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        boolean boolean61 = node43.isDelProp();
        boolean boolean62 = node43.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType18, node43);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType63.getReturnType();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType63.getImplicitPrototype();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate66 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = objectType65.setValidator(jSTypePredicate66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(objectType65);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = objectType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = jSTypeRegistry34.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        boolean boolean51 = objectType50.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = objectType50.getCtorImplementedInterfaces();
        boolean boolean53 = objectType50.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        boolean boolean66 = objectType65.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = objectType65.getCtorImplementedInterfaces();
        boolean boolean68 = objectType65.isNativeObjectType();
        boolean boolean69 = objectType50.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType65);
        boolean boolean71 = objectType50.hasProperty("hi!");
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean79 = node78.isFalse();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean83 = node82.isTrue();
        boolean boolean84 = node82.hasOneChild();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean88 = node87.isTrue();
        boolean boolean89 = node87.isBreak();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((int) (byte) 1, node75, node78, node82, node87, (int) (byte) 1, 4095);
        boolean boolean93 = node75.isDelProp();
        boolean boolean94 = node75.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry34.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType50, node75);
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType95.getReturnType();
        int int97 = functionType95.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType98 = objectType11.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType95);
        com.google.javascript.rhino.jstype.ObjectType objectType99 = functionType95.getPrototype();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(errorReporter38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.asList();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList9.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        boolean boolean31 = objectType30.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = objectType30.getCtorImplementedInterfaces();
        boolean boolean33 = objectType30.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = objectType45.getCtorImplementedInterfaces();
        boolean boolean48 = objectType45.isNativeObjectType();
        boolean boolean49 = objectType30.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry14.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType45, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        boolean boolean73 = jSTypeRegistry70.resetImplicitPrototype(jSType71, objectType72);
        boolean boolean74 = jSTypeRegistry70.shouldTolerateUndefinedValues();
        jSTypeRegistry70.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry70.createUnionType(jSTypeArray76);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry14.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType66, false, jSTypeArray76);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType78.getBindReturnType(100);
        int int81 = functionType80.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType80.getRestrictedTypeGivenToBooleanOutcome(true);
        int int86 = cloneableList9.lastIndexOf((java.lang.Object) jSType85);
        boolean boolean87 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList9);
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean91 = node90.isTrue();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable92 = node90.siblings();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection93 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node90);
        boolean boolean94 = cloneableList9.contains((java.lang.Object) node90);
        java.lang.Throwable[] throwableArray95 = new java.lang.Throwable[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable[] throwableArray96 = cloneableList9.toArray(throwableArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: com.google.javascript.rhino.Node$StringNode");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(nodeIterable92);
        org.junit.Assert.assertNotNull(nodeCollection93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable6 = cloneableList4.remove(51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList25 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node28);
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { node20, node24, node28 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList31 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31, cloneableArray30);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition33 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str34 = stringPosition33.getItem();
        boolean boolean35 = cloneableList31.remove((java.lang.Object) str34);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream36 = cloneableList31.stream();
        boolean boolean37 = cloneableList13.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList31);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean45 = node44.isFalse();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean49 = node48.isTrue();
        boolean boolean50 = node48.hasOneChild();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isTrue();
        boolean boolean55 = node53.isBreak();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 1, node41, node44, node48, node53, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isFalse();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean71 = node70.isTrue();
        boolean boolean72 = node70.hasOneChild();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean76 = node75.isTrue();
        boolean boolean77 = node75.isBreak();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) 1, node63, node66, node70, node75, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node81 = node58.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean82 = cloneableList31.add((java.lang.Cloneable) node58);
        java.lang.Appendable appendable83 = null;
        // The following exception was thrown during execution in test generation
        try {
            node58.appendStringTree(appendable83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(cloneableList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(cloneableList29);
        org.junit.Assert.assertNotNull(cloneableArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cloneableStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        java.util.Set<java.lang.String> strSet67 = functionType66.getOwnPropertyNames();
        boolean boolean68 = functionType66.isNumberObjectType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = functionType66.getSubTypes();
        boolean boolean70 = functionType66.isConstructor();
        boolean boolean71 = functionType66.isNativeObjectType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionTypeList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor7 = cloneableList3.listIterator();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        boolean boolean12 = cloneableList11.isEmpty();
        boolean boolean13 = cloneableList11.isEmpty();
        java.lang.Object[] objArray14 = cloneableList11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cloneableList3.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableStream6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node6 = node2.useSourceInfoFromForTree(node5);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        java.lang.Object obj14 = node12.getProp(30);
        node8.addChildrenToFront(node12);
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenToBack(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean5 = node4.isTrue();
        boolean boolean6 = node4.isOr();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean10 = node9.isTrue();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 0, node4, node9, 49, 49);
        boolean boolean14 = node4.isInc();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = jSTypeRegistry17.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        boolean boolean49 = objectType48.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = objectType48.getCtorImplementedInterfaces();
        boolean boolean51 = objectType48.isNativeObjectType();
        boolean boolean52 = objectType33.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType48);
        boolean boolean54 = objectType33.hasProperty("hi!");
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean62 = node61.isFalse();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean66 = node65.isTrue();
        boolean boolean67 = node65.hasOneChild();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean71 = node70.isTrue();
        boolean boolean72 = node70.isBreak();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 1, node58, node61, node65, node70, (int) (byte) 1, 4095);
        boolean boolean76 = node58.isDelProp();
        boolean boolean77 = node58.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry17.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType33, node58);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node58);
        com.google.javascript.rhino.Node node80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(42, node4, node58, node80, 43, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry2.getNativeObjectType(jSTypeNative8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("InputId: .<>");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.hasOneChild();
        boolean boolean6 = node3.isVarArgs();
        int int7 = node3.getType();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node14 = node10.useSourceInfoFromForTree(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) '#', node3, node10, (int) (byte) 100, (int) (short) 10);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.isOr();
        boolean boolean23 = node20.isSetterDef();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        node26.removeProp((int) (short) 10);
        boolean boolean30 = node26.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node10.addChildBefore(node20, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry33.createParameterizedType(objectType48, jSType59);
        java.util.Set set62 = parameterizedType61.getOwnPropertyNames();
        boolean boolean63 = parameterizedType30.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(parameterizedType61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType66.getReturnType();
        java.util.Set<java.lang.String> strSet68 = functionType66.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable70 = functionType69.getCtorImplementedInterfaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(functionType69);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        node60.detachChildren();
        com.google.javascript.rhino.InputId inputId62 = null;
        node60.setInputId(inputId62);
        com.google.javascript.rhino.Node node64 = node7.copyInformationFrom(node60);
        int int66 = node7.getIntProp(36);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor7 = cloneableList3.listIterator();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = cloneableList11.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList11.asList();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node16);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList18 = cloneableList17.asList();
        boolean boolean19 = cloneableList17.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        boolean boolean25 = jSTypeRegistry22.resetImplicitPrototype(jSType23, objectType24);
        boolean boolean26 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        boolean boolean39 = objectType38.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = objectType38.getCtorImplementedInterfaces();
        boolean boolean41 = objectType38.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        boolean boolean54 = objectType53.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = objectType53.getCtorImplementedInterfaces();
        boolean boolean56 = objectType53.isNativeObjectType();
        boolean boolean57 = objectType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType53);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry22.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType53, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        boolean boolean81 = jSTypeRegistry78.resetImplicitPrototype(jSType79, objectType80);
        boolean boolean82 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        jSTypeRegistry78.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry78.createUnionType(jSTypeArray84);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry22.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType74, false, jSTypeArray84);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = functionType86.getBindReturnType(100);
        int int89 = functionType88.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType91 = functionType88.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType88.getRestrictedTypeGivenToBooleanOutcome(true);
        int int94 = cloneableList17.lastIndexOf((java.lang.Object) jSType93);
        boolean boolean95 = cloneableList11.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList17);
        int int97 = cloneableList17.indexOf((java.lang.Object) 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = cloneableList3.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableStream6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(cloneableList17);
        org.junit.Assert.assertNotNull(cloneableList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream18 = cloneableList13.stream();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList22 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node21);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList23 = cloneableList22.asList();
        boolean boolean24 = cloneableList22.isEmpty();
        boolean boolean25 = cloneableList13.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList33 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList37 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node36);
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { node28, node32, node36 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList39 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList39, cloneableArray38);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition41 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str42 = stringPosition41.getItem();
        boolean boolean43 = cloneableList39.remove((java.lang.Object) str42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean50 = node49.isFalse();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isFalse();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isTrue();
        boolean boolean59 = node57.isBreak();
        java.lang.Cloneable[] cloneableArray60 = new java.lang.Cloneable[] { cloneableList39, node46, node49, node53, node57 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList61 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList61, cloneableArray60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean66 = cloneableList61.add((java.lang.Cloneable) node65);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor67 = cloneableList61.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = cloneableList22.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableStream18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(cloneableList22);
        org.junit.Assert.assertNotNull(cloneableList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(cloneableList33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(cloneableList37);
        org.junit.Assert.assertNotNull(cloneableArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cloneableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(cloneableItor67);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        boolean boolean3 = booleanLiteralSet1.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setThrows();
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType40);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = parameterizedType52.toMaybeParameterizedType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(parameterizedType52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNull(functionType67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(enumType79);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(parameterizedType82);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        objectType11.clearResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType11);
        boolean boolean33 = objectType32.isCheckedUnknownType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.isInterface();
        java.lang.String str4 = jSDocInfo2.getOriginalCommentString();
        boolean boolean5 = jSDocInfo2.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isInterface();
        jSDocInfo6.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isInterface();
        java.lang.String str12 = jSDocInfo10.getOriginalCommentString();
        boolean boolean13 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isInterface();
        boolean boolean16 = jSDocInfo14.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo14.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean19 = jSDocInfo18.isInterface();
        jSDocInfo18.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.isInterface();
        boolean boolean24 = jSDocInfo22.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isInterface();
        boolean boolean27 = jSDocInfo25.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo25.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isInterface();
        boolean boolean31 = jSDocInfo29.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo29.getEnumParameterType();
        boolean boolean33 = jSDocInfo29.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.isInterface();
        java.lang.String str36 = jSDocInfo34.getOriginalCommentString();
        boolean boolean37 = jSDocInfo34.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.isInterface();
        java.lang.String str40 = jSDocInfo38.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo38.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean43 = jSDocInfo42.isInterface();
        jSDocInfo42.setLicense("");
        boolean boolean46 = jSDocInfo42.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isInterface();
        jSDocInfo47.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.isInterface();
        boolean boolean53 = jSDocInfo51.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = jSDocInfo51.getEnumParameterType();
        boolean boolean55 = jSDocInfo51.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray56 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo47, jSDocInfo51 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList57 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo2, jSDocInfo6, jSDocInfo10, jSDocInfo14, jSDocInfo18, jSDocInfo22, jSDocInfo25, jSDocInfo29, jSDocInfo34, jSDocInfo38, jSDocInfo42, jSDocInfoArray56);
        java.util.Collection<java.lang.String> strCollection58 = jSDocInfo0.getAuthors();
        java.lang.String str59 = jSDocInfo0.getLicense();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(jSTypeExpression41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jSTypeExpression54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoArray56);
        org.junit.Assert.assertNotNull(jSDocInfoList57);
        org.junit.Assert.assertNull(strCollection58);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry58.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType54, false, jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType66.getBindReturnType(100);
        int int69 = functionType68.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType68.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.common.collect.ImmutableList<java.lang.String> strList74 = functionType68.getTemplateTypeNames();
        boolean boolean76 = functionType68.removeProperty("({proxy:{proxy:{1874555938}}})");
        java.lang.String str77 = functionType68.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType78 = functionType68.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.collapseUnion();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSType35);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry7.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSType15.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry20.createParameterizedType(objectType35, jSType46);
        java.util.Set set49 = parameterizedType48.getOwnPropertyNames();
        boolean boolean50 = parameterizedType48.isNoObjectType();
        boolean boolean51 = parameterizedType48.isAllType();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean54 = objectType16.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType48, node53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node55 = node4.srcref(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        boolean boolean6 = jSTypeRegistry3.resetImplicitPrototype(jSType4, objectType5);
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry3.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSType11.dereference();
        boolean boolean13 = objectType12.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType12.getCtorImplementedInterfaces();
        boolean boolean15 = objectType12.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder16 = objectTypeBuilder0.add(objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder18 = objectTypeBuilder0.add(objectType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeBuilder0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeBuilder16);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(randomAccessList0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
        java.util.Collection<java.lang.Cloneable> cloneableCollection13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cloneableList3.addAll(39, cloneableCollection13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        boolean boolean12 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        boolean boolean25 = objectType24.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = objectType24.getCtorImplementedInterfaces();
        boolean boolean27 = objectType24.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        boolean boolean40 = objectType39.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = objectType39.getCtorImplementedInterfaces();
        boolean boolean42 = objectType39.isNativeObjectType();
        boolean boolean43 = objectType24.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType39);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry8.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType39, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        boolean boolean68 = jSTypeRegistry64.shouldTolerateUndefinedValues();
        jSTypeRegistry64.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry64.createUnionType(jSTypeArray70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry8.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType60, false, jSTypeArray70);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType72.getBindReturnType(100);
        int int75 = functionType74.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType74.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType74.getRestrictedTypeGivenToBooleanOutcome(true);
        int int80 = cloneableList3.lastIndexOf((java.lang.Object) jSType79);
        java.util.function.UnaryOperator<java.lang.Cloneable> cloneableUnaryOperator81 = null;
        // The following exception was thrown during execution in test generation
        try {
            cloneableList3.replaceAll(cloneableUnaryOperator81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        boolean boolean21 = node10.isParamList();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node25);
        com.google.javascript.rhino.jstype.JSType jSType27 = node25.getJSType();
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node25);
        node10.putProp((int) (short) 1, (java.lang.Object) str28);
        java.lang.Class<?> wildcardClass30 = node10.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(cloneableList26);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        node3.removeProp((int) (short) 10);
        node3.setOptionalArg(true);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        boolean boolean13 = node11.isFalse();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.hasOneChild();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isTrue();
        boolean boolean31 = node29.isBreak();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node20, node24, node29, (int) (byte) 1, 4095);
        boolean boolean35 = node11.isEquivalentTo(node17);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType36 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList40 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node39);
        boolean boolean41 = node39.isFalse();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean49 = node48.isFalse();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean53 = node52.isTrue();
        boolean boolean54 = node52.hasOneChild();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isTrue();
        boolean boolean59 = node57.isBreak();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 1, node45, node48, node52, node57, (int) (byte) 1, 4095);
        boolean boolean63 = node39.isEquivalentTo(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isTrue();
        boolean boolean68 = node66.isBreak();
        boolean boolean69 = node66.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship70 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType36, node39, node66);
        boolean boolean71 = node66.isThrow();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(10, node3, node11, node66, (int) (byte) -1, (int) (byte) -1);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags75 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags75.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node11.setSideEffectFlags(sideEffectFlags75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + subclassType36 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType36.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(cloneableList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(41, node3, (int) (short) 1, 40);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder7.append("{proxy:{proxy:{1004792283}}}");
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        objectType11.clearResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType11);
        boolean boolean33 = objectType11.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList9.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = cloneableList9.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor13 = cloneableList12.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = cloneableList12.reverse();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList18 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node17);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList19 = cloneableList18.asList();
        boolean boolean20 = cloneableList18.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList21 = cloneableList18.asList();
        boolean boolean22 = cloneableList12.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isFalse();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean34 = node33.isTrue();
        boolean boolean35 = node33.hasOneChild();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean39 = node38.isTrue();
        boolean boolean40 = node38.isBreak();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 1, node26, node29, node33, node38, (int) (byte) 1, 4095);
        boolean boolean44 = cloneableList18.contains((java.lang.Object) node43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = cloneableList3.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(cloneableList9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableItor13);
        org.junit.Assert.assertNotNull(cloneableList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(cloneableList18);
        org.junit.Assert.assertNotNull(cloneableList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cloneableList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        node20.detachChildren();
        com.google.javascript.rhino.Node node22 = node20.removeFirstChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node20.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator24 = nodeIterable23.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(nodeSpliterator24);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.Exception[] exceptionArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList1 = com.google.common.collect.ImmutableList.of(exceptionArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        boolean boolean24 = objectType23.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = objectType23.getCtorImplementedInterfaces();
        boolean boolean26 = objectType23.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        boolean boolean39 = objectType38.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = objectType38.getCtorImplementedInterfaces();
        boolean boolean41 = objectType38.isNativeObjectType();
        boolean boolean42 = objectType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType38);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry7.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType38, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry50.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSType58.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        boolean boolean67 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        jSTypeRegistry63.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry63.createUnionType(jSTypeArray69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry7.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType59, false, jSTypeArray69);
        java.util.Set<java.lang.String> strSet72 = functionType71.getOwnPropertyNames();
        boolean boolean73 = functionType71.isNumberObjectType();
        com.google.javascript.rhino.Node node75 = functionType71.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = jSTypeRegistry2.getEachReferenceTypeWithProperty("{proxy:{proxy:{1234967722}}}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId4 = null;
        node3.setInputId(inputId4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = jSTypeRegistry9.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry16.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSType24.dereference();
        boolean boolean26 = objectType25.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = objectType25.getCtorImplementedInterfaces();
        boolean boolean28 = objectType25.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry31.resetImplicitPrototype(jSType32, objectType33);
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry31.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSType39.dereference();
        boolean boolean41 = objectType40.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = objectType40.getCtorImplementedInterfaces();
        boolean boolean43 = objectType40.isNativeObjectType();
        boolean boolean44 = objectType25.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType40);
        boolean boolean46 = objectType25.hasProperty("hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isFalse();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isTrue();
        boolean boolean59 = node57.hasOneChild();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean63 = node62.isTrue();
        boolean boolean64 = node62.isBreak();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (byte) 1, node50, node53, node57, node62, (int) (byte) 1, 4095);
        boolean boolean68 = node50.isDelProp();
        boolean boolean69 = node50.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry9.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType25, node50);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node50);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition72 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int73 = namePosition72.getStartLine();
        int int74 = namePosition72.getStartLine();
        int int75 = namePosition72.getEndLine();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean79 = node78.isTrue();
        namePosition72.setItem(node78);
        com.google.javascript.rhino.Node node81 = node50.useSourceInfoFromForTree(node78);
        boolean boolean82 = node50.isFunction();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildToFront(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        boolean boolean39 = objectType18.hasProperty("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isFalse();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.hasOneChild();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isTrue();
        boolean boolean57 = node55.isBreak();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 1, node43, node46, node50, node55, (int) (byte) 1, 4095);
        boolean boolean61 = node43.isDelProp();
        boolean boolean62 = node43.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType18, node43);
        com.google.javascript.rhino.Node node64 = functionType63.getSource();
        boolean boolean65 = functionType63.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = functionType66.hasReferenceName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(functionType66);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList24 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node23);
        boolean boolean25 = node23.isFalse();
        boolean boolean26 = node23.isScript();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList30 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node29);
        boolean boolean31 = node29.isString();
        node29.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node34 = node23.srcref(node29);
        boolean boolean35 = node29.isDo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = node15.removeChildAfter(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(cloneableList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(cloneableList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getPropertyType("{proxy:{proxy:{51735728}}}");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = parameterizedType30.setValidator(jSTypePredicate37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSType36);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        boolean boolean10 = node8.isOr();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean14 = node13.isTrue();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 0, node8, node13, 49, 49);
        boolean boolean18 = node8.isInc();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cloneableList3.add((java.lang.Cloneable) node8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cloneableList5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator18 = cloneableList13.spliterator();
        java.lang.Object[] objArray19 = cloneableList13.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable21 = cloneableList13.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(cloneableList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cloneableSpliterator18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        node3.removeProp((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cloneableList6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("");
        java.lang.String str36 = parameterizedType30.getReferenceName();
        boolean boolean37 = parameterizedType30.canBeCalled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(parameterizedType30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = node1.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        objectType11.clearResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType11);
        boolean boolean33 = objectType32.isDateType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry45.createParameterizedType(objectType60, jSType71);
        java.util.Set set74 = parameterizedType73.getOwnPropertyNames();
        boolean boolean75 = parameterizedType73.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        boolean boolean81 = jSTypeRegistry78.resetImplicitPrototype(jSType79, objectType80);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry78.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSType86.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSType86.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType89 = jSType86.restrictByNotNullOrUndefined();
        boolean boolean90 = parameterizedType73.canAssignTo(jSType86);
        boolean boolean92 = parameterizedType73.isPropertyTypeInferred("");
        boolean boolean93 = parameterizedType73.isResolved();
        boolean boolean94 = parameterizedType73.isInstanceType();
        boolean boolean95 = parameterizedType73.canBeCalled();
        java.util.Set<java.lang.String> strSet96 = parameterizedType73.getOwnPropertyNames();
        boolean boolean98 = parameterizedType73.removeProperty("({proxy:{proxy:{1321644185}}})");
        boolean boolean99 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType42, (com.google.javascript.rhino.jstype.JSType) parameterizedType73);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(parameterizedType73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(functionType88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(strSet96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }
}
