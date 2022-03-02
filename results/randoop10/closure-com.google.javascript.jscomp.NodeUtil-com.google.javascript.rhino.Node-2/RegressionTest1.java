import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00201");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("({proxy:{proxy:{1874555938}}})", jSTypeNative1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node5);
        boolean boolean7 = node5.isFalse();
        boolean boolean8 = node5.isScript();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        jSTypeRegistry11.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        boolean boolean29 = objectType28.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry11.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType28);
        boolean boolean32 = jSTypeRegistry11.hasNamespace("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.JSType jSType33 = assertionFunctionSpec2.getAssertedType(node5, jSTypeRegistry11);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry11.createUnionType(jSTypeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00202");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection2 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.hasParameterType("{proxy:{proxy:{1321644185}}}");
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(markerCollection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00203");
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
        boolean boolean39 = cloneableList13.isEmpty();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean43 = node42.isFalse();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList47 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node46);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList51 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node50);
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { node42, node46, node50 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList53 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList53, cloneableArray52);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition55 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str56 = stringPosition55.getItem();
        boolean boolean57 = cloneableList53.remove((java.lang.Object) str56);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isFalse();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean68 = node67.isFalse();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean72 = node71.isTrue();
        boolean boolean73 = node71.isBreak();
        java.lang.Cloneable[] cloneableArray74 = new java.lang.Cloneable[] { cloneableList53, node60, node63, node67, node71 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList75 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList75, cloneableArray74);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean80 = cloneableList75.add((java.lang.Cloneable) node79);
        boolean boolean81 = cloneableList13.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable83 = cloneableList75.remove(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Size: 6");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(cloneableList47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(cloneableList51);
        org.junit.Assert.assertNotNull(cloneableArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cloneableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00204");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        boolean boolean11 = cloneableList10.isEmpty();
        boolean boolean12 = cloneableList10.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream13 = cloneableList10.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cloneableList3.addAll(39, (java.util.Collection<java.lang.Cloneable>) cloneableList10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cloneableStream13);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00205");
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
            java.lang.Cloneable cloneable20 = cloneableList13.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00206");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        java.lang.Object obj5 = node3.getProp(30);
        boolean boolean6 = node3.isCatch();
        boolean boolean7 = node3.isLabel();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildrenToBack(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00207");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00208");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{proxy:{proxy:{1920657899}}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00209");
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
        java.lang.Object obj49 = node20.getProp((-1));
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = node20.srcrefTree(node50);
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
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00210");
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
        boolean boolean22 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        boolean boolean35 = objectType34.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSType46.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType49 = jSType46.restrictByNotNullOrUndefined();
        boolean boolean50 = objectType34.isSubtype(jSType49);
        com.google.javascript.rhino.jstype.JSType jSType52 = objectType34.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        java.lang.String str65 = objectType64.getDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) objectType34, (com.google.javascript.rhino.jstype.JSType) objectType64);
        com.google.javascript.rhino.jstype.JSType jSType67 = typePair66.typeB;
        com.google.javascript.rhino.jstype.JSType jSType68 = typePair66.typeA;
        com.google.javascript.rhino.jstype.JSType jSType69 = typePair66.typeA;
        node20.setJSType(jSType69);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo71 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node20);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(functionType48);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(jSType69);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00211");
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
        boolean boolean22 = node20.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node20);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00212");
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
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream99 = cloneableList13.parallelStream();
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
        org.junit.Assert.assertNotNull(cloneableStream99);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00213");
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
        boolean boolean77 = functionType71.isFunctionPrototypeType();
        java.lang.String str78 = functionType71.toDebugHashCodeString();
        boolean boolean79 = functionType71.isAllType();
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "function (): {proxy:{873111549}}" + "'", str78, "function (): {proxy:{873111549}}");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00214");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator8 = cloneableList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = cloneableList6.subList((int) (short) 100, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (100) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableSpliterator8);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00215");
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
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node25);
        boolean boolean27 = node25.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isFalse();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean39 = node38.isTrue();
        boolean boolean40 = node38.hasOneChild();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean44 = node43.isTrue();
        boolean boolean45 = node43.isBreak();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) 1, node31, node34, node38, node43, (int) (byte) 1, 4095);
        boolean boolean49 = node25.isEquivalentTo(node31);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean53 = node52.isTrue();
        boolean boolean54 = node52.isBreak();
        boolean boolean55 = node52.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship56 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType22, node25, node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean59 = node58.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(4095, node16, node25, node58);
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
        org.junit.Assert.assertTrue("'" + subclassType22 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType22.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(cloneableList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00216");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isFalse();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = jSTypeRegistry7.getErrorReporter();
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
        boolean boolean44 = objectType23.hasProperty("hi!");
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
        boolean boolean66 = node48.isDelProp();
        boolean boolean67 = node48.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry7.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType23, node48);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node48);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition70 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int71 = namePosition70.getStartLine();
        int int72 = namePosition70.getStartLine();
        int int73 = namePosition70.getEndLine();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean77 = node76.isTrue();
        namePosition70.setItem(node76);
        com.google.javascript.rhino.Node node79 = node48.useSourceInfoFromForTree(node76);
        com.google.javascript.rhino.InputId inputId81 = new com.google.javascript.rhino.InputId(".<>");
        node48.setInputId(inputId81);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile83 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node48);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(0, node3, node48, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(errorReporter11);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(staticSourceFile83);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00217");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        boolean boolean46 = parameterizedType43.isAllType();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean49 = objectType11.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType43, node48);
        com.google.javascript.rhino.jstype.UnionType unionType50 = parameterizedType43.toMaybeUnionType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType43.dereference();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(parameterizedType43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(unionType50);
        org.junit.Assert.assertNotNull(objectType51);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00218");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        node2.detachChildren();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = new com.google.javascript.rhino.Node.SideEffectFlags(1);
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags(sideEffectFlags6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00219");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            cloneableItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00220");
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
        node20.setIsSyntheticBlock(true);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isFalse();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean39 = node38.isTrue();
        boolean boolean40 = node38.hasOneChild();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean44 = node43.isTrue();
        boolean boolean45 = node43.isBreak();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) 1, node31, node34, node38, node43, (int) (byte) 1, 4095);
        boolean boolean49 = node31.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        boolean boolean62 = objectType61.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry26.createObjectType("hi!", node31, objectType61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean71 = node70.isFalse();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean75 = node74.isTrue();
        boolean boolean76 = node74.hasOneChild();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean80 = node79.isTrue();
        boolean boolean81 = node79.isBreak();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) 1, node67, node70, node74, node79, (int) (byte) 1, 4095);
        node84.detachChildren();
        com.google.javascript.rhino.InputId inputId86 = null;
        node84.setInputId(inputId86);
        com.google.javascript.rhino.Node node88 = node31.copyInformationFrom(node84);
        boolean boolean89 = node84.hasMoreThanOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = node20.clonePropsFrom(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00221");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.asList();
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
        boolean boolean27 = node16.isParamList();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList32 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node31);
        com.google.javascript.rhino.jstype.JSType jSType33 = node31.getJSType();
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node31);
        node16.putProp((int) (short) 1, (java.lang.Object) str34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = cloneableList3.add((java.lang.Cloneable) node16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(cloneableList32);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00222");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry10.createAnonymousObjectType();
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
        jSTypeRegistry10.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType25);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry50.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSType58.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType60 = jSTypeRegistry32.createParameterizedType(objectType47, jSType58);
        java.util.Set set61 = parameterizedType60.getOwnPropertyNames();
        boolean boolean62 = parameterizedType60.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSType73.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType76 = jSType73.restrictByNotNullOrUndefined();
        boolean boolean77 = parameterizedType60.canAssignTo(jSType73);
        boolean boolean79 = parameterizedType60.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry10.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType60, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType60.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = parameterizedType60.getOwnPropertyJSDocInfo("");
        boolean boolean88 = parameterizedType60.isStringObjectType();
        java.lang.String str89 = parameterizedType60.toDebugHashCodeString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = cloneableList6.remove((java.lang.Object) parameterizedType60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(parameterizedType60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNull(functionType75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNull(jSDocInfo87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "{proxy:{proxy:{2106349148}}}" + "'", str89, "{proxy:{proxy:{2106349148}}}");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00223");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry2.getNativeType(jSTypeNative43);
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
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00224");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isDefine();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("{proxy:{proxy:{1943266088}}}");
        boolean boolean8 = jSDocInfo0.isExport();
        java.lang.String str9 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00225");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean13 = objectType11.isPropertyInExterns("hi!");
        com.google.javascript.rhino.jstype.JSType jSType14 = objectType11.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = objectType11.getTypeOfThis();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(objectType15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00226");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function (): {proxy:{473699289}}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function (): {proxy:{473699289}})" + "'", str1, "(function (): {proxy:{473699289}})");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00227");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        node2.setWasEmptyNode(false);
        int int7 = node2.getType();
        node2.putBooleanProp(52, true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00228");
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
        boolean boolean43 = objectType33.isConstructor();
        boolean boolean44 = objectType33.isInterface();
        boolean boolean46 = objectType33.removeProperty("{proxy:{proxy:{69867283}}}");
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00229");
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
        boolean boolean68 = functionType66.canBeCalled();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = functionType66.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType66.toObjectType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType66.getRestrictedTypeGivenToBooleanOutcome(true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable73 = functionType66.getOwnImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType66.getInstanceType();
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
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(objectTypeIterable73);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00230");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = cloneableList6.reverse();
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator9 = cloneableList6.spliterator();
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray12 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray13 = cloneableList6.toArray((java.lang.Iterable<java.lang.Cloneable>[]) iterableArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: com.google.javascript.rhino.Node$StringNode");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertNotNull(cloneableSpliterator9);
        org.junit.Assert.assertNotNull(iterableArray11);
        org.junit.Assert.assertNotNull(cloneableIterableArray12);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00231");
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
        com.google.javascript.rhino.Node node43 = objectType33.getRootNode();
        boolean boolean44 = objectType33.isStringObjectType();
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00232");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        java.lang.Object obj7 = node5.getProp(30);
        node1.addChildrenToFront(node5);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.appendStringTree(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00233");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator5 = nodeIterable4.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(nodeSpliterator5);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00234");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 0, node3, node8, 49, 49);
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = node14.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            node14.setSideEffectFlags(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(jSDocInfo15);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00235");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = null;
        // The following exception was thrown during execution in test generation
        try {
            node27.setStaticSourceFile(staticSourceFile28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00236");
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
        boolean boolean24 = node20.isAssignAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00237");
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
        boolean boolean22 = node3.isNot();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = node3.getExistingIntProp((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 100");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00238");
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
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = parameterizedType30.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = functionType34.hasCachedValues();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(functionType34);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00239");
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
        int int67 = functionType66.getMinArguments();
        boolean boolean69 = functionType66.isPropertyInExterns("{proxy:{proxy:{649633010}}}");
        boolean boolean70 = functionType66.isResolved();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.cloneWithoutArrowType();
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00240");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean4 = node3.isBreak();
        boolean boolean6 = node3.getBooleanProp((-1));
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
        boolean boolean28 = node13.isParamList();
        node13.addSuppression("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildToFront(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00241");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean2 = node1.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) 37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00242");
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
        com.google.javascript.rhino.jstype.EnumType enumType31 = objectType11.toMaybeEnumType();
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
        org.junit.Assert.assertNull(enumType31);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00243");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = node2.getJSType();
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean34 = node33.isFalse();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.hasOneChild();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean43 = node42.isTrue();
        boolean boolean44 = node42.isBreak();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 1, node30, node33, node37, node42, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node48 = node25.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean49 = node25.isDefaultCase();
        node25.putIntProp((int) (short) -1, 0);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative54 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec55 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("({proxy:{proxy:{1874555938}}})", jSTypeNative54);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList59 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node58);
        boolean boolean60 = node58.isFalse();
        boolean boolean61 = node58.isScript();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        jSTypeRegistry64.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        boolean boolean82 = objectType81.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry64.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType81);
        boolean boolean85 = jSTypeRegistry64.hasNamespace("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.JSType jSType86 = assertionFunctionSpec55.getAssertedType(node58, jSTypeRegistry64);
        node58.setType(35);
        // The following exception was thrown during execution in test generation
        try {
            node2.replaceChild(node25, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(cloneableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSType86);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00244");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Unknown class name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00245");
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
        boolean boolean68 = functionType66.canBeCalled();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType66.cloneWithoutArrowType();
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
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00246");
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
        boolean boolean15 = jSTypeRegistry11.shouldTolerateUndefinedValues();
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
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry11.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType42, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        boolean boolean71 = jSTypeRegistry67.shouldTolerateUndefinedValues();
        jSTypeRegistry67.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry67.createUnionType(jSTypeArray73);
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry11.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType63, false, jSTypeArray73);
        java.util.Set<java.lang.String> strSet76 = functionType75.getOwnPropertyNames();
        boolean boolean77 = functionType75.isNumberObjectType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList78 = functionType75.getSubTypes();
        java.lang.String str79 = functionType75.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType75.getConstructor();
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType80, "function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative83 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry2.getNativeObjectType(jSTypeNative83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNull(errorReporter8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(functionTypeList78);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "function (): {proxy:{826237827}}" + "'", str79, "function (): {proxy:{826237827}}");
        org.junit.Assert.assertNull(functionType80);
        org.junit.Assert.assertNotNull(jSType82);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00247");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = cloneableList3.subList(38, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (38) must not be greater than size (1)");
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
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00248");
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
        com.google.javascript.rhino.jstype.TemplateType templateType37 = parameterizedType30.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = templateType37.isUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(templateType37);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00249");
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
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList58 = jSDocInfo10.getThrownTypes();
        boolean boolean59 = jSDocInfo10.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo10.getType();
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
        org.junit.Assert.assertNotNull(jSTypeExpressionList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSTypeExpression60);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00250");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = cloneableList9.isEmpty();
        boolean boolean11 = cloneableList9.isEmpty();
        java.lang.Object[] objArray12 = cloneableList9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cloneableList4.addAll(10, (java.util.Collection<java.lang.Cloneable>) cloneableList9);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00251");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
        java.lang.Cloneable cloneable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable8 = cloneableList5.set((int) (byte) 10, cloneable7);
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
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00252");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isInc();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo4 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00253");
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
        boolean boolean52 = parameterizedType30.canBeCalled();
        java.util.Set<java.lang.String> strSet53 = parameterizedType30.getOwnPropertyNames();
        boolean boolean55 = parameterizedType30.removeProperty("({proxy:{proxy:{1321644185}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
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
        boolean boolean81 = node63.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        boolean boolean87 = jSTypeRegistry84.resetImplicitPrototype(jSType85, objectType86);
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry84.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType93 = jSType92.dereference();
        boolean boolean94 = objectType93.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry58.createObjectType("hi!", node63, objectType93);
        boolean boolean96 = parameterizedType30.differsFrom((com.google.javascript.rhino.jstype.JSType) objectType93);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot98 = parameterizedType30.getSlot("{proxy:{proxy:{2144970728}}}");
        com.google.javascript.rhino.jstype.UnionType unionType99 = parameterizedType30.toMaybeUnionType();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jSType92);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot98);
        org.junit.Assert.assertNull(unionType99);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00254");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        boolean boolean5 = node2.isScript();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isString();
        node8.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = node2.srcref(node8);
        boolean boolean14 = node8.isDo();
        com.google.javascript.rhino.Node node15 = node8.cloneNode();
        boolean boolean16 = node15.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00255");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable39 = cloneableList13.get(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 41, Size: 6");
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
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00256");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        int int4 = namePosition0.getPositionOnEndLine();
        int int5 = namePosition0.getStartLine();
        int int6 = namePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00257");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean4 = node3.isBreak();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        boolean boolean9 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry8.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        boolean boolean17 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        boolean boolean30 = objectType29.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType29.getCtorImplementedInterfaces();
        boolean boolean32 = objectType29.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        boolean boolean45 = objectType44.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = objectType44.getCtorImplementedInterfaces();
        boolean boolean47 = objectType44.isNativeObjectType();
        boolean boolean48 = objectType29.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType44);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry13.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType44, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        boolean boolean73 = jSTypeRegistry69.shouldTolerateUndefinedValues();
        jSTypeRegistry69.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry69.createUnionType(jSTypeArray75);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry13.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType65, false, jSTypeArray75);
        java.util.Set<java.lang.String> strSet78 = functionType77.getOwnPropertyNames();
        boolean boolean79 = functionType77.isNumberObjectType();
        com.google.javascript.rhino.Node node81 = functionType77.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry8.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType77);
        node3.putProp((int) (short) 10, (java.lang.Object) jSType82);
        boolean boolean84 = node3.isLabel();
        boolean boolean85 = node3.isTypeOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00258");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        boolean boolean2 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00259");
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
        boolean boolean35 = node30.isDebugger();
        com.google.javascript.rhino.Node node36 = null;
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
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(51, node58);
        // The following exception was thrown during execution in test generation
        try {
            node30.replaceChild(node36, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00260");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        boolean boolean6 = cloneableList3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = cloneableList3.subList((int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (52) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00261");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        java.lang.String str5 = node2.getString();
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
        node26.detachChildren();
        node26.setIsSyntheticBlock(true);
        boolean boolean30 = node2.isEquivalentTo(node26);
        com.google.javascript.rhino.Node node31 = node2.removeFirstChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00262");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean2 = node1.isFalse();
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = node1.useSourceInfoIfMissingFrom(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00263");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType68.getConstructor();
        boolean boolean71 = functionType68.isInterface();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType68.cloneWithoutArrowType();
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
        org.junit.Assert.assertNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00264");
        int int0 = com.google.javascript.rhino.Node.SLASH_V;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 54 + "'", int0 == 54);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00265");
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
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream95 = cloneableList9.stream();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream96 = cloneableList9.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            cloneableList9.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(cloneableStream95);
        org.junit.Assert.assertNotNull(cloneableStream96);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00266");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str1 = ternaryValue0.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unknown" + "'", str1, "unknown");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00267");
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
        com.google.javascript.rhino.Node node45 = node20.removeFirstChild();
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
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00268");
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
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId49 = null;
        node48.setInputId(inputId49);
        node20.addChildrenToBack(node48);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node20);
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
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00269");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        boolean boolean11 = cloneableList10.isEmpty();
        boolean boolean12 = cloneableList10.isEmpty();
        java.lang.Object[] objArray13 = cloneableList10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cloneableList6.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00270");
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
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType52.findPropertyType("{proxy:{proxy:{216812130}}}");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = jSType80.setValidator(jSTypePredicate81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(jSType80);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00271");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        java.lang.String str12 = objectType11.getDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = objectType11.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objectType13.isObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(objectType13);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00272");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry6.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = jSTypeRegistry6.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        boolean boolean23 = objectType22.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable24 = objectType22.getCtorImplementedInterfaces();
        boolean boolean25 = objectType22.isNativeObjectType();
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
        boolean boolean41 = objectType22.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType37);
        boolean boolean43 = objectType22.hasProperty("hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isFalse();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean55 = node54.isTrue();
        boolean boolean56 = node54.hasOneChild();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isTrue();
        boolean boolean61 = node59.isBreak();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node47, node50, node54, node59, (int) (byte) 1, 4095);
        boolean boolean65 = node47.isDelProp();
        boolean boolean66 = node47.isIn();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry6.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType22, node47);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node47);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition69 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int70 = namePosition69.getStartLine();
        int int71 = namePosition69.getStartLine();
        int int72 = namePosition69.getEndLine();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean76 = node75.isTrue();
        namePosition69.setItem(node75);
        com.google.javascript.rhino.Node node78 = node47.useSourceInfoFromForTree(node75);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildrenToBack(node78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(errorReporter10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node78);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00273");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnStartLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        int int5 = stringPosition0.getPositionOnStartLine();
        int int6 = stringPosition0.getEndLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00274");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry2.createUnionType(jSTypeArray8);
        boolean boolean11 = jSTypeRegistry2.hasNamespace("{proxy:{proxy:{649633010}}}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry2.getNativeType(jSTypeNative12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00275");
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
        // The following exception was thrown during execution in test generation
        try {
            cloneableList9.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00276");
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
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean67 = jSType66.isNoResolvedType();
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
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00277");
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
        int int70 = functionType68.getPropertiesCount();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType68.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope73 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.forceResolve(errorReporter72, jSTypeStaticScope73);
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
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(functionType71);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00278");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.isOr();
        boolean boolean5 = node2.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node2.toString(true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00279");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        boolean boolean6 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = node9.getJSType();
        boolean boolean12 = cloneableList3.contains((java.lang.Object) jSType11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable14 = cloneableList3.get(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (40) must be less than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00280");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        boolean boolean7 = node2.isLocalResultCall();
        node2.setType(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo10 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00281");
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
        java.lang.String str21 = node6.getString();
        boolean boolean22 = node6.isParamList();
        java.util.Set<java.lang.String> strSet23 = node6.getDirectives();
        node6.putBooleanProp(39, false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strSet23);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00282");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isFalse();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isTrue();
        boolean boolean24 = node22.hasOneChild();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 1, node15, node18, node22, node27, (int) (byte) 1, 4095);
        boolean boolean33 = node15.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry10.createObjectType("hi!", node15, objectType45);
        boolean boolean48 = objectType45.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = null;
        objectType45.setJSDocInfo(jSDocInfo49);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType45, false, jSTypeArray52);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType53.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType53.getInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType53.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = functionType53.getPossibleToBooleanOutcomes();
        boolean boolean59 = functionType53.hasCachedValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00283");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        boolean boolean3 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue5.not();
        boolean boolean8 = ternaryValue5.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue5.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue9.xor(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue0.or(ternaryValue10);
        java.lang.String str13 = ternaryValue12.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "unknown" + "'", str13, "unknown");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00284");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = jSType10.isString();
        com.google.javascript.rhino.jstype.UnionType unionType13 = jSType10.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unionType13.isNumberValueType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(unionType13);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00285");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean11 = node10.isScript();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.isBreak();
        boolean boolean17 = node14.isNot();
        node10.addChildrenToBack(node14);
        boolean boolean19 = node10.isTrue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cloneableList6.add((java.lang.Cloneable) node10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00286");
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
        com.google.javascript.rhino.Node node40 = node7.getFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = null;
        // The following exception was thrown during execution in test generation
        try {
            node40.setStaticSourceFile(staticSourceFile41);
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
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00287");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = node2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00288");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 0, node3, node8, 49, 49);
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        com.google.javascript.rhino.Node node15 = node12.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00289");
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
        int int68 = functionType66.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType66.autoboxesTo();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.getBindReturnType(30);
        boolean boolean72 = functionType71.isObject();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00290");
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
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = jSType66.isEnumElementType();
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
        org.junit.Assert.assertNull(jSType66);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00291");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        jSTypeRegistry2.forwardDeclareType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.getType("{proxy:{proxy:{1763454178}}}");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList86 = functionType80.getTemplateTypeNames();
        jSTypeRegistry2.setTemplateTypeNames((java.util.List<java.lang.String>) strList86);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSType11);
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
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00292");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00293");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        boolean boolean52 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createAnonymousObjectType();
        boolean boolean59 = objectType58.isFunctionPrototypeType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType30.forceResolve(errorReporter53, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType58);
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
        org.junit.Assert.assertNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00294");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00295");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType68.getConstructor();
        boolean boolean71 = functionType68.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType68.findPropertyType("function (): {proxy:{1288677244}}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = functionType68.getExtendedInterfaces();
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
        org.junit.Assert.assertNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(jSType73);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00296");
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
        com.google.javascript.rhino.Node node70 = functionType66.getParametersNode();
        boolean boolean71 = node70.isOptionalArg();
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
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00297");
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
        jSDocInfo6.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo6.getParameterType("InputId: .<>");
        boolean boolean62 = jSDocInfo6.isExport();
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
        org.junit.Assert.assertNull(jSTypeExpression61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00298");
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
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            cloneableList13.add(97, (java.lang.Cloneable) node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 6");
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
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00299");
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
        int int68 = functionType66.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType71 = functionType66.toMaybeParameterizedType();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList75 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node74);
        boolean boolean76 = node74.isFalse();
        boolean boolean77 = node74.isScript();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList81 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node80);
        boolean boolean82 = node80.isString();
        node80.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node85 = node74.srcref(node80);
        functionType66.setSource(node74);
        boolean boolean87 = node74.isScript();
        boolean boolean88 = node74.isQuotedString();
        java.lang.Appendable appendable89 = null;
        // The following exception was thrown during execution in test generation
        try {
            node74.appendStringTree(appendable89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNull(parameterizedType71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(cloneableList75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(cloneableList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00300");
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
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        com.google.javascript.rhino.Node node65 = node43.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = node65.isHook();
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00301");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(typePosition2);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00302");
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
        java.lang.String str70 = functionType66.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = functionType71.matchesNumberContext();
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
        org.junit.Assert.assertNull(functionTypeList69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "function (): {proxy:{1955811950}}" + "'", str70, "function (): {proxy:{1955811950}}");
        org.junit.Assert.assertNull(functionType71);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00303");
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
        int int68 = functionType66.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType71 = functionType66.toMaybeParameterizedType();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList75 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node74);
        boolean boolean76 = node74.isFalse();
        boolean boolean77 = node74.isScript();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList81 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node80);
        boolean boolean82 = node80.isString();
        node80.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node85 = node74.srcref(node80);
        functionType66.setSource(node74);
        boolean boolean87 = node74.isBlock();
        com.google.javascript.rhino.Node node88 = node74.removeChildren();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNull(parameterizedType71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(cloneableList75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(cloneableList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(node88);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00304");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        node3.setLineno((int) ' ');
        boolean boolean6 = node3.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00305");
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
        java.lang.String str82 = parameterizedType52.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType52);
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + ".<>" + "'", str82, ".<>");
        org.junit.Assert.assertNotNull(objectType83);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00306");
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
        boolean boolean52 = parameterizedType30.canBeCalled();
        java.util.Set<java.lang.String> strSet53 = parameterizedType30.getOwnPropertyNames();
        boolean boolean54 = parameterizedType30.isNoObjectType();
        boolean boolean55 = parameterizedType30.isVoidType();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00307");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        boolean boolean57 = objectType55.isPropertyInExterns("hi!");
        com.google.javascript.rhino.jstype.JSType jSType58 = objectType55.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        jSTypeRegistry61.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        boolean boolean79 = objectType78.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry61.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType78);
        boolean boolean82 = jSTypeRegistry61.hasNamespace("{proxy:{proxy:{51735728}}}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeExpression43.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType55, jSTypeRegistry61);
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
        org.junit.Assert.assertNotNull(jSTypeExpression43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00308");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = parameterizedType30.setValidator(jSTypePredicate56);
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
        org.junit.Assert.assertNull(objectType51);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00309");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility58 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo29.setVisibility(visibility58);
        com.google.javascript.rhino.Node node60 = jSDocInfo29.getAssociatedNode();
        boolean boolean61 = jSDocInfo29.isNoCompile();
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
        org.junit.Assert.assertTrue("'" + visibility58 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility58.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00310");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
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
        com.google.javascript.rhino.Node node74 = node52.getChildAtIndex((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry2.createInterfaceType("function (): {proxy:{2008360548}}", node52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00311");
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
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00312");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        boolean boolean5 = node2.isScript();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isString();
        node8.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = node2.srcref(node8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = new com.google.javascript.rhino.JSTypeExpression(node13, "{proxy:{proxy:{1168420562}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType46 = jSTypeRegistry18.createParameterizedType(objectType33, jSType44);
        java.util.Set set47 = parameterizedType46.getOwnPropertyNames();
        boolean boolean48 = parameterizedType46.hasReferenceName();
        boolean boolean49 = parameterizedType46.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType46.findPropertyType("");
        boolean boolean52 = parameterizedType46.isEmptyType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry55.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray57 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry55.createUnionType(jSTypeNativeArray57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType81 = null;
        boolean boolean82 = jSTypeRegistry79.resetImplicitPrototype(jSType80, objectType81);
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry79.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSType87.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry61.createParameterizedType(objectType76, jSType87);
        java.util.Set set90 = parameterizedType89.getOwnPropertyNames();
        boolean boolean91 = parameterizedType89.hasReferenceName();
        boolean boolean92 = parameterizedType89.hasAnyTemplateInternal();
        boolean boolean93 = parameterizedType89.isOrdinaryFunction();
        boolean boolean94 = parameterizedType89.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType89.getPropertyType("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType97 = jSTypeRegistry55.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType89);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeExpression15.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType46, jSTypeRegistry55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(parameterizedType46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(jSTypeNativeArray57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertNotNull(objectType97);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00313");
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
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.UnionType unionType34 = parameterizedType30.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = unionType34.toDebugHashCodeString();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(unionType34);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00314");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{proxy:{proxy:{1117159226}}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00315");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType68.getConstructor();
        boolean boolean71 = functionType68.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = jSType72.isInstanceType();
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
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(jSType72);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00316");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = cloneableList3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00317");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{proxy:{proxy:{1004792283}}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00318");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00319");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable69 = functionType66.getImplementedInterfaces();
        java.lang.Iterable iterable70 = functionType66.getCtorExtendedInterfaces();
        boolean boolean71 = functionType66.hasAnyTemplateInternal();
        boolean boolean72 = functionType66.isNoObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType66.getConstructor();
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
        org.junit.Assert.assertNotNull(objectTypeIterable69);
        org.junit.Assert.assertNotNull(iterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionType73);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00320");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
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
        boolean boolean47 = node29.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry50.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSType58.dereference();
        boolean boolean60 = objectType59.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry24.createObjectType("hi!", node29, objectType59);
        boolean boolean62 = objectType59.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = null;
        objectType59.setJSDocInfo(jSDocInfo63);
        java.lang.String str65 = objectType59.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) objectType59);
        boolean boolean68 = jSTypeRegistry2.isForwardDeclaredType("{proxy:{proxy:{437279302}}}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00321");
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
        boolean boolean21 = node20.isGetProp();
        boolean boolean22 = node20.isGetElem();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        node20.setJSDocInfo(jSDocInfo23);
        int int25 = node20.getSideEffectFlags();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo26 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node20);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00322");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue3.not();
        boolean boolean6 = ternaryValue3.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue7.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue10.or(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00323");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        jSTypeRegistry2.forwardDeclareType("Unknown class name");
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
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType71.getBindReturnType(100);
        int int74 = functionType73.getMinArguments();
        int int75 = functionType73.getPropertiesCount();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType73.toMaybeFunctionType();
        boolean boolean77 = functionType76.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node80 = jSTypeRegistry2.createParameters(jSTypeArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType78);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00324");
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
        jSDocInfo6.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo6.getParameterType("InputId: .<>");
        java.lang.String str62 = jSDocInfo6.getLendsName();
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
        org.junit.Assert.assertNull(jSTypeExpression61);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00325");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean4 = node3.isScript();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isTrue();
        boolean boolean9 = node7.isBreak();
        boolean boolean10 = node7.isNot();
        node3.addChildrenToBack(node7);
        boolean boolean12 = node3.isSyntheticBlock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00326");
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
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.InputId inputId49 = null;
        node48.setInputId(inputId49);
        node20.addChildrenToBack(node48);
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags(54);
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
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00327");
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
        java.lang.String str70 = functionType66.toDebugHashCodeString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType66.getOwnImplementedInterfaces();
        boolean boolean72 = functionType66.isInstanceType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "function (): {proxy:{8672058}}" + "'", str70, "function (): {proxy:{8672058}}");
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00328");
        int int0 = com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00329");
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
        boolean boolean65 = node7.hasOneChild();
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00330");
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
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList23 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node22);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList24 = cloneableList23.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList25 = cloneableList23.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = cloneableList25.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = cloneableList13.addAll((int) '4', (java.util.Collection<java.lang.Cloneable>) cloneableList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 3");
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(cloneableList23);
        org.junit.Assert.assertNotNull(cloneableList24);
        org.junit.Assert.assertNotNull(cloneableList25);
        org.junit.Assert.assertNotNull(cloneableList26);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00331");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
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
        org.junit.Assert.assertNotNull(parameterizedType53);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00332");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(41, node6, (int) (short) 1, 40);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType11 = node9.getJSType();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isFalse();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isTrue();
        boolean boolean24 = node22.hasOneChild();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 1, node15, node18, node22, node27, (int) (byte) 1, 4095);
        node32.detachChildren();
        com.google.javascript.rhino.Node node34 = node32.removeFirstChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node32.siblings();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean43 = node42.isFalse();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isTrue();
        boolean boolean48 = node46.hasOneChild();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.isBreak();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 1, node39, node42, node46, node51, (int) (byte) 1, 4095);
        node56.detachChildren();
        com.google.javascript.rhino.Node node58 = node32.srcrefTree(node56);
        boolean boolean59 = node58.isDo();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(40, node2, node9, node58);
        java.lang.Appendable appendable61 = null;
        // The following exception was thrown during execution in test generation
        try {
            node9.appendStringTree(appendable61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00333");
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
        int int48 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = null;
        parameterizedType30.setPropertyJSDocInfo("unknown", jSDocInfo50);
        boolean boolean52 = parameterizedType30.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = parameterizedType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumType enumType54 = parameterizedType30.toMaybeEnumType();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(functionType53);
        org.junit.Assert.assertNull(enumType54);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00334");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative96 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType97 = jSTypeRegistry41.getNativeFunctionType(jSTypeNative96);
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
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00335");
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
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getPropertyType("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType30.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(jSType38);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00336");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = cloneableList6.reverse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList12.asList();
        boolean boolean14 = cloneableList12.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = cloneableList12.asList();
        boolean boolean16 = cloneableList6.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList12);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean20 = node19.isFalse();
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
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
        com.google.javascript.rhino.Node node64 = node41.useSourceInfoIfMissingFromForTree(node58);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node41.siblings();
        boolean boolean66 = node19.isEquivalentToTyped(node41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable67 = cloneableList6.set(35, (java.lang.Cloneable) node19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(nodeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00337");
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
        boolean boolean34 = objectType11.hasDisplayName();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00338");
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
        com.google.javascript.rhino.jstype.ObjectType objectType40 = objectType39.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType42 = objectType39.findPropertyType("({proxy:{proxy:{1874555938}}})");
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
        org.junit.Assert.assertNotNull(jSType42);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00339");
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
        int int35 = node3.getCharno();
        boolean boolean36 = node3.isTry();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00340");
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
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream95 = cloneableList9.stream();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor96 = cloneableList9.iterator();
        boolean boolean97 = cloneableItor96.hasNext();
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
        org.junit.Assert.assertNotNull(cloneableStream95);
        org.junit.Assert.assertNotNull(cloneableItor96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00341");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = cloneableList6.reverse();
        // The following exception was thrown during execution in test generation
        try {
            cloneableList8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableList8);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00342");
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
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry57.createParameterizedType(objectType72, jSType83);
        java.util.Set set86 = parameterizedType85.getOwnPropertyNames();
        boolean boolean87 = parameterizedType85.hasReferenceName();
        boolean boolean88 = parameterizedType85.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType85.findPropertyType("");
        jSTypeRegistry2.registerPropertyOnType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative92 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative92);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(parameterizedType85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSType90);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00343");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = parameterizedType30.toMaybeParameterizedType();
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
        org.junit.Assert.assertNull(objectType51);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(property57);
        org.junit.Assert.assertNotNull(parameterizedType58);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00344");
        java.io.IOException iOException1 = new java.io.IOException("function (): {proxy:{10439819}}");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: function (): {proxy:{10439819}}" + "'", str2, "java.io.IOException: function (): {proxy:{10439819}}");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00345");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        boolean boolean6 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = cloneableList11.asList();
        boolean boolean13 = cloneableList11.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = cloneableList11.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor15 = cloneableList14.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList16 = cloneableList14.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cloneableList3.addAll(2147483647, (java.util.Collection<java.lang.Cloneable>) cloneableList16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cloneableList14);
        org.junit.Assert.assertNotNull(cloneableItor15);
        org.junit.Assert.assertNotNull(cloneableList16);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00346");
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
        int int81 = cloneableList3.size();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean87 = node86.isScript();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean91 = node90.isTrue();
        boolean boolean92 = node90.isBreak();
        boolean boolean93 = node90.isNot();
        node86.addChildrenToBack(node90);
        // The following exception was thrown during execution in test generation
        try {
            cloneableList3.add(31, (java.lang.Cloneable) node86);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00347");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry2.getNativeType(jSTypeNative25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(errorReporter24);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00348");
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
        boolean boolean40 = objectType37.matchesNumberContext();
        boolean boolean41 = objectType37.isInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00349");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator8 = cloneableList6.spliterator();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList12.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = cloneableList12.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = cloneableList14.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cloneableList6.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableSpliterator8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertNotNull(cloneableList14);
        org.junit.Assert.assertNotNull(cloneableList15);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00350");
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
        boolean boolean21 = node20.isGetProp();
        boolean boolean22 = node20.isGetElem();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean34 = node33.isFalse();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.hasOneChild();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean43 = node42.isTrue();
        boolean boolean44 = node42.isBreak();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 1, node30, node33, node37, node42, (int) (byte) 1, 4095);
        // The following exception was thrown during execution in test generation
        try {
            node20.addChildrenAfter(node26, node37);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00351");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00352");
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
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node61 = jSTypeRegistry2.createParameters(jSTypeArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00353");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition0.setPositionInformation(15, 43, 49, 36);
        int int6 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00354");
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
        boolean boolean43 = jSTypeExpression42.isOptionalArg();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        boolean boolean56 = objectType55.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry59.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSType67.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSType67.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType70 = jSType67.restrictByNotNullOrUndefined();
        boolean boolean71 = objectType55.isSubtype(jSType70);
        com.google.javascript.rhino.jstype.JSType jSType73 = objectType55.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        boolean boolean79 = jSTypeRegistry76.resetImplicitPrototype(jSType77, objectType78);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry76.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSType84.dereference();
        java.lang.String str86 = objectType85.getDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair87 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) objectType55, (com.google.javascript.rhino.jstype.JSType) objectType85);
        com.google.javascript.rhino.jstype.JSType jSType89 = objectType85.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean90 = jSTypeExpression42.equals((java.lang.Object) jSType89);
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList94 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node93);
        boolean boolean95 = node93.isTrue();
        java.lang.String str96 = node93.getString();
        boolean boolean97 = jSTypeExpression42.equals((java.lang.Object) str96);
        boolean boolean98 = jSTypeExpression42.isVarArgs();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(cloneableList94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00355");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        boolean boolean4 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00356");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        boolean boolean13 = jSTypeRegistry9.shouldTolerateUndefinedValues();
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
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry9.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType40, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        java.lang.String str50 = jSType49.toAnnotationString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = cloneableList6.remove((java.lang.Object) jSType49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Named type with empty name component" + "'", str50, "Named type with empty name component");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00357");
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
        boolean boolean34 = parameterizedType30.isNoResolvedType();
        java.lang.String str35 = parameterizedType30.getReferenceName();
        boolean boolean36 = parameterizedType30.isUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00358");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isRegexpType();
        boolean boolean13 = objectType11.isUnknownType();
        boolean boolean14 = objectType11.isString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00359");
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
        java.lang.String str21 = node6.getString();
        boolean boolean22 = node6.isParamList();
        java.util.Set<java.lang.String> strSet23 = node6.getDirectives();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = node6.getExistingIntProp(51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 51");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNull(staticSourceFile24);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00360");
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
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType35 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList36 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType35);
        com.google.javascript.jscomp.CodingConvention.SubclassType[] subclassTypeArray37 = new com.google.javascript.jscomp.CodingConvention.SubclassType[] { subclassType35 };
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList38 = com.google.common.collect.ImmutableList.of(subclassTypeArray37);
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
        org.junit.Assert.assertTrue("'" + subclassType35 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType35.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList36);
        org.junit.Assert.assertNotNull(subclassTypeArray37);
        org.junit.Assert.assertNotNull(subclassTypeList38);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00361");
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
        java.lang.String str58 = jSDocInfo2.getVersion();
        boolean boolean59 = jSDocInfo2.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList60 = jSDocInfo2.getExtendedInterfaces();
        boolean boolean61 = jSDocInfo2.isExterns();
        boolean boolean62 = jSDocInfo2.isConstructor();
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
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00362");
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
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        node23.removeProp((int) (short) 10);
        boolean boolean26 = node23.isFromExterns();
        boolean boolean27 = cloneableList13.remove((java.lang.Object) boolean26);
        int int28 = cloneableList13.size();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable33 = cloneableList13.set(29, (java.lang.Cloneable) node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 29, Size: 3");
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00363");
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
        com.google.javascript.rhino.InputId inputId47 = node42.getInputId();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.isOr();
        boolean boolean53 = node50.isSetterDef();
        node50.setSourceFileForTesting("{proxy:{proxy:{1763454178}}}");
        node50.setLineno((int) 'a');
        boolean boolean58 = node50.isAssignAdd();
        boolean boolean59 = node42.isEquivalentTo(node50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
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
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00364");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isInterface();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        boolean boolean4 = jSDocInfo0.isOverride();
        java.lang.String str5 = jSDocInfo0.getVersion();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00365");
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
        boolean boolean66 = functionType63.removeProperty("({proxy:{proxy:{1874555938}}})");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate67 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType63.setValidator(jSTypePredicate67);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00366");
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
        boolean boolean34 = parameterizedType30.isNoResolvedType();
        java.lang.String str35 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(jSType36);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00367");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        java.util.Iterator<java.lang.Cloneable> cloneableItor8 = cloneableList6.iterator();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList16 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList20 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node19);
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { node11, node15, node19 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList22 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList22, cloneableArray21);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition24 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str25 = stringPosition24.getItem();
        boolean boolean26 = cloneableList22.remove((java.lang.Object) str25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isFalse();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node33);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList38 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node37);
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { node29, node33, node37 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList40 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList40, cloneableArray39);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition42 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str43 = stringPosition42.getItem();
        boolean boolean44 = cloneableList40.remove((java.lang.Object) str43);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream45 = cloneableList40.stream();
        boolean boolean46 = cloneableList22.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList40);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator47 = cloneableList22.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = cloneableList6.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableItor8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(cloneableList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(cloneableList20);
        org.junit.Assert.assertNotNull(cloneableArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(cloneableList38);
        org.junit.Assert.assertNotNull(cloneableArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cloneableStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cloneableSpliterator47);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00368");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean5 = objectType4.isFunctionPrototypeType();
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
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType70.getReturnType();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean76 = node75.isTrue();
        boolean boolean77 = node75.isOr();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean81 = node80.isTrue();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) 0, node75, node80, 49, 49);
        boolean boolean85 = node75.isAssignAdd();
        boolean boolean86 = objectType4.defineInferredProperty("{proxy:{proxy:{1874555938}}}", jSType71, node75);
        boolean boolean87 = jSType71.isVoidType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00369");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        jSTypeRegistry2.forwardDeclareType("{proxy:{proxy:{1874555938}}}");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean29 = node28.isQuotedString();
        node28.setWasEmptyNode(false);
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
        com.google.javascript.rhino.jstype.ObjectType objectType97 = functionType95.getImplicitPrototype();
        boolean boolean98 = functionType95.isString();
        com.google.javascript.rhino.jstype.ObjectType objectType99 = jSTypeRegistry2.createObjectType("{proxy:{proxy:{233769208}}}", node28, (com.google.javascript.rhino.jstype.ObjectType) functionType95);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
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
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00370");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        boolean boolean67 = parameterizedType42.canBeCalled();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType42.getJSDocInfo();
        boolean boolean70 = parameterizedType42.isNativeObjectType();
        java.util.Set set71 = parameterizedType42.getOwnPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(parameterizedType42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(objectType63);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00371");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        boolean boolean6 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = node9.getJSType();
        boolean boolean12 = cloneableList3.contains((java.lang.Object) jSType11);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(52, nodeArray15, 49, 38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable19 = cloneableList3.set(51, (java.lang.Cloneable) node18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00372");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        boolean boolean46 = parameterizedType43.isAllType();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean49 = objectType11.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType43, node48);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = parameterizedType43.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope51 = parameterizedType43.getParentScope();
        boolean boolean52 = parameterizedType43.isEnumElementType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(parameterizedType43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertNull(jSTypeStaticScope51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00373");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        boolean boolean15 = jSTypeRegistry12.resetImplicitPrototype(jSType13, objectType14);
        boolean boolean16 = jSTypeRegistry12.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        boolean boolean29 = objectType28.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = objectType28.getCtorImplementedInterfaces();
        boolean boolean31 = objectType28.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry34.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSType42.dereference();
        boolean boolean44 = objectType43.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = objectType43.getCtorImplementedInterfaces();
        boolean boolean46 = objectType43.isNativeObjectType();
        boolean boolean47 = objectType28.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType43);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry12.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType43, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        boolean boolean71 = jSTypeRegistry68.resetImplicitPrototype(jSType69, objectType70);
        boolean boolean72 = jSTypeRegistry68.shouldTolerateUndefinedValues();
        jSTypeRegistry68.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry68.createUnionType(jSTypeArray74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry12.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType64, false, jSTypeArray74);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = functionType76.getBindReturnType(100);
        int int79 = functionType78.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType78.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType78.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean84 = functionType78.isConstructor();
        boolean boolean86 = functionType78.isPropertyTypeInferred("function (): {proxy:{410214344}}");
        com.google.javascript.rhino.ErrorReporter errorReporter87 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry89 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter87, true);
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType91 = null;
        boolean boolean92 = jSTypeRegistry89.resetImplicitPrototype(jSType90, objectType91);
        boolean boolean93 = jSTypeRegistry89.shouldTolerateUndefinedValues();
        jSTypeRegistry89.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry89.createUnionType(jSTypeArray95);
        com.google.javascript.rhino.jstype.FunctionType functionType97 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType78, jSTypeArray95);
        boolean boolean98 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertNotNull(functionType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00374");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        java.lang.String str5 = node2.getString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean9 = jSDocInfo8.isInterface();
        java.lang.String str10 = jSDocInfo8.getOriginalCommentString();
        boolean boolean11 = jSDocInfo8.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.isInterface();
        jSDocInfo12.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo16.isInterface();
        java.lang.String str18 = jSDocInfo16.getOriginalCommentString();
        boolean boolean19 = jSDocInfo16.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.isInterface();
        boolean boolean22 = jSDocInfo20.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo20.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.isInterface();
        jSDocInfo24.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.isInterface();
        boolean boolean30 = jSDocInfo28.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.isInterface();
        boolean boolean33 = jSDocInfo31.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo31.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        boolean boolean37 = jSDocInfo35.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo35.getEnumParameterType();
        boolean boolean39 = jSDocInfo35.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean41 = jSDocInfo40.isInterface();
        java.lang.String str42 = jSDocInfo40.getOriginalCommentString();
        boolean boolean43 = jSDocInfo40.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.isInterface();
        java.lang.String str46 = jSDocInfo44.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo44.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.isInterface();
        jSDocInfo48.setLicense("");
        boolean boolean52 = jSDocInfo48.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.isInterface();
        jSDocInfo53.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        boolean boolean59 = jSDocInfo57.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo57.getEnumParameterType();
        boolean boolean61 = jSDocInfo57.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray62 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo53, jSDocInfo57 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList63 = com.google.common.collect.ImmutableList.of(jSDocInfo6, jSDocInfo8, jSDocInfo12, jSDocInfo16, jSDocInfo20, jSDocInfo24, jSDocInfo28, jSDocInfo31, jSDocInfo35, jSDocInfo40, jSDocInfo44, jSDocInfo48, jSDocInfoArray62);
        node2.setJSDocInfo(jSDocInfo12);
        boolean boolean65 = node2.isScript();
        boolean boolean66 = node2.isQualifiedName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(jSTypeExpression47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSTypeExpression60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSDocInfoArray62);
        org.junit.Assert.assertNotNull(jSDocInfoList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00375");
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
        java.util.Set set52 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.getPropertyType("{proxy:{proxy:{1004792283}}}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType30.collapseUnion();
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
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSType55);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00376");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(41, node3, (int) (short) 1, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        boolean boolean11 = node9.isFalse();
        boolean boolean12 = node9.isScript();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList16 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node15);
        boolean boolean17 = node15.isString();
        node15.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node20 = node9.srcref(node15);
        boolean boolean21 = node15.isNumber();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.hasOneChild();
        boolean boolean27 = node24.isVarArgs();
        node24.removeProp(48);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node24);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildrenAfter(node15, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(cloneableList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00377");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        boolean boolean16 = node14.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node20, node23, node27, node32, (int) (byte) 1, 4095);
        boolean boolean38 = node14.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node40 = node14.getAncestor(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean48 = node47.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node47, node51, node56, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0, node14, node61, (int) (short) 100, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        boolean boolean83 = jSTypeRegistry80.resetImplicitPrototype(jSType81, objectType82);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry80.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSType88.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSType88.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSType88.restrictByNotNullOrUndefined();
        boolean boolean92 = objectType76.isSubtype(jSType91);
        boolean boolean93 = objectType76.isStringValueType();
        boolean boolean94 = objectType76.isNoType();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry2.createEnumType("({proxy:{proxy:{1874555938}}})", node61, (com.google.javascript.rhino.jstype.JSType) objectType76);
        boolean boolean96 = enumType95.hasReferenceName();
        boolean boolean97 = enumType95.isNativeObjectType();
        boolean boolean99 = enumType95.hasProperty("(|function (): )");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00378");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList5.reverse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        boolean boolean11 = cloneableList10.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition12 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int13 = namePosition12.getStartLine();
        int int14 = namePosition12.getStartLine();
        int int15 = cloneableList10.lastIndexOf((java.lang.Object) namePosition12);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream16 = cloneableList10.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cloneableList6.removeAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(cloneableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(cloneableStream16);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00379");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean4 = node3.isScript();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isTrue();
        boolean boolean9 = node7.isBreak();
        boolean boolean10 = node7.isNot();
        node3.addChildrenToBack(node7);
        boolean boolean12 = node3.isRegExp();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeCollection13);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00380");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        boolean boolean16 = node14.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node20, node23, node27, node32, (int) (byte) 1, 4095);
        boolean boolean38 = node14.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node40 = node14.getAncestor(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean48 = node47.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node47, node51, node56, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0, node14, node61, (int) (short) 100, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        boolean boolean83 = jSTypeRegistry80.resetImplicitPrototype(jSType81, objectType82);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry80.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSType88.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSType88.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSType88.restrictByNotNullOrUndefined();
        boolean boolean92 = objectType76.isSubtype(jSType91);
        boolean boolean93 = objectType76.isStringValueType();
        boolean boolean94 = objectType76.isNoType();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry2.createEnumType("({proxy:{proxy:{1874555938}}})", node61, (com.google.javascript.rhino.jstype.JSType) objectType76);
        java.util.Set<java.lang.String> strSet96 = objectType76.getPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertNotNull(strSet96);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00381");
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
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList46 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node45);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList47 = cloneableList46.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList48 = cloneableList46.asList();
        boolean boolean49 = jSTypeExpression42.equals((java.lang.Object) cloneableList46);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression42);
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
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(cloneableList46);
        org.junit.Assert.assertNotNull(cloneableList47);
        org.junit.Assert.assertNotNull(cloneableList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression50);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00382");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        java.util.Iterator<java.lang.Cloneable> cloneableItor7 = cloneableList6.iterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList8 = cloneableList6.reverse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = cloneableList12.asList();
        boolean boolean14 = cloneableList12.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = cloneableList12.asList();
        boolean boolean16 = cloneableList6.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cloneableList6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(cloneableItor7);
        org.junit.Assert.assertNotNull(cloneableList8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(cloneableList12);
        org.junit.Assert.assertNotNull(cloneableList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00383");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable7 = cloneableList3.remove(29);
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
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00384");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isFalse();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isTrue();
        boolean boolean25 = node23.hasOneChild();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isTrue();
        boolean boolean30 = node28.isBreak();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 1, node16, node19, node23, node28, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isFalse();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean46 = node45.isTrue();
        boolean boolean47 = node45.hasOneChild();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.isBreak();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node41, node45, node50, (int) (byte) 1, 4095);
        node55.detachChildren();
        node55.setVarArgs(true);
        node33.addChildToFront(node55);
        boolean boolean60 = node33.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            cloneableList3.add(49, (java.lang.Cloneable) node33);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00385");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("function (): {proxy:{410214344}}");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean3 = typePosition2.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean5 = typePosition4.hasBrackets();
        boolean boolean6 = typePosition4.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition7.setPositionInformation(15, 43, 49, 36);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition13 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean14 = typePosition13.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean16 = typePosition15.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition17 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int18 = namePosition17.getStartLine();
        int int19 = namePosition17.getPositionOnEndLine();
        int int20 = namePosition17.getPositionOnStartLine();
        int int21 = namePosition17.getStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition22 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList23 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) namePosition17, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition22);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList24 = com.google.common.collect.ImmutableList.of(typePosition2, typePosition4, typePosition7, typePosition13, typePosition15, typePosition22);
        boolean boolean25 = inputId1.equals((java.lang.Object) typePosition15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeSourcePositionList23);
        org.junit.Assert.assertNotNull(typePositionList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00386");
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
        node16.removeProp(30);
        node16.addSuppression("{proxy:{proxy:{2014603671}}}");
        boolean boolean26 = node16.isThrow();
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node16);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 0, node16, node28, node32, 29, 2);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00387");
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
        int int68 = functionType66.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.dereference();
        boolean boolean71 = functionType66.removeProperty("unknown");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType66.cloneWithoutArrowType();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00388");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property73 = functionType66.getSlot("function (): {proxy:{1975023194}}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType66.getTopMostDefiningType("false");
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
        org.junit.Assert.assertNull(property73);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00389");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = functionType63.getParameters();
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
        org.junit.Assert.assertNotNull(nodeIterable66);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00390");
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
        com.google.javascript.rhino.jstype.EnumElementType enumElementType34 = parameterizedType30.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType35 = enumElementType34.autobox();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(enumElementType34);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00391");
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
        java.util.Iterator<java.lang.Cloneable> cloneableItor23 = cloneableList13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Cloneable> cloneableItor25 = cloneableList13.listIterator(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 53");
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
        org.junit.Assert.assertNotNull(cloneableItor23);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00392");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        boolean boolean16 = node14.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node20, node23, node27, node32, (int) (byte) 1, 4095);
        boolean boolean38 = node14.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node40 = node14.getAncestor(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean48 = node47.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node47, node51, node56, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0, node14, node61, (int) (short) 100, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        boolean boolean83 = jSTypeRegistry80.resetImplicitPrototype(jSType81, objectType82);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry80.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSType88.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSType88.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSType88.restrictByNotNullOrUndefined();
        boolean boolean92 = objectType76.isSubtype(jSType91);
        boolean boolean93 = objectType76.isStringValueType();
        boolean boolean94 = objectType76.isNoType();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry2.createEnumType("({proxy:{proxy:{1874555938}}})", node61, (com.google.javascript.rhino.jstype.JSType) objectType76);
        boolean boolean96 = enumType95.hasReferenceName();
        boolean boolean97 = enumType95.isNativeObjectType();
        boolean boolean99 = enumType95.hasOwnProperty("function (): {proxy:{929267642}}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00393");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        boolean boolean16 = node14.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node20, node23, node27, node32, (int) (byte) 1, 4095);
        boolean boolean38 = node14.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node40 = node14.getAncestor(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean48 = node47.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node47, node51, node56, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0, node14, node61, (int) (short) 100, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        boolean boolean83 = jSTypeRegistry80.resetImplicitPrototype(jSType81, objectType82);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry80.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSType88.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSType88.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSType88.restrictByNotNullOrUndefined();
        boolean boolean92 = objectType76.isSubtype(jSType91);
        boolean boolean93 = objectType76.isStringValueType();
        boolean boolean94 = objectType76.isNoType();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry2.createEnumType("({proxy:{proxy:{1874555938}}})", node61, (com.google.javascript.rhino.jstype.JSType) objectType76);
        boolean boolean96 = enumType95.hasReferenceName();
        boolean boolean97 = enumType95.isNativeObjectType();
        boolean boolean99 = enumType95.removeProperty("{proxy:{proxy:{649633010}}}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00394");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = parameterizedType35.toMaybeParameterizedType();
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
        org.junit.Assert.assertNotNull(parameterizedType42);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00395");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        java.lang.Class<?> wildcardClass24 = jSTypeRegistry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00396");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 15);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00397");
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
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType52.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType80 = unionType79.unboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(unionType79);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00398");
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
        java.lang.Object[] objArray88 = cloneableList9.toArray();
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList92 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node91);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList93 = cloneableList92.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = cloneableList9.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(cloneableList92);
        org.junit.Assert.assertNotNull(cloneableList93);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00399");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
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
        boolean boolean71 = node50.isSyntheticBlock();
        boolean boolean72 = node50.isFor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable73 = cloneableList5.set(8191, (java.lang.Cloneable) node50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(cloneableList3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertNotNull(cloneableList5);
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00400");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14);
        boolean boolean16 = node14.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 1, node20, node23, node27, node32, (int) (byte) 1, 4095);
        boolean boolean38 = node14.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node40 = node14.getAncestor(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean48 = node47.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean52 = node51.isTrue();
        boolean boolean53 = node51.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node47, node51, node56, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0, node14, node61, (int) (short) 100, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        boolean boolean77 = objectType76.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        boolean boolean83 = jSTypeRegistry80.resetImplicitPrototype(jSType81, objectType82);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry80.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSType88.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSType88.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSType88.restrictByNotNullOrUndefined();
        boolean boolean92 = objectType76.isSubtype(jSType91);
        boolean boolean93 = objectType76.isStringValueType();
        boolean boolean94 = objectType76.isNoType();
        com.google.javascript.rhino.jstype.EnumType enumType95 = jSTypeRegistry2.createEnumType("({proxy:{proxy:{1874555938}}})", node61, (com.google.javascript.rhino.jstype.JSType) objectType76);
        boolean boolean96 = enumType95.hasReferenceName();
        boolean boolean97 = enumType95.isNativeObjectType();
        com.google.javascript.rhino.Node node99 = enumType95.getPropertyNode("{proxy:{proxy:{2085879732}}}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(cloneableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(node99);
    }
}
