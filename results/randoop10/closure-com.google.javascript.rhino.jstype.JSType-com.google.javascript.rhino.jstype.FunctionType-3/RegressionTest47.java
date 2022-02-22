import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("hi!");
        jSDocInfo0.setLicense("Unknown class name");
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean9 = jSDocInfo0.isInterface();
        jSDocInfo0.setLicense("(OR  [source_file: Not declared as a type name])");
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int3 = typePosition2.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int5 = typePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int8 = typePosition7.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList10 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition2, typePosition4, typePosition6, typePosition7, typePosition9);
        int int11 = typePosition2.getStartLine();
        boolean boolean12 = typePosition2.hasBrackets();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.hasChildren();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = null;
        int int21 = node19.getIndexOfChild(node20);
        node19.putProp((int) (short) 1, (java.lang.Object) 1);
        node19.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node15.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean29 = node28.wasEmptyNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = null;
        int int34 = node32.getIndexOfChild(node33);
        node32.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean38 = node32.isDec();
        boolean boolean39 = node28.isEquivalentToTyped(node32);
        boolean boolean40 = node28.isNumber();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node28.siblings();
        typePosition2.setItem(node28);
        int int43 = typePosition2.getPositionOnStartLine();
        com.google.javascript.rhino.Node node44 = typePosition2.getItem();
        int int45 = node44.getCharno();
        boolean boolean46 = node44.isWhile();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(typePositionList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        boolean boolean92 = typeList91.isEmpty();
        java.lang.String str93 = typeList91.toString();
        java.lang.String str94 = typeList91.toString();
        java.util.Spliterator<java.lang.reflect.Type> typeSpliterator95 = typeList91.spliterator();
        java.lang.String str96 = typeList91.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type98 = typeList91.remove(104);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str93, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str94, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeSpliterator95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str96, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        int int2 = node1.getLineno();
        com.google.javascript.rhino.Node node3 = node1.getFirstChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isNot();
        com.google.javascript.rhino.Node node3 = node1.cloneNode();
        com.google.javascript.rhino.Node node4 = node1.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.isSetterDef();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        com.google.common.collect.ImmutableList<java.util.Collection<java.lang.reflect.Type>> typeCollectionList92 = com.google.common.collect.ImmutableList.of((java.util.Collection<java.lang.reflect.Type>) typeList91);
        java.lang.Object[] objArray93 = typeList91.toArray();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList94 = typeList91.asList();
        int int95 = typeList94.size();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList96 = typeList94.asList();
        boolean boolean97 = typeList96.isEmpty();
        int int98 = typeList96.size();
        // The following exception was thrown during execution in test generation
        try {
            typeList96.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertNotNull(typeCollectionList92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeList94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 18 + "'", int95 == 18);
        org.junit.Assert.assertNotNull(typeList96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 18 + "'", int98 == 18);
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        java.util.Iterator<java.lang.String> strItor8 = strSet7.iterator();
        java.util.Iterator<java.lang.String> strItor9 = strSet7.iterator();
        java.util.Iterator<java.lang.String> strItor10 = strSet7.iterator();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        boolean boolean92 = typeList91.isEmpty();
        java.util.stream.Stream<java.lang.reflect.Type> typeStream93 = typeList91.stream();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList94 = typeList91.asList();
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type> typeItor95 = typeList94.listIterator();
        boolean boolean96 = typeItor95.hasPrevious();
        int int97 = typeItor95.nextIndex();
        boolean boolean98 = typeItor95.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            typeItor95.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeStream93);
        org.junit.Assert.assertNotNull(typeList94);
        org.junit.Assert.assertNotNull(typeItor95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = null;
        int int8 = node6.getIndexOfChild(node7);
        node6.putProp((int) (short) 1, (java.lang.Object) 1);
        node6.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node2.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean16 = node15.wasEmptyNode();
        boolean boolean17 = node15.isNoSideEffectsCall();
        boolean boolean18 = node15.wasEmptyNode();
        int int19 = node15.getSourcePosition();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "java.io.IOException: Not declared as a type name", 46, 1);
        node4.setWasEmptyNode(true);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.Marker marker2 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker2.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker2.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker5 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker5.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker5.getName();
        com.google.javascript.rhino.JSDocInfo.Marker marker8 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = marker8.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker10 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition11 = marker10.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition12 = marker10.getType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList13 = com.google.common.collect.ImmutableList.of(marker2, marker5, marker8, marker10);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition14 = marker5.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition15 = marker5.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker16 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = marker16.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition18 = marker16.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition19 = marker16.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition20 = marker16.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition21 = marker16.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.Marker marker22 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition23 = marker22.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition24 = marker22.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker25 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition26 = marker25.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition27 = marker25.getName();
        com.google.javascript.rhino.JSDocInfo.Marker marker28 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition29 = marker28.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker30 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = marker30.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = marker30.getType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList33 = com.google.common.collect.ImmutableList.of(marker22, marker25, marker28, marker30);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition34 = marker28.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition35 = marker28.getName();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList36 = com.google.common.collect.ImmutableList.of(marker0, marker5, marker16, marker28);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition37 = marker28.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition38 = marker28.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition39 = marker28.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition40 = marker28.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition9);
        org.junit.Assert.assertNull(typePosition11);
        org.junit.Assert.assertNull(typePosition12);
        org.junit.Assert.assertNotNull(markerList13);
        org.junit.Assert.assertNull(stringPosition14);
        org.junit.Assert.assertNull(nodeSourcePosition15);
        org.junit.Assert.assertNull(typePosition17);
        org.junit.Assert.assertNull(typePosition18);
        org.junit.Assert.assertNull(typePosition19);
        org.junit.Assert.assertNull(typePosition20);
        org.junit.Assert.assertNull(stringPosition21);
        org.junit.Assert.assertNull(typePosition23);
        org.junit.Assert.assertNull(typePosition24);
        org.junit.Assert.assertNull(stringPosition26);
        org.junit.Assert.assertNull(stringPosition27);
        org.junit.Assert.assertNull(typePosition29);
        org.junit.Assert.assertNull(typePosition31);
        org.junit.Assert.assertNull(typePosition32);
        org.junit.Assert.assertNotNull(markerList33);
        org.junit.Assert.assertNull(nodeSourcePosition34);
        org.junit.Assert.assertNull(stringPosition35);
        org.junit.Assert.assertNotNull(markerList36);
        org.junit.Assert.assertNull(typePosition37);
        org.junit.Assert.assertNull(stringPosition38);
        org.junit.Assert.assertNull(stringPosition39);
        org.junit.Assert.assertNull(typePosition40);
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = null;
        int int19 = node17.getIndexOfChild(node18);
        node14.addChildToBack(node17);
        int int21 = node2.getIndexOfChild(node14);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.hasChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = null;
        int int30 = node28.getIndexOfChild(node29);
        node28.putProp((int) (short) 1, (java.lang.Object) 1);
        node28.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node37 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean38 = node37.wasEmptyNode();
        com.google.javascript.rhino.Node node39 = node2.useSourceInfoFrom(node37);
        java.lang.String str43 = node37.toString(false, false, true);
        boolean boolean44 = node37.isNot();
        boolean boolean45 = node37.isWhile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = new com.google.javascript.rhino.JSTypeExpression(node37, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        boolean boolean48 = node37.isFor();
        boolean boolean49 = node37.isDec();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = node52.getParent();
        boolean boolean54 = node52.isArrayLit();
        boolean boolean55 = node52.isThrow();
        boolean boolean56 = node52.isInstanceOf();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node63 = null;
        int int64 = node62.getIndexOfChild(node63);
        node59.addChildToBack(node62);
        com.google.javascript.rhino.Node node66 = node59.getNext();
        boolean boolean67 = node59.isFalse();
        node52.addChildrenToBack(node59);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(0, "Not declared as a constructor");
        boolean boolean72 = node59.isEquivalentToTyped(node71);
        com.google.javascript.rhino.Node node73 = node59.getFirstChild();
        node59.setString("Not declared as a constructor");
        com.google.javascript.rhino.Node node76 = node59.getNext();
        com.google.javascript.rhino.Node node77 = node37.clonePropsFrom(node59);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        node77.setJSType(jSType78);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "OR " + "'", str43, "OR ");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(node77);
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        node3.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int12 = node3.getSideEffectFlags();
        node3.setSourceEncodedPositionForTree(1);
        boolean boolean15 = node3.isCase();
        boolean boolean16 = node3.isThrow();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = null;
        int int21 = node19.getIndexOfChild(node20);
        node19.putProp((int) (short) 1, (java.lang.Object) 1);
        node19.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int28 = node19.getSideEffectFlags();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = null;
        int int36 = node34.getIndexOfChild(node35);
        node31.addChildToBack(node34);
        com.google.javascript.rhino.Node node38 = node31.getNext();
        com.google.javascript.rhino.Node node39 = node19.useSourceInfoFromForTree(node31);
        boolean boolean40 = node39.isBreak();
        int int41 = node39.getLength();
        node3.addChildrenToFront(node39);
        node3.setString("");
        boolean boolean46 = node3.getBooleanProp(35);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = null;
        int int52 = node50.getIndexOfChild(node51);
        node50.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean56 = node50.isGetterDef();
        boolean boolean57 = node50.isInc();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(32, node50, 3, 1);
        boolean boolean61 = node3.isEquivalentTo(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, 52, 36);
        int int65 = node60.getCharno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.hasEnumParameterType();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(49);
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setThrows();
        boolean boolean5 = sideEffectFlags1.areAllFlagsSet();
        boolean boolean6 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setMutatesThis();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = null;
        int int7 = node5.getIndexOfChild(node6);
        node2.addChildToBack(node5);
        java.util.Set<java.lang.String> strSet9 = node5.getDirectives();
        boolean boolean10 = node5.isFor();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node5.new FileLevelJsDocBuilder();
        boolean boolean12 = node5.isVarArgs();
        boolean boolean13 = node5.isCatch();
        boolean boolean14 = node5.isAdd();
        boolean boolean15 = node5.isIn();
        com.google.javascript.rhino.Node node16 = node5.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '#', 39, 49);
        boolean boolean4 = node3.isDo();
        boolean boolean5 = node3.isAssign();
        boolean boolean6 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = null;
        int int11 = node9.getIndexOfChild(node10);
        node9.putProp((int) (short) 1, (java.lang.Object) 1);
        node9.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int18 = node9.getSideEffectFlags();
        int int19 = node9.getChildCount();
        boolean boolean20 = node9.isIf();
        int int21 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isContinue();
        int int26 = node24.getSourcePosition();
        boolean boolean27 = node24.isLabelName();
        node24.setSourceFileForTesting("OR ");
        boolean boolean30 = node24.isParamList();
        com.google.javascript.rhino.Node node31 = node9.useSourceInfoIfMissingFrom(node24);
        node3.addChildToFront(node24);
        boolean boolean33 = node24.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(40, nodeArray7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(48, nodeArray7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) '4', nodeArray7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(32, nodeArray7);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(16, nodeArray7);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(38, nodeArray7);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = null;
        int int18 = node16.getIndexOfChild(node17);
        node16.putProp((int) (short) 1, (java.lang.Object) 1);
        node16.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int25 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = null;
        int int33 = node31.getIndexOfChild(node32);
        node28.addChildToBack(node31);
        int int35 = node16.getIndexOfChild(node28);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.hasChildren();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = null;
        int int44 = node42.getIndexOfChild(node43);
        node42.putProp((int) (short) 1, (java.lang.Object) 1);
        node42.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean52 = node51.wasEmptyNode();
        com.google.javascript.rhino.Node node53 = node16.useSourceInfoFrom(node51);
        boolean boolean54 = node16.isCatch();
        boolean boolean55 = node16.isTrue();
        boolean boolean56 = node16.isCatch();
        com.google.javascript.rhino.Node node57 = node16.removeFirstChild();
        boolean boolean58 = node16.isBreak();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean62 = node61.hasChildren();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node66 = null;
        int int67 = node65.getIndexOfChild(node66);
        node65.putProp((int) (short) 1, (java.lang.Object) 1);
        node65.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node61.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile75 = null;
        node65.setStaticSourceFile(staticSourceFile75);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile77 = node65.getStaticSourceFile();
        com.google.javascript.rhino.Node node78 = node65.getLastSibling();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node85 = null;
        int int86 = node84.getIndexOfChild(node85);
        node81.addChildToBack(node84);
        com.google.javascript.rhino.Node node88 = node81.getNext();
        com.google.javascript.rhino.Node node89 = node65.copyInformationFrom(node81);
        com.google.javascript.rhino.Node node90 = node65.getFirstChild();
        boolean boolean91 = node65.isInc();
        com.google.javascript.rhino.Node node92 = node16.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.jstype.JSType jSType93 = node92.getJSType();
        boolean boolean94 = node92.isSyntheticBlock();
        com.google.javascript.rhino.Node node97 = new com.google.javascript.rhino.Node(39, node13, node92, 44, 32);
        boolean boolean98 = node92.isReturn();
        boolean boolean99 = node92.isInstanceOf();
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(staticSourceFile77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        java.util.ListIterator<java.lang.reflect.Type> typeItor92 = typeList91.listIterator();
        boolean boolean93 = typeList91.isEmpty();
        java.lang.String str94 = typeList91.toString();
        java.util.Spliterator<java.lang.reflect.Type> typeSpliterator95 = typeList91.spliterator();
        java.util.ListIterator<java.lang.reflect.Type> typeItor97 = typeList91.listIterator(1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertNotNull(typeItor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str94, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeSpliterator95);
        org.junit.Assert.assertNotNull(typeItor97);
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getModifies();
        java.lang.String str5 = jSDocInfo0.toString();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean8 = jSDocInfo7.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo7.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo7.getTemplateTypeNames();
        boolean boolean11 = jSDocInfo7.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo7.getThisType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo7.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection15 = jSDocInfo14.getMarkers();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo14.getParameterNames();
        boolean boolean17 = jSDocInfo14.isDeprecated();
        java.lang.String str18 = jSDocInfo14.getReturnDescription();
        boolean boolean19 = jSDocInfo14.isConstructor();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo14.getThrownTypes();
        boolean boolean21 = jSDocInfo14.containsDeclaration();
        boolean boolean22 = jSDocInfo14.hasModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.isNoShadow();
        boolean boolean25 = jSDocInfo23.isConstant();
        java.lang.String str26 = jSDocInfo23.getVersion();
        java.util.Set<java.lang.String> strSet27 = jSDocInfo23.getModifies();
        boolean boolean28 = jSDocInfo23.isIdGenerator();
        java.lang.String str29 = jSDocInfo23.getVersion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection31 = jSDocInfo30.getMarkers();
        java.util.Set<java.lang.String> strSet32 = jSDocInfo30.getParameterNames();
        boolean boolean33 = jSDocInfo30.isDeprecated();
        java.lang.String str34 = jSDocInfo30.getReturnDescription();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList37 = jSDocInfo35.getImplementedInterfaces();
        boolean boolean38 = jSDocInfo35.isNoSideEffects();
        java.lang.String str39 = jSDocInfo35.getLicense();
        int int40 = jSDocInfo35.getParameterCount();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo7, jSDocInfo14, jSDocInfo23, jSDocInfo30, jSDocInfo35);
        java.util.Collection<java.lang.String> strCollection42 = jSDocInfo23.getAuthors();
        java.lang.String str43 = jSDocInfo23.getVersion();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection44 = jSDocInfo23.getTypeNodes();
        boolean boolean45 = jSDocInfo23.hasModifies();
        java.lang.String str46 = jSDocInfo23.getFileOverview();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNotNull(jSTypeExpressionList13);
        org.junit.Assert.assertNotNull(markerCollection15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(markerCollection31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertNull(strCollection42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(nodeCollection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        int int12 = node2.getChildCount();
        boolean boolean13 = node2.isIf();
        boolean boolean14 = node2.isGetElem();
        boolean boolean15 = node2.isQuotedString();
        boolean boolean16 = node2.isQualifiedName();
        boolean boolean17 = node2.isFunction();
        boolean boolean18 = node2.isDelProp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        boolean boolean5 = node2.isThrow();
        boolean boolean6 = node2.isInstanceOf();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = null;
        int int14 = node12.getIndexOfChild(node13);
        node9.addChildToBack(node12);
        com.google.javascript.rhino.Node node16 = node9.getNext();
        boolean boolean17 = node9.isFalse();
        node2.addChildrenToBack(node9);
        boolean boolean19 = node9.isRegExp();
        boolean boolean20 = node9.isLocalResultCall();
        boolean boolean21 = node9.isIf();
        boolean boolean22 = node9.hasMoreThanOneChild();
        com.google.javascript.rhino.InputId inputId24 = new com.google.javascript.rhino.InputId("STRING hi! 100");
        node9.setInputId(inputId24);
        boolean boolean26 = node9.isSetterDef();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = null;
        int int9 = node7.getIndexOfChild(node8);
        node7.putProp((int) (short) 1, (java.lang.Object) 1);
        node7.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isContinue();
        boolean boolean22 = node19.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(42, node16, node19, 42, (int) (byte) 100);
        boolean boolean26 = node16.isNE();
        boolean boolean27 = node16.hasChildren();
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("JSDocInfo");
        java.lang.String str30 = inputId29.getIdName();
        java.lang.String str31 = inputId29.getIdName();
        node16.setInputId(inputId29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = null;
        int int40 = node38.getIndexOfChild(node39);
        node35.addChildToBack(node38);
        node35.putIntProp(54, 2);
        boolean boolean45 = node35.isThrow();
        java.lang.String str46 = node35.getSourceFileName();
        com.google.javascript.rhino.InputId inputId48 = new com.google.javascript.rhino.InputId("(((hi!)))");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isContinue();
        boolean boolean55 = node52.getBooleanProp((int) (byte) 100);
        boolean boolean56 = node52.isString();
        boolean boolean57 = node52.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node61 = null;
        int int62 = node60.getIndexOfChild(node61);
        node60.putProp((int) (short) 1, (java.lang.Object) 1);
        node60.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int69 = node60.getSideEffectFlags();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node76 = null;
        int int77 = node75.getIndexOfChild(node76);
        node72.addChildToBack(node75);
        int int79 = node60.getIndexOfChild(node72);
        boolean boolean80 = node60.isBreak();
        boolean boolean81 = node60.isDo();
        boolean boolean82 = node60.isUnscopedQualifiedName();
        boolean boolean83 = node60.isParamList();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(0, node52, node60);
        boolean boolean85 = node52.isFalse();
        boolean boolean86 = inputId48.equals((java.lang.Object) node52);
        java.lang.String str87 = inputId48.getIdName();
        node35.setInputId(inputId48);
        boolean boolean89 = inputId29.equals((java.lang.Object) inputId48);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "JSDocInfo" + "'", str30, "JSDocInfo");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JSDocInfo" + "'", str31, "JSDocInfo");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "(((hi!)))" + "'", str87, "(((hi!)))");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean6 = jSDocInfo0.isExport();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        java.lang.Object[] objArray9 = strSet8.toArray();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(36, "JSDocInfo", 2, 0);
        boolean boolean5 = node4.isObjectLit();
        boolean boolean6 = node4.isCall();
        node4.detachChildren();
        boolean boolean8 = node4.isNew();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = null;
        int int8 = node6.getIndexOfChild(node7);
        node6.putProp((int) (short) 1, (java.lang.Object) 1);
        node6.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node2.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable16 = node2.getAncestors();
        boolean boolean17 = node2.hasChildren();
        boolean boolean18 = node2.isString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isContinue();
        boolean boolean24 = node21.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isContinue();
        node27.setQuotedString();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        com.google.javascript.rhino.Node node34 = node32.getLastSibling();
        node34.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = null;
        int int41 = node39.getIndexOfChild(node40);
        node39.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean45 = node39.isDec();
        com.google.javascript.rhino.Node node46 = node34.useSourceInfoIfMissingFromForTree(node39);
        com.google.javascript.rhino.Node node47 = node27.srcrefTree(node46);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node47.getStaticSourceFile();
        int int50 = staticSourceFile48.getLineOffset(39);
        int int52 = staticSourceFile48.getColumnOfOffset(41);
        node21.setStaticSourceFile(staticSourceFile48);
        java.lang.String str54 = staticSourceFile48.getName();
        node2.setStaticSourceFile(staticSourceFile48);
        boolean boolean56 = staticSourceFile48.isExtern();
        boolean boolean57 = staticSourceFile48.isExtern();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(ancestorIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(staticSourceFile48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2147483648) + "'", int50 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Not declared as a type name" + "'", str54, "Not declared as a type name");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        boolean boolean5 = node2.isThrow();
        boolean boolean6 = node2.isInstanceOf();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = null;
        int int14 = node12.getIndexOfChild(node13);
        node9.addChildToBack(node12);
        com.google.javascript.rhino.Node node16 = node9.getNext();
        boolean boolean17 = node9.isFalse();
        node2.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(0, "Not declared as a constructor");
        boolean boolean22 = node9.isEquivalentToTyped(node21);
        com.google.javascript.rhino.Node node23 = node9.getFirstChild();
        int int24 = node9.getCharno();
        com.google.javascript.rhino.InputId inputId25 = node9.getInputId();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(inputId25);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        boolean boolean5 = node2.isDebugger();
        java.lang.String str6 = node2.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isContinue();
        boolean boolean12 = node9.getBooleanProp((int) (byte) 100);
        boolean boolean13 = node9.isString();
        boolean boolean14 = node9.isNoSideEffectsCall();
        node2.addChildToFront(node9);
        int int16 = node2.getSourcePosition();
        boolean boolean17 = node2.wasEmptyNode();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = null;
        int int22 = node20.getIndexOfChild(node21);
        node20.putProp((int) (short) 1, (java.lang.Object) 1);
        node20.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int29 = node20.getSideEffectFlags();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node36 = null;
        int int37 = node35.getIndexOfChild(node36);
        node32.addChildToBack(node35);
        int int39 = node20.getIndexOfChild(node32);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node47 = null;
        int int48 = node46.getIndexOfChild(node47);
        node46.putProp((int) (short) 1, (java.lang.Object) 1);
        node46.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean56 = node55.wasEmptyNode();
        com.google.javascript.rhino.Node node57 = node20.useSourceInfoFrom(node55);
        boolean boolean58 = node20.isCatch();
        boolean boolean59 = node20.isTrue();
        boolean boolean60 = node20.isCatch();
        boolean boolean61 = node20.isLabel();
        boolean boolean62 = node2.hasChild(node20);
        int int63 = node2.getLength();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable64 = node2.getAncestors();
        com.google.javascript.rhino.jstype.JSType jSType65 = node2.getJSType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(ancestorIterable64);
        org.junit.Assert.assertNull(jSType65);
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        java.util.ListIterator<java.lang.reflect.Type> typeItor92 = typeList91.listIterator();
        java.util.stream.Stream<java.lang.reflect.Type> typeStream93 = typeList91.stream();
        int int94 = typeList91.size();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList95 = typeList91.asList();
        int int96 = typeList91.size();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList97 = typeList91.asList();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList98 = typeList91.reverse();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList99 = typeList91.asList();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertNotNull(typeItor92);
        org.junit.Assert.assertNotNull(typeStream93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 18 + "'", int94 == 18);
        org.junit.Assert.assertNotNull(typeList95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 18 + "'", int96 == 18);
        org.junit.Assert.assertNotNull(typeList97);
        org.junit.Assert.assertNotNull(typeList98);
        org.junit.Assert.assertNotNull(typeList99);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        com.google.javascript.rhino.Node node5 = node2.getAncestor((int) (short) 0);
        node5.setType(50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node5.getJsDocBuilderForNode();
        node5.setSourceFileForTesting("JSDocInfo");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isContinue();
        int int15 = node13.getSourcePosition();
        com.google.javascript.rhino.Node node16 = node13.removeChildren();
        boolean boolean17 = node5.hasChild(node13);
        boolean boolean18 = node13.isQuotedString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node21.getParent();
        boolean boolean23 = node21.isArrayLit();
        node21.setType(54);
        com.google.javascript.rhino.Node node26 = node13.copyInformationFromForTree(node21);
        boolean boolean27 = node21.isLocalResultCall();
        node21.setCharno(39);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str4 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getEnumParameterType();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isExport();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo8.getMarkers();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo8.getParameterNames();
        boolean boolean11 = jSDocInfo8.isDeprecated();
        java.lang.String str12 = jSDocInfo8.getReturnDescription();
        boolean boolean13 = jSDocInfo8.isConstructor();
        boolean boolean14 = jSDocInfo8.shouldPreserveTry();
        boolean boolean15 = jSDocInfo8.isExpose();
        boolean boolean16 = jSDocInfo8.hasBaseType();
        int int17 = jSDocInfo8.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.Iterator<java.lang.String> strItor27 = strSet25.iterator();
        strSet25.clear();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        boolean boolean30 = strSet25.equals((java.lang.Object) visibility29);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility32 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.Iterator<java.lang.String> strItor43 = strSet41.iterator();
        strSet41.clear();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility45 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        boolean boolean46 = strSet41.equals((java.lang.Object) visibility45);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList47 = com.google.common.collect.ImmutableList.of(visibility18, visibility29, visibility31, visibility32, visibility33, visibility34, visibility45);
        jSDocInfo8.setVisibility(visibility18);
        jSDocInfo0.setVisibility(visibility18);
        boolean boolean50 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList51 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet52 = jSDocInfo0.getSuppressions();
        boolean boolean53 = strSet52.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator54 = strSet52.spliterator();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + visibility18 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility18.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + visibility29 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility29.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + visibility31 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility31.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + visibility32 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility32.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility34 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility34.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertTrue("'" + visibility45 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility45.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(visibilityList47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strSpliterator54);
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setPositionInformation((int) 'a', 35, (int) 'a', 48);
        java.lang.String str8 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (byte) 1, (int) '#', (int) (byte) 10, 5);
        int int14 = stringPosition0.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition[] stringPositionArray15 = new com.google.javascript.rhino.JSDocInfo.StringPosition[] { stringPosition0 };
        com.google.javascript.rhino.JSDocInfo.StringPosition[][] stringPositionArray16 = new com.google.javascript.rhino.JSDocInfo.StringPosition[][] { stringPositionArray15 };
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition17 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str18 = stringPosition17.getItem();
        int int19 = stringPosition17.getPositionOnEndLine();
        stringPosition17.setPositionInformation((int) 'a', 35, (int) 'a', 48);
        java.lang.String str25 = stringPosition17.getItem();
        stringPosition17.setPositionInformation((int) (byte) 1, (int) '#', (int) (byte) 10, 5);
        int int31 = stringPosition17.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition[] stringPositionArray32 = new com.google.javascript.rhino.JSDocInfo.StringPosition[] { stringPosition17 };
        com.google.javascript.rhino.JSDocInfo.StringPosition[][] stringPositionArray33 = new com.google.javascript.rhino.JSDocInfo.StringPosition[][] { stringPositionArray32 };
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition34 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str35 = stringPosition34.getItem();
        int int36 = stringPosition34.getPositionOnEndLine();
        stringPosition34.setPositionInformation((int) 'a', 35, (int) 'a', 48);
        java.lang.String str42 = stringPosition34.getItem();
        stringPosition34.setPositionInformation((int) (byte) 1, (int) '#', (int) (byte) 10, 5);
        int int48 = stringPosition34.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition[] stringPositionArray49 = new com.google.javascript.rhino.JSDocInfo.StringPosition[] { stringPosition34 };
        com.google.javascript.rhino.JSDocInfo.StringPosition[][] stringPositionArray50 = new com.google.javascript.rhino.JSDocInfo.StringPosition[][] { stringPositionArray49 };
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition51 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str52 = stringPosition51.getItem();
        int int53 = stringPosition51.getPositionOnEndLine();
        stringPosition51.setPositionInformation((int) 'a', 35, (int) 'a', 48);
        java.lang.String str59 = stringPosition51.getItem();
        stringPosition51.setPositionInformation((int) (byte) 1, (int) '#', (int) (byte) 10, 5);
        int int65 = stringPosition51.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition[] stringPositionArray66 = new com.google.javascript.rhino.JSDocInfo.StringPosition[] { stringPosition51 };
        com.google.javascript.rhino.JSDocInfo.StringPosition[][] stringPositionArray67 = new com.google.javascript.rhino.JSDocInfo.StringPosition[][] { stringPositionArray66 };
        com.google.javascript.rhino.JSDocInfo.StringPosition[][][] stringPositionArray68 = new com.google.javascript.rhino.JSDocInfo.StringPosition[][][] { stringPositionArray16, stringPositionArray33, stringPositionArray50, stringPositionArray67 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition[][]> stringPositionArrayList69 = com.google.common.collect.ImmutableList.of(stringPositionArray68);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition[][]> stringPositionArrayList70 = com.google.common.collect.ImmutableList.of(stringPositionArray68);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(stringPositionArray15);
        org.junit.Assert.assertNotNull(stringPositionArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(stringPositionArray32);
        org.junit.Assert.assertNotNull(stringPositionArray33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(stringPositionArray49);
        org.junit.Assert.assertNotNull(stringPositionArray50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 5 + "'", int65 == 5);
        org.junit.Assert.assertNotNull(stringPositionArray66);
        org.junit.Assert.assertNotNull(stringPositionArray67);
        org.junit.Assert.assertNotNull(stringPositionArray68);
        org.junit.Assert.assertNotNull(stringPositionArrayList69);
        org.junit.Assert.assertNotNull(stringPositionArrayList70);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str10 = jSDocInfo0.getFileOverview();
        boolean boolean11 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        node2.setQuotedString();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        com.google.javascript.rhino.Node node9 = node7.getLastSibling();
        node9.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = null;
        int int16 = node14.getIndexOfChild(node15);
        node14.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean20 = node14.isDec();
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node22 = node2.srcrefTree(node21);
        node22.setCharno(0);
        boolean boolean25 = node22.isAdd();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = null;
        int int30 = node28.getIndexOfChild(node29);
        node28.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean34 = node28.isDec();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.hasChildren();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = null;
        int int44 = node42.getIndexOfChild(node43);
        node42.putProp((int) (short) 1, (java.lang.Object) 1);
        node42.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node38.useSourceInfoIfMissingFromForTree(node42);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean55 = node54.isContinue();
        boolean boolean57 = node54.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(42, node51, node54, 42, (int) (byte) 100);
        boolean boolean61 = node51.isNE();
        int int62 = node28.getIndexOfChild(node51);
        int int63 = node28.getChildCount();
        boolean boolean64 = node28.isDo();
        com.google.javascript.rhino.Node node65 = node22.copyInformationFrom(node28);
        node65.removeProp(1);
        boolean boolean68 = node65.isThis();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(155658);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node71 = node65.clonePropsFrom(node70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        boolean boolean92 = typeList91.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type> typeItor93 = typeList91.listIterator();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList94 = typeList91.asList();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeItor93);
        org.junit.Assert.assertNotNull(typeList94);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair6 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType4, jSType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair6.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType8, jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair10.typeA;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType.TypePair> typePairList12 = com.google.common.collect.ImmutableList.of(typePair2, typePair6, typePair10);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair6.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair6.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair6.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair6.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair6.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(typePairList12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags1.setMutatesThis();
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), nodeArray4, 1, (int) '#');
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(49, nodeArray4, 48, (int) (byte) 0);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(48, nodeArray4);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(41, nodeArray4, (int) (short) 10, 30);
        boolean boolean15 = node14.isExprResult();
        boolean boolean16 = node14.isIn();
        node14.setVarArgs(false);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        node3.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int12 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = null;
        int int20 = node18.getIndexOfChild(node19);
        node15.addChildToBack(node18);
        int int22 = node3.getIndexOfChild(node15);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.hasChildren();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = null;
        int int31 = node29.getIndexOfChild(node30);
        node29.putProp((int) (short) 1, (java.lang.Object) 1);
        node29.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFromForTree(node29);
        boolean boolean39 = node38.wasEmptyNode();
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFrom(node38);
        com.google.javascript.rhino.jstype.JSType jSType41 = node3.getJSType();
        boolean boolean42 = node3.isFor();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = null;
        int int47 = node45.getIndexOfChild(node46);
        node45.putProp((int) (short) 1, (java.lang.Object) 1);
        node45.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int54 = node45.getSideEffectFlags();
        boolean boolean55 = node45.isParamList();
        int int56 = node45.getLineno();
        boolean boolean57 = node45.hasChildren();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean61 = node60.hasChildren();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node65 = null;
        int int66 = node64.getIndexOfChild(node65);
        node64.putProp((int) (short) 1, (java.lang.Object) 1);
        node64.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node73 = node60.useSourceInfoIfMissingFromForTree(node64);
        node73.addSuppression("");
        node73.setSourceEncodedPosition(37);
        com.google.javascript.rhino.Node node78 = node73.getNext();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node82 = node81.getParent();
        boolean boolean83 = node81.isArrayLit();
        node81.setOptionalArg(true);
        int int86 = node81.getType();
        boolean boolean87 = node81.isLabelName();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(48, node3, node45, node73, node81);
        boolean boolean89 = node81.isNot();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = null;
        int int7 = node5.getIndexOfChild(node6);
        node2.addChildToBack(node5);
        node2.putIntProp(54, 2);
        java.lang.String str12 = node2.getSourceFileName();
        com.google.javascript.rhino.Node node13 = node2.cloneNode();
        int int14 = node13.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = node13.getLastSibling();
        boolean boolean16 = node15.isIf();
        boolean boolean17 = node15.isInc();
        // The following exception was thrown during execution in test generation
        try {
            node15.setSideEffectFlags(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.clearSideEffectFlags();
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 100, 38, 42);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int3 = typePosition2.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int5 = typePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int8 = typePosition7.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList10 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition2, typePosition4, typePosition6, typePosition7, typePosition9);
        int int11 = typePosition9.getEndLine();
        boolean boolean12 = typePosition9.hasBrackets();
        boolean boolean13 = typePosition9.hasBrackets();
        int int14 = typePosition9.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(typePositionList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isContinue();
        boolean boolean6 = node3.getBooleanProp((int) (byte) 100);
        boolean boolean7 = node3.isString();
        boolean boolean8 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = null;
        int int13 = node11.getIndexOfChild(node12);
        node11.putProp((int) (short) 1, (java.lang.Object) 1);
        node11.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int20 = node11.getSideEffectFlags();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = null;
        int int28 = node26.getIndexOfChild(node27);
        node23.addChildToBack(node26);
        int int30 = node11.getIndexOfChild(node23);
        boolean boolean31 = node11.isBreak();
        boolean boolean32 = node11.isDo();
        boolean boolean33 = node11.isUnscopedQualifiedName();
        boolean boolean34 = node11.isParamList();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0, node3, node11);
        node11.setLength(18);
        boolean boolean38 = node11.isInc();
        boolean boolean39 = node11.isWith();
        boolean boolean40 = node11.isThis();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(45);
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.clearSideEffectFlags();
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 3, (int) '4', 47);
        java.lang.String str4 = node3.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(1, 49, 18);
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(196708);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = null;
        int int11 = node9.getIndexOfChild(node10);
        node9.putProp((int) (short) 1, (java.lang.Object) 1);
        node9.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int18 = node9.getSideEffectFlags();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = null;
        int int26 = node24.getIndexOfChild(node25);
        node21.addChildToBack(node24);
        com.google.javascript.rhino.Node node28 = node21.getNext();
        com.google.javascript.rhino.Node node29 = node9.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isContinue();
        node32.setQuotedString();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        com.google.javascript.rhino.Node node39 = node37.getLastSibling();
        node39.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = null;
        int int46 = node44.getIndexOfChild(node45);
        node44.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean50 = node44.isDec();
        com.google.javascript.rhino.Node node51 = node39.useSourceInfoIfMissingFromForTree(node44);
        com.google.javascript.rhino.Node node52 = node32.srcrefTree(node51);
        boolean boolean53 = node51.isString();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(40, node5, node29, node51, (int) (byte) -1, 3);
        boolean boolean57 = node5.isVoid();
        boolean boolean58 = node5.isReturn();
        node5.setSourceEncodedPositionForTree(46);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node5.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder61.append("(true)");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        boolean boolean8 = jSDocInfo0.isExpose();
        java.lang.String str9 = jSDocInfo0.getVersion();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("OR ");
        stringPosition0.setItem("([class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode])");
        stringPosition0.setItem("java.io.IOException");
        int int9 = stringPosition0.getEndLine();
        int int10 = stringPosition0.getStartLine();
        java.lang.String str11 = stringPosition0.getItem();
        int int12 = stringPosition0.getStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException" + "'", str11, "java.io.IOException");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean4 = node2.isStringKey();
        node2.addSuppression("");
        node2.setType((int) (short) 1);
        com.google.javascript.rhino.Node node9 = node2.getParent();
        node2.putIntProp((int) (short) 100, 21);
        boolean boolean13 = node2.isWith();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        boolean boolean5 = node2.isDebugger();
        boolean boolean6 = node2.isFromExterns();
        node2.setSourceEncodedPosition(35);
        com.google.javascript.rhino.Node node9 = node2.cloneTree();
        node9.addSuppression("(java.io.IOException)");
        boolean boolean12 = node9.isLocalResultCall();
        com.google.javascript.rhino.Node node13 = node9.getFirstChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = null;
        int int8 = node6.getIndexOfChild(node7);
        node6.putProp((int) (short) 1, (java.lang.Object) 1);
        node6.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node2.useSourceInfoIfMissingFromForTree(node6);
        node15.addSuppression("");
        boolean boolean18 = node15.isReturn();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = null;
        node15.setJSDocInfo(jSDocInfo19);
        boolean boolean21 = node15.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = new com.google.javascript.rhino.JSTypeExpression(node15, "DELPROP OR ");
        boolean boolean24 = jSTypeExpression23.isVarArgs();
        com.google.javascript.rhino.Node node25 = jSTypeExpression23.getRoot();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isContinue();
        boolean boolean5 = node3.isNE();
        boolean boolean6 = node3.isVoid();
        boolean boolean7 = node3.isArrayLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(40, 53, 4);
        boolean boolean12 = node3.isEquivalentToTyped(node11);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(24, node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray6 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type[]> typeArrayList7 = com.google.common.collect.ImmutableList.copyOf(typeArray6);
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray9 = new java.lang.reflect.Type[][] { typeArray8 };
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray12 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray13 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray15 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray16 = new java.lang.reflect.Type[][] { typeArray10, typeArray11, typeArray12, typeArray13, typeArray14, typeArray15 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type[]> typeArrayList17 = com.google.common.collect.ImmutableList.copyOf(typeArray16);
        java.lang.reflect.Type[] typeArray18 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray19 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray20 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray22 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray23 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray24 = new java.lang.reflect.Type[][] { typeArray18, typeArray19, typeArray20, typeArray21, typeArray22, typeArray23 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type[]> typeArrayList25 = com.google.common.collect.ImmutableList.copyOf(typeArray24);
        com.google.common.collect.ImmutableList<java.lang.reflect.Type[][]> typeArrayList26 = com.google.common.collect.ImmutableList.of(typeArray6, typeArray9, typeArray16, typeArray24);
        com.google.common.collect.ImmutableList<java.lang.reflect.Type[]> typeArrayList27 = com.google.common.collect.ImmutableList.of(typeArray9);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArrayList7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArrayList17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArrayList25);
        org.junit.Assert.assertNotNull(typeArrayList26);
        org.junit.Assert.assertNotNull(typeArrayList27);
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = null;
        int int19 = node17.getIndexOfChild(node18);
        node14.addChildToBack(node17);
        com.google.javascript.rhino.Node node21 = node14.getNext();
        com.google.javascript.rhino.Node node22 = node2.useSourceInfoFromForTree(node14);
        boolean boolean23 = node22.isFor();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = null;
        int int28 = node26.getIndexOfChild(node27);
        node26.putProp((int) (short) 1, (java.lang.Object) 1);
        node26.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int35 = node26.getSideEffectFlags();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = null;
        int int43 = node41.getIndexOfChild(node42);
        node38.addChildToBack(node41);
        int int45 = node26.getIndexOfChild(node38);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean49 = node48.hasChildren();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = null;
        int int54 = node52.getIndexOfChild(node53);
        node52.putProp((int) (short) 1, (java.lang.Object) 1);
        node52.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node61 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean62 = node61.wasEmptyNode();
        com.google.javascript.rhino.Node node63 = node26.useSourceInfoFrom(node61);
        com.google.javascript.rhino.jstype.JSType jSType64 = node63.getJSType();
        com.google.javascript.rhino.Node node65 = node22.useSourceInfoIfMissingFrom(node63);
        boolean boolean66 = node22.isFromExterns();
        boolean boolean67 = node22.isHook();
        node22.setCharno(159793);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        node3.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int12 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = null;
        int int20 = node18.getIndexOfChild(node19);
        node15.addChildToBack(node18);
        com.google.javascript.rhino.Node node22 = node15.getNext();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoFromForTree(node15);
        boolean boolean24 = node23.isExprResult();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(9, node23, 172032, 28);
        node23.removeProp(0);
        boolean boolean30 = node23.isGetProp();
        boolean boolean31 = node23.isExprResult();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = new com.google.javascript.rhino.JSTypeExpression(node23, "(java.io.IOException)");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = null;
        int int19 = node17.getIndexOfChild(node18);
        node14.addChildToBack(node17);
        int int21 = node2.getIndexOfChild(node14);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.hasChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = null;
        int int30 = node28.getIndexOfChild(node29);
        node28.putProp((int) (short) 1, (java.lang.Object) 1);
        node28.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node37 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean38 = node37.wasEmptyNode();
        com.google.javascript.rhino.Node node39 = node2.useSourceInfoFrom(node37);
        boolean boolean40 = node39.isBreak();
        node39.setIsSyntheticBlock(false);
        boolean boolean43 = node39.isAdd();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        node2.setQuotedString();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        com.google.javascript.rhino.Node node9 = node7.getLastSibling();
        node9.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = null;
        int int16 = node14.getIndexOfChild(node15);
        node14.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean20 = node14.isDec();
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node22 = node2.srcrefTree(node21);
        node22.setCharno(0);
        boolean boolean25 = node22.isAdd();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.hasChildren();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = null;
        int int34 = node32.getIndexOfChild(node33);
        node32.putProp((int) (short) 1, (java.lang.Object) 1);
        node32.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node41 = node28.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean42 = node22.hasChild(node32);
        node22.setType(118884);
        int int45 = node22.getSideEffectFlags();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean9 = node3.isDec();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = null;
        int int14 = node12.getIndexOfChild(node13);
        node12.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean18 = node12.isDec();
        boolean boolean19 = node3.hasChild(node12);
        boolean boolean20 = node12.isReturn();
        node12.setWasEmptyNode(true);
        boolean boolean23 = node12.isEmpty();
        boolean boolean24 = node12.isDefaultCase();
        boolean boolean25 = node12.isComma();
        boolean boolean26 = node12.isLabel();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = null;
        int int32 = node30.getIndexOfChild(node31);
        node30.putProp((int) (short) 1, (java.lang.Object) 1);
        node30.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int39 = node30.getSideEffectFlags();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = null;
        int int47 = node45.getIndexOfChild(node46);
        node42.addChildToBack(node45);
        int int49 = node30.getIndexOfChild(node42);
        boolean boolean50 = node30.isBreak();
        boolean boolean51 = node30.isDo();
        boolean boolean52 = node30.isUnscopedQualifiedName();
        boolean boolean53 = node30.isParamList();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(39, node30, 54, 35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoShadow();
        boolean boolean60 = jSDocInfo58.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression62 = jSDocInfo58.getParameterType("hi!");
        boolean boolean63 = jSDocInfo58.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = jSDocInfo58.getReturnType();
        node30.putProp(38, (java.lang.Object) jSDocInfo58);
        com.google.javascript.rhino.Node node66 = node30.detachFromParent();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node70 = null;
        int int71 = node69.getIndexOfChild(node70);
        node69.putProp((int) (short) 1, (java.lang.Object) 1);
        node69.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int78 = node69.getSideEffectFlags();
        int int79 = node69.getChildCount();
        java.lang.String str80 = node69.getString();
        node69.setLength(0);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 100, node12, node30, node69);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        com.google.javascript.rhino.Node node89 = node87.getLastSibling();
        node89.setSourceFileForTesting("Not declared as a type name");
        boolean boolean92 = node89.isWith();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(100, node89, 51, 10);
        com.google.javascript.rhino.Node node96 = node95.cloneNode();
        com.google.javascript.rhino.Node node97 = node83.srcref(node96);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jSTypeExpression62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSTypeExpression64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        boolean boolean7 = jSDocInfo0.hasType();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str9 = jSDocInfo0.toString();
        boolean boolean10 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("hi!");
        jSDocInfo0.setLicense("Unknown class name");
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        java.lang.String str8 = jSDocInfo0.getMeaning();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        int int10 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean11 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setPositionInformation((int) 'a', 35, (int) 'a', 48);
        java.lang.String str8 = stringPosition0.getItem();
        int int9 = stringPosition0.getStartLine();
        java.lang.String str10 = stringPosition0.getItem();
        java.lang.String str11 = stringPosition0.getItem();
        int int12 = stringPosition0.getEndLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int3 = typePosition2.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int5 = typePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int8 = typePosition7.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList10 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition2, typePosition4, typePosition6, typePosition7, typePosition9);
        com.google.javascript.rhino.Node node11 = typePosition0.getItem();
        int int12 = typePosition0.getStartLine();
        boolean boolean13 = typePosition0.hasBrackets();
        int int14 = typePosition0.getPositionOnEndLine();
        int int15 = typePosition0.getStartLine();
        int int16 = typePosition0.getPositionOnStartLine();
        int int17 = typePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(typePositionList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = null;
        int int8 = node6.getIndexOfChild(node7);
        node3.addChildToBack(node6);
        node3.setVarArgs(false);
        java.util.Set<java.lang.String> strSet12 = node3.getDirectives();
        boolean boolean13 = node3.isThis();
        java.lang.String str14 = node3.toString();
        boolean boolean15 = node3.isVar();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = null;
        int int23 = node21.getIndexOfChild(node22);
        node18.addChildToBack(node21);
        boolean boolean25 = node18.isThrow();
        node18.setSourceEncodedPositionForTree(1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(50, node3, node18);
        com.google.javascript.rhino.jstype.JSType jSType29 = node28.getJSType();
        boolean boolean30 = node28.isOptionalArg();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = node32.getJSDocInfo();
        int int34 = node32.getLength();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node32.children();
        boolean boolean36 = node32.isNew();
        boolean boolean37 = node32.isExprResult();
        boolean boolean38 = node28.isEquivalentTo(node32);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OR " + "'", str14, "OR ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(jSDocInfo33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        com.google.javascript.rhino.Node node5 = node2.getAncestor((int) (short) 0);
        node5.putBooleanProp((int) (short) 10, false);
        boolean boolean9 = node5.isDo();
        node5.setWasEmptyNode(true);
        boolean boolean12 = node5.isAssignAdd();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        java.lang.String str92 = typeList91.toString();
        boolean boolean93 = typeList91.isEmpty();
        java.lang.Object[] objArray94 = typeList91.toArray();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList95 = typeList91.asList();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str92, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeList95);
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(44, "java.io.IOException: java.io.IOException: (hi!)");
        com.google.javascript.rhino.Node node3 = node2.getFirstChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = null;
        int int6 = node4.getIndexOfChild(node5);
        node4.putProp((int) (short) 1, (java.lang.Object) 1);
        node4.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int13 = node4.getSideEffectFlags();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = null;
        int int21 = node19.getIndexOfChild(node20);
        node16.addChildToBack(node19);
        com.google.javascript.rhino.Node node23 = node16.getNext();
        com.google.javascript.rhino.Node node24 = node4.useSourceInfoFromForTree(node16);
        boolean boolean25 = node16.isNot();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node16, (int) ' ', (int) '4');
        boolean boolean29 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) '#', 39, 49);
        boolean boolean34 = node33.isDo();
        com.google.javascript.rhino.Node node35 = node28.srcref(node33);
        boolean boolean36 = node35.isWith();
        boolean boolean37 = node35.isBreak();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) '#', 39, 49);
        boolean boolean42 = node41.isDo();
        boolean boolean43 = node41.isAssign();
        boolean boolean44 = node41.isThrow();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node48 = null;
        int int49 = node47.getIndexOfChild(node48);
        node47.putProp((int) (short) 1, (java.lang.Object) 1);
        node47.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int56 = node47.getSideEffectFlags();
        int int57 = node47.getChildCount();
        boolean boolean58 = node47.isIf();
        int int59 = node47.getSourceOffset();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.isContinue();
        int int64 = node62.getSourcePosition();
        boolean boolean65 = node62.isLabelName();
        node62.setSourceFileForTesting("OR ");
        boolean boolean68 = node62.isParamList();
        com.google.javascript.rhino.Node node69 = node47.useSourceInfoIfMissingFrom(node62);
        node41.addChildToFront(node62);
        boolean boolean71 = node41.isComma();
        boolean boolean72 = node41.isComma();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(73778, node35, node41);
        boolean boolean74 = node41.isFor();
        node41.setWasEmptyNode(false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = null;
        int int19 = node17.getIndexOfChild(node18);
        node14.addChildToBack(node17);
        com.google.javascript.rhino.Node node21 = node14.getNext();
        com.google.javascript.rhino.Node node22 = node2.useSourceInfoFromForTree(node14);
        node22.setLength(48);
        int int25 = node22.getSourcePosition();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = null;
        int int33 = node31.getIndexOfChild(node32);
        node28.addChildToBack(node31);
        boolean boolean35 = node31.isTypeOf();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isContinue();
        node38.setQuotedString();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean44 = node43.hasChildren();
        com.google.javascript.rhino.Node node45 = node43.getLastSibling();
        node45.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = null;
        int int52 = node50.getIndexOfChild(node51);
        node50.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean56 = node50.isDec();
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoIfMissingFromForTree(node50);
        com.google.javascript.rhino.Node node58 = node38.srcrefTree(node57);
        node58.setCharno(0);
        node31.addChildrenToBack(node58);
        boolean boolean62 = node58.isString();
        boolean boolean63 = node58.isGetProp();
        java.lang.String str64 = node58.getString();
        boolean boolean65 = node58.wasEmptyNode();
        com.google.javascript.rhino.Node node66 = node22.copyInformationFrom(node58);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean70 = node69.hasChildren();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = null;
        int int75 = node73.getIndexOfChild(node74);
        node73.putProp((int) (short) 1, (java.lang.Object) 1);
        node73.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node82 = node69.useSourceInfoIfMissingFromForTree(node73);
        node82.addSuppression("");
        boolean boolean85 = node82.isReturn();
        node66.addChildrenToBack(node82);
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 42, 40);
        boolean boolean91 = node82.hasChild(node90);
        com.google.javascript.rhino.jstype.JSType jSType92 = node90.getJSType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(jSType92);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = null;
        int int4 = node2.getIndexOfChild(node3);
        node2.putProp((int) (short) 1, (java.lang.Object) 1);
        node2.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int11 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = null;
        int int19 = node17.getIndexOfChild(node18);
        node14.addChildToBack(node17);
        int int21 = node2.getIndexOfChild(node14);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.hasChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = null;
        int int30 = node28.getIndexOfChild(node29);
        node28.putProp((int) (short) 1, (java.lang.Object) 1);
        node28.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node37 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean38 = node37.wasEmptyNode();
        com.google.javascript.rhino.Node node39 = node2.useSourceInfoFrom(node37);
        com.google.javascript.rhino.jstype.JSType jSType40 = node2.getJSType();
        com.google.javascript.rhino.Node node41 = node2.cloneTree();
        boolean boolean42 = node41.isInc();
        int int43 = node41.getLength();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isNull();
        boolean boolean46 = node41.isThis();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getThrownTypes();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        java.lang.String str92 = typeList91.toString();
        com.google.common.collect.UnmodifiableIterator<java.lang.reflect.Type> typeItor93 = typeList91.iterator();
        java.util.Iterator<java.lang.reflect.Type> typeItor94 = typeList91.iterator();
        java.lang.String str95 = typeList91.toString();
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type> typeItor96 = typeList91.listIterator();
        java.util.Iterator<java.lang.reflect.Type> typeItor97 = typeList91.iterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str92, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeItor93);
        org.junit.Assert.assertNotNull(typeItor94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]" + "'", str95, "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertNotNull(typeItor96);
        org.junit.Assert.assertNotNull(typeItor97);
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet0.union(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet2.union(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet7.union(booleanLiteralSet9);
        boolean boolean12 = booleanLiteralSet9.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet13.union(booleanLiteralSet15);
        boolean boolean18 = booleanLiteralSet15.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = booleanLiteralSet15.union(booleanLiteralSet19);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet9.intersection(booleanLiteralSet15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = booleanLiteralSet23.union(booleanLiteralSet25);
        boolean boolean28 = booleanLiteralSet25.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet25.union(booleanLiteralSet29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet15.union(booleanLiteralSet29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet5.union(booleanLiteralSet15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = booleanLiteralSet34.union(booleanLiteralSet36);
        boolean boolean39 = booleanLiteralSet36.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = booleanLiteralSet40.union(booleanLiteralSet42);
        boolean boolean45 = booleanLiteralSet42.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = booleanLiteralSet42.union(booleanLiteralSet46);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet48 = booleanLiteralSet36.intersection(booleanLiteralSet42);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = booleanLiteralSet50.union(booleanLiteralSet52);
        boolean boolean55 = booleanLiteralSet52.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = booleanLiteralSet52.union(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = booleanLiteralSet42.union(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet59 = booleanLiteralSet15.union(booleanLiteralSet58);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = booleanLiteralSet60.union(booleanLiteralSet62);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = booleanLiteralSet15.union(booleanLiteralSet60);
        boolean boolean66 = booleanLiteralSet60.contains(false);
        boolean boolean68 = booleanLiteralSet60.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = booleanLiteralSet69.union(booleanLiteralSet71);
        boolean boolean74 = booleanLiteralSet71.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = booleanLiteralSet71.union(booleanLiteralSet75);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet80 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = booleanLiteralSet78.union(booleanLiteralSet80);
        boolean boolean83 = booleanLiteralSet80.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = booleanLiteralSet84.union(booleanLiteralSet86);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet88 = booleanLiteralSet80.union(booleanLiteralSet84);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = booleanLiteralSet75.union(booleanLiteralSet84);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet90 = booleanLiteralSet60.intersection(booleanLiteralSet89);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet48 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet48.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet59 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet59.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet80 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet80.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet88 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet88.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet90 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet90.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        jSDocInfo0.setDeprecated(true);
        boolean boolean6 = jSDocInfo0.hasParameter("Unknown class name");
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        boolean boolean9 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isHidden();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        jSDocInfo0.setDeprecated(true);
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(12, 100, 48);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = null;
        int int7 = node5.getIndexOfChild(node6);
        node2.addChildToBack(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.isNoShadow();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo9.getParameterNames();
        node2.setJSDocInfo(jSDocInfo9);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node2.getStaticSourceFile();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isNoShadow();
        boolean boolean16 = jSDocInfo14.hasThisType();
        boolean boolean18 = jSDocInfo14.hasParameterType("([class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode])");
        java.util.Set<java.lang.String> strSet19 = jSDocInfo14.getModifies();
        boolean boolean20 = strSet19.isEmpty();
        node2.setDirectives(strSet19);
        int int22 = strSet19.size();
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(40, nodeArray26);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray26);
        boolean boolean29 = node28.isNE();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) ' ', node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.hasChildren();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = null;
        int int39 = node37.getIndexOfChild(node38);
        node37.putProp((int) (short) 1, (java.lang.Object) 1);
        node37.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node33.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = null;
        node37.setStaticSourceFile(staticSourceFile47);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = node37.getStaticSourceFile();
        com.google.javascript.rhino.Node node50 = node37.getLastSibling();
        com.google.javascript.rhino.Node node51 = node37.removeFirstChild();
        boolean boolean52 = node37.isVoid();
        node30.addChildToFront(node37);
        boolean boolean54 = node30.isVar();
        boolean boolean55 = strSet19.contains((java.lang.Object) boolean54);
        java.util.stream.Stream[] streamArray57 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.reflect.Type>[] typeStreamArray58 = (java.util.stream.Stream<java.lang.reflect.Type>[]) streamArray57;
        com.google.common.collect.ImmutableList<java.util.stream.Stream<java.lang.reflect.Type>> typeStreamList59 = com.google.common.collect.ImmutableList.copyOf(typeStreamArray58);
        java.util.stream.BaseStream[] baseStreamArray61 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray62 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray61;
        com.google.common.collect.ImmutableList<java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>> typeBaseStreamList63 = com.google.common.collect.ImmutableList.of(typeBaseStreamArray62);
        java.util.stream.BaseStream[] baseStreamArray65 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray66 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray65;
        java.util.stream.BaseStream[] baseStreamArray68 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray69 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray68;
        com.google.common.collect.ImmutableList<java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>> typeBaseStreamList70 = com.google.common.collect.ImmutableList.of(typeBaseStreamArray69);
        java.util.stream.Stream[] streamArray72 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.reflect.Type>[] typeStreamArray73 = (java.util.stream.Stream<java.lang.reflect.Type>[]) streamArray72;
        com.google.common.collect.ImmutableList<java.util.stream.Stream<java.lang.reflect.Type>> typeStreamList74 = com.google.common.collect.ImmutableList.copyOf(typeStreamArray73);
        java.util.stream.Stream[] streamArray76 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.reflect.Type>[] typeStreamArray77 = (java.util.stream.Stream<java.lang.reflect.Type>[]) streamArray76;
        com.google.common.collect.ImmutableList<java.util.stream.Stream<java.lang.reflect.Type>> typeStreamList78 = com.google.common.collect.ImmutableList.copyOf(typeStreamArray77);
        java.util.stream.BaseStream[] baseStreamArray80 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray81 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray80;
        com.google.common.collect.ImmutableList<java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>> typeBaseStreamList82 = com.google.common.collect.ImmutableList.of(typeBaseStreamArray81);
        java.util.stream.BaseStream[] baseStreamArray84 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray85 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray84;
        java.util.stream.BaseStream[] baseStreamArray87 = new java.util.stream.BaseStream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[] typeBaseStreamArray88 = (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray87;
        com.google.common.collect.ImmutableList<java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>> typeBaseStreamList89 = com.google.common.collect.ImmutableList.of(typeBaseStreamArray88);
        com.google.common.collect.ImmutableList<java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]> typeBaseStreamArrayList90 = com.google.common.collect.ImmutableList.of((java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) typeStreamArray58, typeBaseStreamArray62, typeBaseStreamArray66, typeBaseStreamArray69, (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) typeStreamArray73, (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) typeStreamArray77, typeBaseStreamArray81, (java.util.stream.BaseStream<java.lang.reflect.Type, java.util.stream.Stream<java.lang.reflect.Type>>[]) baseStreamArray84, typeBaseStreamArray88);
        java.lang.AutoCloseable[] autoCloseableArray91 = strSet19.toArray((java.lang.AutoCloseable[]) typeBaseStreamArray88);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(staticSourceFile49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(streamArray57);
        org.junit.Assert.assertNotNull(typeStreamArray58);
        org.junit.Assert.assertNotNull(typeStreamList59);
        org.junit.Assert.assertNotNull(baseStreamArray61);
        org.junit.Assert.assertNotNull(typeBaseStreamArray62);
        org.junit.Assert.assertNotNull(typeBaseStreamList63);
        org.junit.Assert.assertNotNull(baseStreamArray65);
        org.junit.Assert.assertNotNull(typeBaseStreamArray66);
        org.junit.Assert.assertNotNull(baseStreamArray68);
        org.junit.Assert.assertNotNull(typeBaseStreamArray69);
        org.junit.Assert.assertNotNull(typeBaseStreamList70);
        org.junit.Assert.assertNotNull(streamArray72);
        org.junit.Assert.assertNotNull(typeStreamArray73);
        org.junit.Assert.assertNotNull(typeStreamList74);
        org.junit.Assert.assertNotNull(streamArray76);
        org.junit.Assert.assertNotNull(typeStreamArray77);
        org.junit.Assert.assertNotNull(typeStreamList78);
        org.junit.Assert.assertNotNull(baseStreamArray80);
        org.junit.Assert.assertNotNull(typeBaseStreamArray81);
        org.junit.Assert.assertNotNull(typeBaseStreamList82);
        org.junit.Assert.assertNotNull(baseStreamArray84);
        org.junit.Assert.assertNotNull(typeBaseStreamArray85);
        org.junit.Assert.assertNotNull(baseStreamArray87);
        org.junit.Assert.assertNotNull(typeBaseStreamArray88);
        org.junit.Assert.assertNotNull(typeBaseStreamList89);
        org.junit.Assert.assertNotNull(typeBaseStreamArrayList90);
        org.junit.Assert.assertNotNull(autoCloseableArray91);
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) -1, (int) (byte) 10, (int) ' ');
        boolean boolean4 = node3.isQualifiedName();
        boolean boolean5 = node3.isWith();
        boolean boolean6 = node3.isNull();
        boolean boolean7 = node3.isTry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = null;
        int int9 = node7.getIndexOfChild(node8);
        node7.putProp((int) (short) 1, (java.lang.Object) 1);
        node7.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isContinue();
        boolean boolean22 = node19.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(42, node16, node19, 42, (int) (byte) 100);
        boolean boolean26 = node25.isDec();
        com.google.javascript.rhino.Node node27 = node25.cloneTree();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node25.children();
        boolean boolean29 = node25.isDefaultCase();
        int int30 = node25.getChildCount();
        boolean boolean31 = node25.isTry();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) (short) 1, 16);
        int int36 = node35.getSourceOffset();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable37 = node35.getAncestors();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node38.isExprResult();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(ancestorIterable37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = null;
        int int9 = node7.getIndexOfChild(node8);
        node7.putProp((int) (short) 1, (java.lang.Object) 1);
        node7.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isContinue();
        boolean boolean22 = node19.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(42, node16, node19, 42, (int) (byte) 100);
        boolean boolean26 = node25.isDec();
        com.google.javascript.rhino.Node node27 = node25.cloneTree();
        boolean boolean28 = node25.isDo();
        java.lang.Object obj30 = node25.getProp((int) 'a');
        int int31 = node25.getChildCount();
        int int32 = node25.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 42 + "'", int32 == 42);
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        boolean boolean4 = node2.isAssign();
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.hasChildren();
        com.google.javascript.rhino.Node node11 = node9.getLastSibling();
        node11.setSourceFileForTesting("Not declared as a type name");
        boolean boolean14 = node11.isWith();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100, node11, 51, 10);
        com.google.javascript.rhino.Node node18 = node17.cloneNode();
        boolean boolean19 = node17.isFromExterns();
        com.google.javascript.rhino.Node node20 = node5.copyInformationFrom(node17);
        boolean boolean21 = node5.isCatch();
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.removeChild(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        node2.setQuotedString();
        boolean boolean6 = node2.isAnd();
        com.google.javascript.rhino.Node node7 = node2.cloneTree();
        boolean boolean8 = node7.isContinue();
        boolean boolean9 = node7.isSetterDef();
        boolean boolean10 = node7.isName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isExport();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo8.getMarkers();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo8.getParameterNames();
        boolean boolean11 = jSDocInfo8.isDeprecated();
        java.lang.String str12 = jSDocInfo8.getReturnDescription();
        boolean boolean13 = jSDocInfo8.isConstructor();
        boolean boolean14 = jSDocInfo8.shouldPreserveTry();
        boolean boolean15 = jSDocInfo8.isExpose();
        boolean boolean16 = jSDocInfo8.hasBaseType();
        int int17 = jSDocInfo8.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.Iterator<java.lang.String> strItor27 = strSet25.iterator();
        strSet25.clear();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        boolean boolean30 = strSet25.equals((java.lang.Object) visibility29);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility32 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.Iterator<java.lang.String> strItor43 = strSet41.iterator();
        strSet41.clear();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility45 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        boolean boolean46 = strSet41.equals((java.lang.Object) visibility45);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList47 = com.google.common.collect.ImmutableList.of(visibility18, visibility29, visibility31, visibility32, visibility33, visibility34, visibility45);
        jSDocInfo8.setVisibility(visibility18);
        jSDocInfo0.setVisibility(visibility18);
        java.lang.String str50 = jSDocInfo0.toString();
        com.google.javascript.rhino.Node node51 = jSDocInfo0.getAssociatedNode();
        boolean boolean52 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + visibility18 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility18.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + visibility29 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility29.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + visibility31 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility31.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + visibility32 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility32.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility34 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility34.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertTrue("'" + visibility45 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility45.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(visibilityList47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "JSDocInfo" + "'", str50, "JSDocInfo");
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        jSDocInfo0.setDeprecated(true);
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        boolean boolean7 = jSDocInfo0.hasThisType();
        jSDocInfo0.addSuppression("");
        java.lang.String str10 = jSDocInfo0.getVersion();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean12 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node13 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        node3.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int12 = node3.getSideEffectFlags();
        boolean boolean13 = node3.isParamList();
        int int14 = node3.getLineno();
        boolean boolean15 = node3.hasChildren();
        boolean boolean16 = node3.isBlock();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = null;
        int int21 = node19.getIndexOfChild(node20);
        node19.putProp((int) (short) 1, (java.lang.Object) 1);
        node19.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int28 = node19.getSideEffectFlags();
        int int29 = node19.getChildCount();
        boolean boolean30 = node19.isIf();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.hasChildren();
        com.google.javascript.rhino.Node node35 = node33.getParent();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = null;
        int int40 = node38.getIndexOfChild(node39);
        node38.putProp((int) (short) 1, (java.lang.Object) 1);
        boolean boolean44 = node38.isDec();
        boolean boolean45 = node38.isHook();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(31, node3, node19, node33, node38);
        boolean boolean47 = node19.isAssign();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        node19.addChildToBack(node50);
        int int52 = node50.getLineno();
        boolean boolean53 = node50.isFalse();
        boolean boolean54 = node50.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        node50.setJSType(jSType55);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node4 = null;
        int int5 = node3.getIndexOfChild(node4);
        node3.putProp((int) (short) 1, (java.lang.Object) 1);
        node3.putIntProp((int) (byte) 1, (int) (byte) 10);
        int int12 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = null;
        int int20 = node18.getIndexOfChild(node19);
        node15.addChildToBack(node18);
        com.google.javascript.rhino.Node node22 = node15.getNext();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoFromForTree(node15);
        boolean boolean24 = node3.isEmpty();
        com.google.javascript.rhino.Node node25 = node3.cloneNode();
        boolean boolean27 = node3.getBooleanProp((int) '4');
        boolean boolean28 = node3.isCatch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(52, "OR  [jsdoc_info: JSDocInfo]");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = null;
        int int39 = node37.getIndexOfChild(node38);
        node34.addChildToBack(node37);
        node34.putIntProp(54, 2);
        java.lang.String str44 = node34.getSourceFileName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node34.siblings();
        com.google.javascript.rhino.Node node46 = node31.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 100, (int) '#', 32);
        java.lang.String str51 = node50.getQualifiedName();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) -1, (int) (byte) 10, (int) ' ');
        node55.setCharno(3);
        boolean boolean58 = node50.hasChild(node55);
        boolean boolean59 = node50.isFor();
        node34.addChildToFront(node50);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(28, node3, node34, 51, (int) (short) 10);
        boolean boolean64 = node3.isThrow();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(44, "java.io.IOException: OR \n", 54, 4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node7.getParent();
        com.google.javascript.rhino.Node node10 = node7.getAncestor((int) (short) 0);
        node10.setType(50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node10.getJsDocBuilderForNode();
        node10.setSourceFileForTesting("JSDocInfo");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.isContinue();
        int int20 = node18.getSourcePosition();
        com.google.javascript.rhino.Node node21 = node18.removeChildren();
        boolean boolean22 = node10.hasChild(node18);
        boolean boolean23 = node18.isQuotedString();
        boolean boolean24 = node18.isObjectLit();
        node18.putProp((int) (short) 10, (java.lang.Object) "OR ");
        java.lang.String str28 = node18.getSourceFileName();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = null;
        int int33 = node31.getIndexOfChild(node32);
        int int34 = node31.getLength();
        com.google.javascript.rhino.Node node35 = node18.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean36 = node4.isEquivalentTo(node35);
        boolean boolean37 = node35.isLabelName();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = null;
        int int9 = node7.getIndexOfChild(node8);
        node7.putProp((int) (short) 1, (java.lang.Object) 1);
        node7.putIntProp((int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFromForTree(node7);
        node16.addSuppression("");
        boolean boolean19 = node16.isSwitch();
        boolean boolean20 = node16.isString();
        boolean boolean21 = node16.isStringKey();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) 'a', node16);
        boolean boolean23 = node22.isNot();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        java.lang.Class<?> wildcardClass4 = node2.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.hasChildren();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.hasChildren();
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.hasChildren();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.hasChildren();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.hasChildren();
        java.lang.Class<?> wildcardClass29 = node27.getClass();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.hasChildren();
        java.lang.Class<?> wildcardClass34 = node32.getClass();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.hasChildren();
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.hasChildren();
        java.lang.Class<?> wildcardClass44 = node42.getClass();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.hasChildren();
        java.lang.Class<?> wildcardClass49 = node47.getClass();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.hasChildren();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.hasChildren();
        java.lang.Class<?> wildcardClass59 = node57.getClass();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.hasChildren();
        java.lang.Class<?> wildcardClass64 = node62.getClass();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.hasChildren();
        java.lang.Class<?> wildcardClass69 = node67.getClass();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.hasChildren();
        java.lang.Class<?> wildcardClass74 = node72.getClass();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean78 = node77.hasChildren();
        java.lang.Class<?> wildcardClass79 = node77.getClass();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean83 = node82.hasChildren();
        java.lang.Class<?> wildcardClass84 = node82.getClass();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean88 = node87.hasChildren();
        java.lang.Class<?> wildcardClass89 = node87.getClass();
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] { wildcardClass64, wildcardClass69, wildcardClass74, wildcardClass79, wildcardClass84, wildcardClass89 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList91 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass9, (java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass29, (java.lang.reflect.Type) wildcardClass34, (java.lang.reflect.Type) wildcardClass39, (java.lang.reflect.Type) wildcardClass44, (java.lang.reflect.Type) wildcardClass49, (java.lang.reflect.Type) wildcardClass54, (java.lang.reflect.Type) wildcardClass59, typeArray90);
        boolean boolean92 = typeList91.isEmpty();
        java.util.stream.Stream<java.lang.reflect.Type> typeStream93 = typeList91.stream();
        boolean boolean94 = typeList91.isEmpty();
        java.lang.Object[] objArray95 = typeList91.toArray();
        boolean boolean96 = typeList91.isEmpty();
        java.util.Iterator<java.lang.reflect.Type> typeItor97 = typeList91.iterator();
        boolean boolean98 = typeList91.isEmpty();
        int int99 = typeList91.size();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeStream93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(typeItor97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 18 + "'", int99 == 18);
    }
}

