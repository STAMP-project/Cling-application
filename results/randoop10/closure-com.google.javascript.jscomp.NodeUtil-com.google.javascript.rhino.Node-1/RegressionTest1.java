import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0201");
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
        java.util.Spliterator<java.lang.String> strSpliterator21 = strSet6.spliterator();
        int int22 = strSet6.size();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), node32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), node39);
        boolean boolean44 = node43.isNE();
        node36.addChildToBack(node43);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry27.createFunctionType(jSType29, node43);
        int int47 = functionType46.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType46.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry24.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.Node node50 = functionType46.getRootNode();
        boolean boolean51 = strSet6.contains((java.lang.Object) functionType46);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType46.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType46.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType52);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0202");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        boolean boolean13 = node10.isAssignAdd();
        boolean boolean14 = node10.isQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(30, node7, node10, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node20);
        node24.setType(43);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node33);
        boolean boolean35 = node33.isBreak();
        boolean boolean36 = node33.isAssignAdd();
        boolean boolean37 = node33.hasMoreThanOneChild();
        java.lang.String str38 = node33.getQualifiedName();
        com.google.javascript.rhino.Node node39 = node24.copyInformationFromForTree(node33);
        boolean boolean40 = node33.isContinue();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.isOr();
        node43.setLineno(2);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, node43);
        java.lang.String str48 = node43.toStringTree();
        com.google.javascript.rhino.InputId inputId49 = com.google.javascript.jscomp.NodeUtil.getInputId(node43);
        boolean boolean50 = node43.isString();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceChild(node33, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node already has a parent.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "NUMBER -1.0 2\n" + "'", str48, "NUMBER -1.0 2\n");
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0203");
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
        // The following exception was thrown during execution in test generation
        try {
            node75.setString("NUMBER -1.0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 [length: 50] is not a string node");
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
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0204");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int1 = sideEffectFlags0.valueOf();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setAllFlags();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0205");
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
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator46 = nodeIterable45.spliterator();
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
        org.junit.Assert.assertNotNull(nodeSpliterator46);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0206");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.clearSideEffectFlags();
        int int2 = sideEffectFlags0.valueOf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0207");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        boolean boolean5 = node1.hasMoreThanOneChild();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        com.google.javascript.rhino.InputId inputId19 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        com.google.javascript.rhino.InputId inputId26 = com.google.javascript.jscomp.NodeUtil.getInputId(node23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), node23);
        boolean boolean28 = node27.isNE();
        node20.addChildToBack(node27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry11.createFunctionType(jSType13, node27);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType30.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType30.getPrototype();
        boolean boolean33 = jSTypeRegistry7.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType32);
        node1.setJSType((com.google.javascript.rhino.jstype.JSType) objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node45);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        boolean boolean57 = node56.isNE();
        node49.addChildToBack(node56);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry40.createFunctionType(jSType42, node56);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType59.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = functionType59.getPrototype();
        boolean boolean62 = jSTypeRegistry36.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isObjectLit();
        com.google.javascript.rhino.InputId inputId72 = com.google.javascript.jscomp.NodeUtil.getInputId(node69);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), node69);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.InputId inputId79 = com.google.javascript.jscomp.NodeUtil.getInputId(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1), node76);
        boolean boolean81 = node80.isNE();
        node73.addChildToBack(node80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry64.createFunctionType(jSType66, node80);
        int int84 = functionType83.getMaxArguments();
        boolean boolean85 = functionType83.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection86 = jSTypeRegistry36.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType83);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean90 = node89.hasOneChild();
        boolean boolean91 = node89.isObjectLit();
        com.google.javascript.rhino.InputId inputId92 = com.google.javascript.jscomp.NodeUtil.getInputId(node89);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((-1), node89);
        java.lang.String str94 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node93);
        node93.setLineno(15);
        functionType83.setSource(node93);
        boolean boolean98 = objectType32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType83);
        boolean boolean99 = objectType32.isBooleanObjectType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputId79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection86);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(inputId92);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            node17.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0209");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode22 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.isOr();
        boolean boolean37 = node35.isLabel();
        boolean boolean38 = node35.isAssignAdd();
        boolean boolean39 = node35.isQualifiedName();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(30, node32, node35, 4095, (int) (short) 0);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry1.createInterfaceType("Not declared as a type name", node42);
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
        org.junit.Assert.assertTrue("'" + resolveMode22 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode22.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0210");
        int int0 = com.google.javascript.rhino.Node.JSDOC_INFO_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0211");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.isExport();
        boolean boolean12 = jSDocInfo0.isNoSideEffects();
        java.lang.String str13 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0212");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node2.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship12 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0213");
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
        boolean boolean47 = functionType20.isNominalType();
        boolean boolean48 = functionType20.matchesObjectContext();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0214");
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
        boolean boolean27 = node21.isNoSideEffectsCall();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0215");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope69 = functionType65.getParentScope();
        java.lang.Iterable iterable70 = functionType65.getCtorImplementedInterfaces();
        boolean boolean71 = functionType65.isNumberValueType();
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope69);
        org.junit.Assert.assertNotNull(iterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0216");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.isOnlyModifiesThisCall();
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
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        node32.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind35 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node25, node32);
        node32.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node32.children();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node45);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec48 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str49 = assertionFunctionSpec48.getFunctionName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.isOr();
        node52.setLineno(2);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0, node52);
        com.google.javascript.rhino.Node node57 = assertionFunctionSpec48.getAssertedParam(node52);
        com.google.javascript.rhino.Node node58 = node45.srcref(node57);
        com.google.javascript.rhino.Node node59 = node32.useSourceInfoFrom(node58);
        node6.addChildToFront(node32);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.isOr();
        boolean boolean65 = node63.isLabel();
        boolean boolean66 = node63.isAssignAdd();
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceChild(node61, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NUMBER -1.0\n" + "'", str15, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0217");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        boolean boolean9 = node7.isAnd();
        boolean boolean10 = node7.isGetElem();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(46, nodeArray12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node20);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), node27);
        boolean boolean32 = node31.isNE();
        node24.addChildToBack(node31);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry15.createFunctionType(jSType17, node31);
        int int35 = functionType34.getMaxArguments();
        boolean boolean36 = functionType34.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.hasOneChild();
        boolean boolean45 = node43.isObjectLit();
        com.google.javascript.rhino.InputId inputId46 = com.google.javascript.jscomp.NodeUtil.getInputId(node43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node50);
        boolean boolean55 = node54.isNE();
        node47.addChildToBack(node54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry38.createFunctionType(jSType40, node54);
        boolean boolean58 = functionType57.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair59 = functionType34.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean60 = functionType34.isReturnTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry1.createConstructorType("Not declared as a type name", node7, node13, (com.google.javascript.rhino.jstype.JSType) functionType34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typePair59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0218");
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
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType20.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = functionType20.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(objectType25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0219");
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
        boolean boolean25 = node8.isVoid();
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
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0220");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope94 = functionType92.getParentScope();
        boolean boolean95 = functionType92.isEmptyType();
        boolean boolean96 = objectType67.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType92);
        boolean boolean97 = functionType92.canBeCalled();
        boolean boolean98 = functionType92.isNativeObjectType();
        boolean boolean99 = functionType92.isUnknownType();
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0221");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry4.getNativeFunctionType(jSTypeNative43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0222");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
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
        int int45 = functionType44.getMaxArguments();
        functionType23.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType44);
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType23.autoboxesTo();
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
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isObjectLit();
        com.google.javascript.rhino.InputId inputId78 = com.google.javascript.jscomp.NodeUtil.getInputId(node75);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), node75);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean83 = node82.hasOneChild();
        boolean boolean84 = node82.isObjectLit();
        com.google.javascript.rhino.InputId inputId85 = com.google.javascript.jscomp.NodeUtil.getInputId(node82);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((-1), node82);
        boolean boolean87 = node86.isNE();
        node79.addChildToBack(node86);
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry70.createFunctionType(jSType72, node86);
        int int90 = functionType89.getMaxArguments();
        functionType68.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        boolean boolean92 = functionType23.hasEqualCallType(functionType68);
        boolean boolean93 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = functionType23.toDebugHashCodeString();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(jSType47);
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
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(inputId78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(inputId85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0223");
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
        boolean boolean22 = functionType20.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0224");
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
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType20.collapseUnion();
        boolean boolean23 = functionType20.isNominalType();
        boolean boolean24 = functionType20.isNominalType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = functionType20.setValidator(jSTypePredicate25);
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
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0225");
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList1 = exceptionBuilder0.build();
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("hi!", throwable3);
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("hi!", throwable6);
        iOException4.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException("hi!", throwable10);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder15 = exceptionBuilder0.add((java.lang.Exception) iOException7);
        org.junit.Assert.assertNotNull(exceptionBuilder0);
        org.junit.Assert.assertNotNull(exceptionList1);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(exceptionBuilder15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0226");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
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
        int int45 = functionType44.getMaxArguments();
        functionType23.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType44);
        int int47 = functionType44.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType44, true, jSTypeArray49);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0227");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        boolean boolean13 = node10.isAssignAdd();
        boolean boolean14 = node10.isQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(30, node7, node10, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.hasMoreThanOneChild();
        boolean boolean22 = node19.isReturn();
        com.google.javascript.rhino.jstype.JSType jSType23 = node19.getJSType();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.isOr();
        boolean boolean27 = node25.isLabel();
        java.lang.String str28 = node25.toStringTree();
        boolean boolean29 = node25.isDebugger();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind36 = new com.google.javascript.jscomp.CodingConvention.Bind(node25, node31, node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        node45.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind48 = new com.google.javascript.jscomp.CodingConvention.Bind(node34, node38, node45);
        node45.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node45.children();
        boolean boolean52 = node45.isBreak();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceChildAfter(node19, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER -1.0\n" + "'", str28, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0228");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("unknown", 100, (int) (short) 10);
        com.google.javascript.rhino.Node node4 = node3.cloneNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        boolean boolean8 = node6.isLabel();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.isQualifiedName();
        java.lang.String str11 = node6.getSourceFileName();
        boolean boolean12 = node6.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        java.lang.String str18 = node14.getSourceFileName();
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceChildAfter(node6, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0229");
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
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec48 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str49 = assertionFunctionSpec48.getFunctionName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.isOr();
        node52.setLineno(2);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0, node52);
        com.google.javascript.rhino.Node node57 = assertionFunctionSpec48.getAssertedParam(node52);
        java.lang.String str58 = com.google.javascript.jscomp.NodeUtil.getSourceName(node52);
        node52.addSuppression("hi!");
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node52);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        jSTypeRegistry67.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.hasOneChild();
        boolean boolean74 = node72.isObjectLit();
        com.google.javascript.rhino.InputId inputId75 = com.google.javascript.jscomp.NodeUtil.getInputId(node72);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((-1), node72);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean80 = node79.hasOneChild();
        boolean boolean81 = node79.isObjectLit();
        com.google.javascript.rhino.InputId inputId82 = com.google.javascript.jscomp.NodeUtil.getInputId(node79);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((-1), node79);
        boolean boolean84 = node83.isNE();
        node76.addChildToBack(node83);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry67.createFunctionType(jSType69, node83);
        int int87 = functionType86.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType86.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry64.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType86);
        boolean boolean90 = functionType86.matchesInt32Context();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry1.createFromTypeNodes(node52, "JSDocInfo", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER -1.0 2 [jsdoc_info: JSDocInfo]");
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
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(inputId82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0230");
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
        java.lang.Iterable iterable24 = functionType20.getCtorExtendedInterfaces();
        boolean boolean25 = functionType20.isNominalType();
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
        org.junit.Assert.assertNotNull(iterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0231");
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
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        jSTypeRegistry57.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean63 = node62.hasOneChild();
        boolean boolean64 = node62.isObjectLit();
        com.google.javascript.rhino.InputId inputId65 = com.google.javascript.jscomp.NodeUtil.getInputId(node62);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((-1), node62);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isObjectLit();
        com.google.javascript.rhino.InputId inputId72 = com.google.javascript.jscomp.NodeUtil.getInputId(node69);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), node69);
        boolean boolean74 = node73.isNE();
        node66.addChildToBack(node73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry57.createFunctionType(jSType59, node73);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType76.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType76.getPrototype();
        boolean boolean79 = objectType78.isBooleanObjectType();
        boolean boolean80 = jSTypeRegistry1.declareType("java.io.IOException: ", (com.google.javascript.rhino.jstype.JSType) objectType78);
        com.google.javascript.rhino.jstype.TemplateType templateType81 = objectType78.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = templateType81.toMaybeParameterizedType();
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
        org.junit.Assert.assertNull(errorReporter54);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(inputId65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(templateType81);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0232");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType72.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType72.getParentScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = functionType72.getOwnPropertyJSDocInfo("JSDocInfo");
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
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNull(jSDocInfo80);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0233");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isLabelName();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.isOr();
        node7.setLineno(2);
        com.google.javascript.rhino.InputId inputId11 = node7.getInputId();
        com.google.javascript.rhino.InputId inputId13 = new com.google.javascript.rhino.InputId("Function");
        node7.setInputId(inputId13);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec16 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str17 = assertionFunctionSpec16.getFunctionName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.isOr();
        node20.setLineno(2);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node20);
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec16.getAssertedParam(node20);
        boolean boolean26 = node20.isString();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node7, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0234");
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
        boolean boolean25 = node10.isContinue();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0235");
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType48, "InputId: Function");
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
        org.junit.Assert.assertNull(objectType65);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0236");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strSet12.spliterator();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0237");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = objectType22.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = objectType22.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = objectType22.getOwnSlot("true");
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
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNull(jSTypeStaticSlot26);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0238");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        boolean boolean4 = node1.isFunction();
        boolean boolean5 = node1.isSyntheticBlock();
        boolean boolean6 = node1.isCall();
        boolean boolean7 = node1.isInc();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        boolean boolean11 = node9.isLabel();
        java.lang.String str12 = node9.toStringTree();
        boolean boolean13 = node9.isDebugger();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind20 = new com.google.javascript.jscomp.CodingConvention.Bind(node9, node15, node18);
        boolean boolean21 = node9.isSwitch();
        boolean boolean22 = node9.isQuotedString();
        boolean boolean23 = node9.isOr();
        com.google.javascript.rhino.Node node24 = node1.copyInformationFrom(node9);
        boolean boolean25 = node24.isSetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NUMBER -1.0\n" + "'", str12, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0239");
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
        com.google.javascript.rhino.jstype.TemplateType templateType65 = functionType48.toMaybeTemplateType();
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
        org.junit.Assert.assertNull(templateType65);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0240");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.toObjectType();
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0242");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        node7.setLineno(15);
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
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        node32.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind35 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node25, node32);
        node32.setSourceEncodedPosition((int) (byte) 10);
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
        java.lang.String str54 = node44.getSourceFileName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), node57);
        java.lang.String str62 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node61);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec64 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str65 = assertionFunctionSpec64.getFunctionName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.isOr();
        node68.setLineno(2);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0, node68);
        com.google.javascript.rhino.Node node73 = assertionFunctionSpec64.getAssertedParam(node68);
        com.google.javascript.rhino.Node node74 = node61.srcref(node73);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 100, node7, node32, node44, node74);
        com.google.javascript.rhino.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            node44.addChildrenToBack(node76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NUMBER -1.0\n" + "'", str15, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0243");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        boolean boolean8 = strList3.isEmpty();
        java.util.ListIterator<java.lang.String> strItor9 = strList3.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor10 = strList3.listIterator();
        int int11 = strList3.size();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        boolean boolean15 = node13.isLabel();
        java.lang.String str16 = node13.toStringTree();
        boolean boolean17 = node13.isDebugger();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.hasOneChild();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node19, node22);
        boolean boolean25 = node19.isSetterDef();
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node19);
        node19.setSourceEncodedPositionForTree(42);
        boolean boolean29 = node19.isFalse();
        node19.setIsSyntheticBlock(true);
        int int32 = strList3.indexOf((java.lang.Object) true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = com.google.common.collect.ImmutableList.copyOf(strArray35);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor37 = strList36.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        boolean boolean59 = node58.isNE();
        node51.addChildToBack(node58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry42.createFunctionType(jSType44, node58);
        int int62 = functionType61.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType61.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry39.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean65 = functionType61.matchesInt32Context();
        boolean boolean66 = strList36.equals((java.lang.Object) functionType61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = strList3.retainAll((java.util.Collection<java.lang.String>) strList36);
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
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "NUMBER -1.0\n" + "'", str16, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0244");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.hasMoreThanOneChild();
        java.lang.String str11 = node6.getQualifiedName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        boolean boolean15 = node13.isLabel();
        boolean boolean16 = node13.isAssignAdd();
        boolean boolean17 = node13.isQualifiedName();
        com.google.javascript.rhino.Node node18 = node13.removeChildren();
        boolean boolean19 = node13.isQuotedString();
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(46, nodeArray23);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(47, nodeArray23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(51, nodeArray23, 51, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceChildAfter(node13, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0245");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.Node node4 = node1.removeFirstChild();
        boolean boolean5 = node1.isAssignAdd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        node1.setStaticSourceFile(staticSourceFile6);
        boolean boolean8 = node1.isString();
        boolean boolean9 = node1.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node1.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0246");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        com.google.javascript.rhino.Node node5 = node1.getFirstChild();
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
            com.google.javascript.rhino.Node node39 = node1.removeChildAfter(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNull(node5);
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0247");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        boolean boolean7 = node6.isTrue();
        boolean boolean8 = node6.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0248");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isFor();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.Node node4 = node1.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.isObjectLit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0249");
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
        com.google.javascript.rhino.Node node27 = functionType23.getRootNode();
        boolean boolean28 = functionType23.isResolved();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.hasOneChild();
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.InputId inputId39 = com.google.javascript.jscomp.NodeUtil.getInputId(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), node36);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.hasOneChild();
        boolean boolean45 = node43.isObjectLit();
        com.google.javascript.rhino.InputId inputId46 = com.google.javascript.jscomp.NodeUtil.getInputId(node43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), node43);
        boolean boolean48 = node47.isNE();
        node40.addChildToBack(node47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry31.createFunctionType(jSType33, node47);
        int int51 = functionType50.getMaxArguments();
        boolean boolean52 = functionType50.isParameterizedType();
        java.lang.String str53 = null; // flaky: functionType50.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = functionType50.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node55 = functionType50.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.isOr();
        boolean boolean61 = node59.isLabel();
        java.lang.String str62 = node59.toStringTree();
        boolean boolean63 = node59.isDebugger();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind70 = new com.google.javascript.jscomp.CodingConvention.Bind(node59, node65, node68);
        boolean boolean71 = node65.isSetterDef();
        java.lang.String str72 = com.google.javascript.jscomp.NodeUtil.getSourceName(node65);
        node65.setSourceEncodedPositionForTree(42);
        boolean boolean75 = node65.isFalse();
        boolean boolean76 = node65.isFalse();
        boolean boolean77 = functionType23.defineDeclaredProperty("java.io.IOException: ", (com.google.javascript.rhino.jstype.JSType) functionType57, node65);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node65.new FileLevelJsDocBuilder();
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
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Function" + "'", str53, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "NUMBER -1.0\n" + "'", str62, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0250");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "null.prototype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0251");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException1.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0252");
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
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType20.findPropertyType("java.io.IOException: ");
        java.lang.String str26 = functionType20.getNormalizedReferenceName();
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
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0253");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0254");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0255");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        boolean boolean8 = strList3.isEmpty();
        java.util.ListIterator<java.lang.String> strItor9 = strList3.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor10 = strList3.listIterator();
        int int11 = strList3.size();
        // The following exception was thrown during execution in test generation
        try {
            strList3.clear();
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
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0256");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(10, "", 45, 0);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0257");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo14.getReturnType();
        java.lang.String str16 = jSDocInfo14.getOriginalCommentString();
        boolean boolean17 = jSDocInfo14.isExterns();
        jSDocInfo14.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet20 = jSDocInfo14.getModifies();
        boolean boolean21 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strSet6.add("hi!");
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
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0258");
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
        boolean boolean65 = node1.isGetterDef();
        node1.setDouble((double) 0);
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0259");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isInterface();
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0260");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope69 = functionType65.getParentScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression71 = jSDocInfo70.getReturnType();
        java.lang.String str72 = jSDocInfo70.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility73 = jSDocInfo70.getVisibility();
        java.lang.String str74 = jSDocInfo70.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo70.getParameterType("");
        int int77 = jSDocInfo70.getExtendedInterfacesCount();
        java.util.Collection<java.lang.String> strCollection78 = jSDocInfo70.getReferences();
        functionType65.setJSDocInfo(jSDocInfo70);
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType65.getReturnType();
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope69);
        org.junit.Assert.assertNull(jSTypeExpression71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(visibility73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(jSTypeExpression76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(strCollection78);
        org.junit.Assert.assertNotNull(jSType80);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0261");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        boolean boolean11 = node9.isLabel();
        node9.setOptionalArg(false);
        boolean boolean14 = strSet7.equals((java.lang.Object) node9);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = com.google.common.collect.ImmutableList.copyOf(strArray17);
        int int20 = strList18.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean21 = strList18.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator22 = strList18.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strSet7.removeAll((java.util.Collection<java.lang.String>) strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0262");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("unknown", 100, (int) (short) 10);
        boolean boolean4 = node3.isExprResult();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj11 = null;
        int int12 = strList8.indexOf(obj11);
        boolean boolean13 = strList8.isEmpty();
        java.util.ListIterator<java.lang.String> strItor14 = strList8.listIterator();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = com.google.common.collect.ImmutableList.copyOf(strArray17);
        java.util.Iterator<java.lang.String> strItor19 = strList18.iterator();
        boolean boolean20 = strList8.containsAll((java.util.Collection<java.lang.String>) strList18);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags22 = new com.google.javascript.rhino.Node.SideEffectFlags(46);
        boolean boolean23 = strList8.contains((java.lang.Object) sideEffectFlags22);
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0263");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        boolean boolean5 = node4.isLabel();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0264");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = jSDocInfo82.getReturnType();
        java.lang.String str84 = jSDocInfo82.getOriginalCommentString();
        boolean boolean85 = jSDocInfo82.isExterns();
        jSDocInfo82.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList88 = jSDocInfo82.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = jSDocInfo82.getTypedefType();
        functionType45.setPropertyJSDocInfo("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSDocInfo82);
        boolean boolean91 = functionType45.isAllType();
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
        org.junit.Assert.assertNull(jSTypeExpression83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList88);
        org.junit.Assert.assertNull(jSTypeExpression89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0265");
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
        boolean boolean24 = node8.isLocalResultCall();
        double double25 = node8.getDouble();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection31 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node27);
        int int32 = node27.getLineno();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.isOr();
        node34.setLineno(2);
        com.google.javascript.rhino.Node node38 = node27.useSourceInfoFromForTree(node34);
        boolean boolean39 = node27.isVoid();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = node8.removeChildAfter(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(nodeCollection31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0266");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        java.lang.String str5 = jSDocInfo0.toString();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0267");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        node4.setVarArgs(false);
        boolean boolean7 = node4.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node4.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0268");
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
        com.google.javascript.rhino.jstype.UnionType unionType65 = functionType48.toMaybeUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        jSTypeRegistry68.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.hasOneChild();
        boolean boolean75 = node73.isObjectLit();
        com.google.javascript.rhino.InputId inputId76 = com.google.javascript.jscomp.NodeUtil.getInputId(node73);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((-1), node73);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean81 = node80.hasOneChild();
        boolean boolean82 = node80.isObjectLit();
        com.google.javascript.rhino.InputId inputId83 = com.google.javascript.jscomp.NodeUtil.getInputId(node80);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((-1), node80);
        boolean boolean85 = node84.isNE();
        node77.addChildToBack(node84);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry68.createFunctionType(jSType70, node84);
        int int88 = functionType87.getMaxArguments();
        boolean boolean89 = functionType87.isParameterizedType();
        java.lang.String str90 = null; // flaky: functionType87.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet91 = functionType87.getPossibleToBooleanOutcomes();
        java.lang.Iterable iterable92 = functionType87.getCtorImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType93 = functionType48.forceResolve(errorReporter66, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType87);
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
        org.junit.Assert.assertNull(unionType65);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(inputId76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(inputId83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Function" + "'", str90, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet91 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet91.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(iterable92);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0269");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        boolean boolean2 = node1.isExprResult();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.isOr();
        boolean boolean6 = node4.isLabel();
        java.lang.String str7 = node4.toStringTree();
        boolean boolean8 = node4.isDebugger();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind15 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node10, node13);
        com.google.javascript.rhino.Node node16 = node1.srcref(node4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo17 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0\n" + "'", str7, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0270");
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
        boolean boolean27 = node21.isSetterDef();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.isOr();
        boolean boolean31 = node29.isLabel();
        java.lang.String str32 = node29.toStringTree();
        boolean boolean33 = node29.isDebugger();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind40 = new com.google.javascript.jscomp.CodingConvention.Bind(node29, node35, node38);
        java.util.Set<java.lang.String> strSet41 = node29.getDirectives();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node29.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            node21.addChildBefore(node29, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NUMBER -1.0\n" + "'", str32, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(strSet41);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0271");
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
            com.google.javascript.rhino.Node node64 = node54.getChildAtIndex((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0272");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 47);
        boolean boolean2 = node1.isAnd();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0273");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        java.lang.String str6 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node8);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = null;
        node8.setStaticSourceFile(staticSourceFile12);
        boolean boolean14 = node8.isFor();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        boolean boolean19 = node17.isLabel();
        java.lang.String str20 = node17.toStringTree();
        boolean boolean21 = node17.isDebugger();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        com.google.javascript.rhino.InputId inputId26 = com.google.javascript.jscomp.NodeUtil.getInputId(node23);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection27 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isAnd();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0, node17, node23, node29, node33, 12, 0);
        com.google.javascript.rhino.Node node39 = node8.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(46, nodeArray42);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(47, nodeArray42);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node8, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NUMBER -1.0\n" + "'", str20, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNotNull(nodeCollection27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeArray42);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0274");
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
        boolean boolean24 = node18.isUnscopedQualifiedName();
        int int25 = node18.getCharno();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), node32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), node39);
        boolean boolean44 = node43.isNE();
        node36.addChildToBack(node43);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry27.createFunctionType(jSType29, node43);
        int int47 = functionType46.getMaxArguments();
        boolean boolean48 = functionType46.hasDisplayName();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.isOr();
        boolean boolean52 = node50.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType53 = node50.getJSType();
        boolean boolean54 = node50.isAssignAdd();
        boolean boolean55 = functionType46.equals((java.lang.Object) boolean54);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType46.toMaybeFunctionType();
        node18.setJSType((com.google.javascript.rhino.jstype.JSType) functionType56);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = node18.getExistingIntProp(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 15");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(functionType56);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0275");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getParameterCount();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        boolean boolean3 = jSDocInfo0.isConstructor();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strCollection4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0276");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0277");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        boolean boolean27 = node26.isNE();
        node19.addChildToBack(node26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry10.createFunctionType(jSType12, node26);
        int int30 = functionType29.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType29.collapseUnion();
        boolean boolean32 = jSTypeRegistry1.declareType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSType31);
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.isOr();
        boolean boolean38 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType39 = node36.getJSType();
        boolean boolean40 = node36.isAssignAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        boolean boolean59 = node58.isNE();
        node51.addChildToBack(node58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry42.createFunctionType(jSType44, node58);
        int int62 = functionType61.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType61.collapseUnion();
        boolean boolean64 = functionType61.hasAnyTemplateInternal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = functionType61.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry1.createObjectType("(InputId: Function)", node36, (com.google.javascript.rhino.jstype.ObjectType) functionType61);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray70 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative69 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry1.createUnionType(jSTypeNativeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSDocInfo65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeNativeArray70);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0278");
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
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType65.dereference();
        boolean boolean71 = objectType70.isFunctionType();
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
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0279");
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
        java.lang.String str35 = node1.toString(false, true, false);
        boolean boolean36 = node1.isFor();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "NUMBER -1.0" + "'", str35, "NUMBER -1.0");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0280");
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
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 2, 1, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        jSTypeRegistry59.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean65 = node64.hasOneChild();
        boolean boolean66 = node64.isObjectLit();
        com.google.javascript.rhino.InputId inputId67 = com.google.javascript.jscomp.NodeUtil.getInputId(node64);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), node64);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.hasOneChild();
        boolean boolean73 = node71.isObjectLit();
        com.google.javascript.rhino.InputId inputId74 = com.google.javascript.jscomp.NodeUtil.getInputId(node71);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), node71);
        boolean boolean76 = node75.isNE();
        node68.addChildToBack(node75);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry59.createFunctionType(jSType61, node75);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType78.getExtendedInterfaces();
        boolean boolean81 = functionType78.isPropertyInExterns("unknown");
        int int82 = functionType78.getPropertiesCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry1.createFromTypeNodes(node56, "Function", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 2.0 1");
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
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(inputId74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0281");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0282");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        jSTypeRegistry1.resetForTypeCheck();
        jSTypeRegistry1.incrementGeneration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0283");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strList3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0284");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec5 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative7);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec10 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str11 = assertionFunctionSpec10.getFunctionName();
        java.lang.String str12 = assertionFunctionSpec10.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec14 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str15 = assertionFunctionSpec14.getFunctionName();
        java.lang.String str16 = assertionFunctionSpec14.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec18 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec20 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec22 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str23 = assertionFunctionSpec22.getFunctionName();
        java.lang.String str24 = assertionFunctionSpec22.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec26 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str27 = assertionFunctionSpec26.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec29 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str30 = assertionFunctionSpec29.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str33 = assertionFunctionSpec32.getFunctionName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.isOr();
        node36.setLineno(2);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0, node36);
        com.google.javascript.rhino.Node node41 = assertionFunctionSpec32.getAssertedParam(node36);
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecList42 = com.google.common.collect.ImmutableList.of(assertionFunctionSpec2, assertionFunctionSpec5, assertionFunctionSpec8, assertionFunctionSpec10, assertionFunctionSpec14, assertionFunctionSpec18, assertionFunctionSpec20, assertionFunctionSpec22, assertionFunctionSpec26, assertionFunctionSpec29, assertionFunctionSpec32);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.isOr();
        boolean boolean53 = node51.isLabel();
        java.lang.String str54 = node51.toStringTree();
        node51.setVarArgs(false);
        double double57 = node51.getDouble();
        boolean boolean58 = node51.isNE();
        node49.addChildrenToBack(node51);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        jSTypeRegistry65.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean71 = node70.hasOneChild();
        boolean boolean72 = node70.isObjectLit();
        com.google.javascript.rhino.InputId inputId73 = com.google.javascript.jscomp.NodeUtil.getInputId(node70);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((-1), node70);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean78 = node77.hasOneChild();
        boolean boolean79 = node77.isObjectLit();
        com.google.javascript.rhino.InputId inputId80 = com.google.javascript.jscomp.NodeUtil.getInputId(node77);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((-1), node77);
        boolean boolean82 = node81.isNE();
        node74.addChildToBack(node81);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry65.createFunctionType(jSType67, node81);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable85 = functionType84.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = functionType84.getPrototype();
        boolean boolean87 = jSTypeRegistry61.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType86);
        com.google.javascript.rhino.jstype.JSType jSType88 = objectType86.getParameterType();
        node49.setJSType(jSType88);
        boolean boolean90 = node49.isWhile();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = null;
        com.google.javascript.rhino.jstype.JSType jSType92 = assertionFunctionSpec18.getAssertedType(node49, jSTypeRegistry91);
        boolean boolean93 = node49.isDebugger();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(assertionFunctionSpecList42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NUMBER -1.0\n" + "'", str54, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(inputId73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(inputId80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNotNull(objectTypeIterable85);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0285");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.isExport();
        boolean boolean12 = jSDocInfo0.isNoSideEffects();
        java.util.Set<java.lang.String> strSet13 = jSDocInfo0.getParameterNames();
        java.lang.String str14 = jSDocInfo0.getDescription();
        boolean boolean15 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0286");
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
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative53 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.getNativeObjectType(jSTypeNative53);
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0287");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(31, "?", 41, 50);
        node4.putIntProp((int) 'a', (-1));
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0288");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        boolean boolean5 = node3.isLabel();
        java.lang.String str6 = node3.toStringTree();
        boolean boolean7 = node3.isDebugger();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isAnd();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.hasOneChild();
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node3, node9, node15, node19, 12, 0);
        com.google.javascript.rhino.Node node25 = node9.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(53, node9, 36, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "NUMBER -1.0\n" + "'", str6, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0289");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0290");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        node1.setLength(50);
        node1.addSuppression("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.Node node8 = node1.removeFirstChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        boolean boolean11 = node10.isOr();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = node8.useSourceInfoFrom(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0291");
        java.lang.String[] strArray5 = new java.lang.String[] { "unknown", "NUMBER -1.0\n", "unknown", "JSDocInfo", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo8.getReturnType();
        java.lang.String str10 = jSDocInfo8.getOriginalCommentString();
        boolean boolean11 = jSDocInfo8.isExterns();
        jSDocInfo8.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList14 = jSDocInfo8.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo8.getType();
        boolean boolean16 = strList6.contains((java.lang.Object) jSDocInfo8);
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
        boolean boolean67 = functionType65.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection68 = jSTypeRegistry18.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType65);
        jSTypeRegistry18.setLastGeneration(false);
        boolean boolean72 = jSTypeRegistry18.hasNamespace("EQ\n");
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList76 = com.google.common.collect.ImmutableList.copyOf(strArray75);
        java.util.Iterator<java.lang.String> strItor77 = strList76.iterator();
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList81 = com.google.common.collect.ImmutableList.copyOf(strArray80);
        int int83 = strList81.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean84 = strList76.contains((java.lang.Object) int83);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor85 = strList76.listIterator();
        jSTypeRegistry18.setTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        boolean boolean87 = strList6.retainAll((java.util.Collection<java.lang.String>) strList76);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator88 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList6.replaceAll(strUnaryOperator88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList14);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strItor77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strItor85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0292");
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
        boolean boolean23 = objectType22.isBooleanObjectType();
        boolean boolean24 = objectType22.isFunctionPrototypeType();
        boolean boolean25 = objectType22.isEmptyType();
        boolean boolean26 = objectType22.isBooleanValueType();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0293");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        node6.setType(43);
        // The following exception was thrown during execution in test generation
        try {
            node6.setString("null.prototype");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: FALSE is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0294");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(44, "Named type with empty name component");
        boolean boolean3 = node2.isWhile();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0295");
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
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), node32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), node39);
        boolean boolean44 = node43.isNE();
        node36.addChildToBack(node43);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry27.createFunctionType(jSType29, node43);
        int int47 = functionType46.getMaxArguments();
        boolean boolean48 = functionType46.hasImplementedInterfaces();
        boolean boolean50 = functionType46.removeProperty("true");
        boolean boolean52 = functionType46.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType46.findPropertyType("InputId: Function");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(12);
        boolean boolean57 = node56.isExprResult();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.isOr();
        boolean boolean61 = node59.isLabel();
        java.lang.String str62 = node59.toStringTree();
        boolean boolean63 = node59.isDebugger();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind70 = new com.google.javascript.jscomp.CodingConvention.Bind(node59, node65, node68);
        com.google.javascript.rhino.Node node71 = node56.srcref(node59);
        boolean boolean72 = functionType20.defineDeclaredProperty("[, hi!]", jSType54, node71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = jSType54.isObject();
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "NUMBER -1.0\n" + "'", str62, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0296");
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
        boolean boolean27 = node24.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node24);
        node24.setDouble((double) 4095);
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
        org.junit.Assert.assertNull(staticSourceFile28);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0297");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo14.getReturnType();
        java.lang.String str16 = jSDocInfo14.getOriginalCommentString();
        boolean boolean17 = jSDocInfo14.isExterns();
        jSDocInfo14.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet20 = jSDocInfo14.getModifies();
        boolean boolean21 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strSet6.add("ERROR\n    NUMBER -1.0\n");
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
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0298");
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
        boolean boolean24 = node8.isLocalResultCall();
        com.google.javascript.rhino.jstype.JSType jSType25 = node8.getJSType();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0299");
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
        boolean boolean27 = node21.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            node21.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0300");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry1.getNativeType(jSTypeNative49);
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0301");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0302");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0303");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        boolean boolean27 = node26.isNE();
        node19.addChildToBack(node26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry10.createFunctionType(jSType12, node26);
        int int30 = functionType29.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType29.collapseUnion();
        boolean boolean32 = jSTypeRegistry1.declareType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSType31);
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry1.createNamedType("(unknown)", "Named type with empty name component", 10, 44);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node45);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        boolean boolean57 = node56.isNE();
        node49.addChildToBack(node56);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry40.createFunctionType(jSType42, node56);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType59.getExtendedInterfaces();
        boolean boolean61 = functionType59.matchesStringContext();
        boolean boolean63 = functionType59.isPropertyTypeDeclared("Not declared as a constructor");
        boolean boolean64 = jSType38.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean65 = jSType38.hasAnyTemplate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0304");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        boolean boolean9 = node7.isObjectLit();
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        jSDocInfo0.setAssociatedNode(node7);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getThrownTypes();
        java.lang.String str13 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0305");
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
        java.util.Collection<java.lang.String> strCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = strList3.addAll(41, strCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0306");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(46, nodeArray1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.hasOneChild();
        boolean boolean7 = node5.isObjectLit();
        com.google.javascript.rhino.InputId inputId8 = com.google.javascript.jscomp.NodeUtil.getInputId(node5);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1), node5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        com.google.javascript.rhino.InputId inputId15 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), node12);
        boolean boolean17 = node16.isNE();
        node9.addChildToBack(node16);
        node16.addSuppression("");
        boolean boolean21 = node16.isComma();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), node25);
        node29.setType(43);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        boolean boolean40 = node38.isLabel();
        java.lang.String str41 = node38.toStringTree();
        node38.setVarArgs(false);
        double double44 = node38.getDouble();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(3, node29, node33, node38, 2, 49);
        // The following exception was thrown during execution in test generation
        try {
            node2.replaceChildAfter(node16, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NUMBER -1.0\n" + "'", str41, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0307");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot95 = functionType90.getSlot("EQ\n");
        boolean boolean96 = functionType90.hasReferenceName();
        boolean boolean98 = functionType90.isPropertyTypeDeclared("Not declared as a constructor");
        boolean boolean99 = functionType90.isCheckedUnknownType();
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
        org.junit.Assert.assertNull(staticSlot95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0308");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec5 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative7);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec10 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str11 = assertionFunctionSpec10.getFunctionName();
        java.lang.String str12 = assertionFunctionSpec10.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec14 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str15 = assertionFunctionSpec14.getFunctionName();
        java.lang.String str16 = assertionFunctionSpec14.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec18 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec20 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec22 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str23 = assertionFunctionSpec22.getFunctionName();
        java.lang.String str24 = assertionFunctionSpec22.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec26 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str27 = assertionFunctionSpec26.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec29 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str30 = assertionFunctionSpec29.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str33 = assertionFunctionSpec32.getFunctionName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.isOr();
        node36.setLineno(2);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0, node36);
        com.google.javascript.rhino.Node node41 = assertionFunctionSpec32.getAssertedParam(node36);
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecList42 = com.google.common.collect.ImmutableList.of(assertionFunctionSpec2, assertionFunctionSpec5, assertionFunctionSpec8, assertionFunctionSpec10, assertionFunctionSpec14, assertionFunctionSpec18, assertionFunctionSpec20, assertionFunctionSpec22, assertionFunctionSpec26, assertionFunctionSpec29, assertionFunctionSpec32);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.isOr();
        boolean boolean46 = node44.isLabel();
        java.lang.String str47 = node44.toStringTree();
        boolean boolean48 = node44.isDebugger();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind55 = new com.google.javascript.jscomp.CodingConvention.Bind(node44, node50, node53);
        boolean boolean56 = node53.isCatch();
        node53.detachChildren();
        com.google.javascript.rhino.Node node58 = assertionFunctionSpec2.getAssertedParam(node53);
        com.google.javascript.rhino.Node node59 = node58.getLastChild();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(assertionFunctionSpecList42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "NUMBER -1.0\n" + "'", str47, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0309");
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
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.getPropertyType("NUMBER -1.0\n");
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList25 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType20.setExtendedInterfaces(objectTypeList25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
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
        org.junit.Assert.assertNotNull(jSType24);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0310");
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
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType65.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType95 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType96 = functionType65.getGreatestSubtype(jSType95);
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
        org.junit.Assert.assertNull(jSType94);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0311");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        node6.setLineno(2);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, node6);
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFromForTree(node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        boolean boolean19 = node16.isAssignAdd();
        boolean boolean20 = node16.isQualifiedName();
        com.google.javascript.rhino.Node node21 = node16.removeChildren();
        boolean boolean22 = node16.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100, node6, node13, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0312");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType20.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType20.getTypeOfThis();
        boolean boolean27 = functionType20.isNumber();
        com.google.javascript.rhino.jstype.ObjectType.Property property29 = functionType20.getSlot("?");
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = functionType20.canAssignTo(jSType30);
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(property29);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0313");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType20.getInstanceType();
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
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0314");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable6 = jSTypeRegistry1.getTypesWithProperty("Function");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray8 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative7 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry1.createUnionType(jSTypeNativeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable6);
        org.junit.Assert.assertNotNull(jSTypeNativeArray8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0315");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.Node node5 = node2.removeFirstChild();
        boolean boolean6 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        boolean boolean11 = node8.isAssignAdd();
        boolean boolean12 = node8.isQualifiedName();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        boolean boolean17 = node15.isLabel();
        java.lang.String str18 = node15.toStringTree();
        boolean boolean19 = node15.isDebugger();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection25 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isAnd();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0, node15, node21, node27, node31, 12, 0);
        boolean boolean37 = node8.isEquivalentToTyped(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.InputId inputId47 = com.google.javascript.jscomp.NodeUtil.getInputId(node44);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1), node44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node51);
        boolean boolean56 = node55.isNE();
        node48.addChildToBack(node55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry39.createFunctionType(jSType41, node55);
        int int59 = functionType58.getMaxArguments();
        boolean boolean60 = functionType58.isParameterizedType();
        java.lang.String str61 = null; // flaky: functionType58.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType58.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node63 = functionType58.getParametersNode();
        com.google.javascript.rhino.Node node64 = node63.detachFromParent();
        boolean boolean65 = node63.isStringKey();
        boolean boolean66 = node63.isTrue();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isObjectLit();
        com.google.javascript.rhino.InputId inputId72 = com.google.javascript.jscomp.NodeUtil.getInputId(node69);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), node69);
        boolean boolean74 = node69.isName();
        boolean boolean75 = node69.isComma();
        node69.setOptionalArg(true);
        boolean boolean78 = node69.isVoid();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(48, node2, node8, node63, node69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER -1.0\n" + "'", str18, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertNotNull(nodeCollection25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Function" + "'", str61, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0316");
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
        boolean boolean22 = node15.isContinue();
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node15);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0317");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.Spliterator<java.lang.String> strSpliterator5 = strList3.spliterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo6.getReturnType();
        java.lang.String str8 = jSDocInfo6.getOriginalCommentString();
        boolean boolean9 = jSDocInfo6.isExterns();
        jSDocInfo6.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet12 = jSDocInfo6.getModifies();
        int int13 = strSet12.size();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        node15.setLineno(2);
        boolean boolean19 = strSet12.contains((java.lang.Object) 2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo20.getReturnType();
        java.lang.String str22 = jSDocInfo20.getOriginalCommentString();
        boolean boolean23 = jSDocInfo20.isExterns();
        jSDocInfo20.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet26 = jSDocInfo20.getModifies();
        boolean boolean27 = strSet12.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.Spliterator<java.lang.String> strSpliterator28 = strSet12.spliterator();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = com.google.common.collect.ImmutableList.copyOf(strArray31);
        int int34 = strList32.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor35 = strList32.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator36 = strList32.spliterator();
        com.google.common.collect.ImmutableList<java.util.Spliterator<java.lang.String>> strSpliteratorList37 = com.google.common.collect.ImmutableList.of(strSpliterator5, strSpliterator28, strSpliterator36);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(strSpliterator36);
        org.junit.Assert.assertNotNull(strSpliteratorList37);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0318");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node1.setStaticSourceFile(staticSourceFile5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = node1.useSourceInfoIfMissingFrom(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0319");
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
        com.google.javascript.rhino.Node node45 = functionType20.getSource();
        java.util.Set<java.lang.String> strSet46 = functionType20.getOwnPropertyNames();
        boolean boolean47 = functionType20.isEmptyType();
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
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.getIndexType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot73 = functionType68.getSlot("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair74 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType75 = typePair74.typeB;
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
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
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
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNull(jSTypeStaticSlot73);
        org.junit.Assert.assertNotNull(typePair74);
        org.junit.Assert.assertNotNull(jSType75);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0320");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Unknown class name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Unknown class name)" + "'", str1, "(Unknown class name)");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0321");
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
        boolean boolean46 = functionType42.isArrayType();
        functionType42.clearCachedValues();
        boolean boolean48 = functionType42.matchesNumberContext();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0322");
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
        boolean boolean49 = functionType20.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.hasOneChild();
        boolean boolean58 = node56.isObjectLit();
        com.google.javascript.rhino.InputId inputId59 = com.google.javascript.jscomp.NodeUtil.getInputId(node56);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), node56);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1), node63);
        boolean boolean68 = node67.isNE();
        node60.addChildToBack(node67);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry51.createFunctionType(jSType53, node67);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71);
        jSTypeRegistry72.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean78 = node77.hasOneChild();
        boolean boolean79 = node77.isObjectLit();
        com.google.javascript.rhino.InputId inputId80 = com.google.javascript.jscomp.NodeUtil.getInputId(node77);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((-1), node77);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean85 = node84.hasOneChild();
        boolean boolean86 = node84.isObjectLit();
        com.google.javascript.rhino.InputId inputId87 = com.google.javascript.jscomp.NodeUtil.getInputId(node84);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((-1), node84);
        boolean boolean89 = node88.isNE();
        node81.addChildToBack(node88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry72.createFunctionType(jSType74, node88);
        int int92 = functionType91.getMaxArguments();
        functionType70.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType91);
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType70.autoboxesTo();
        boolean boolean95 = functionType70.hasCachedValues();
        functionType20.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType70);
        boolean boolean97 = functionType20.matchesInt32Context();
        boolean boolean98 = functionType20.hasAnyTemplateInternal();
        boolean boolean99 = functionType20.isRegexpType();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputId66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(inputId80);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(inputId87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0323");
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
        boolean boolean96 = functionType65.isPropertyInExterns("[, hi!]");
        com.google.javascript.rhino.Node node97 = functionType65.getRootNode();
        com.google.javascript.rhino.Node node99 = functionType65.getPropertyNode("");
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(node97);
        org.junit.Assert.assertNull(node99);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0324");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = objectType22.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = objectType22.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType26 = objectType22.getPropertyType("Not declared as a constructor");
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
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(jSType26);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0325");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        boolean boolean12 = strList3.isEmpty();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0326");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0327");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.isOr();
        node7.setLineno(2);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, node7);
        java.lang.String str12 = node7.toStringTree();
        int int13 = node7.getChildCount();
        boolean boolean14 = node7.isArrayLit();
        node7.removeProp(3);
        boolean boolean17 = node7.isNull();
        boolean boolean18 = node7.isFor();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoFrom(node7);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags20 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags20.clearSideEffectFlags();
        sideEffectFlags20.setThrows();
        sideEffectFlags20.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node19.setSideEffectFlags(sideEffectFlags20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NUMBER -1.0 2\n" + "'", str12, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0328");
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
        boolean boolean44 = functionType43.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair45 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = functionType20.getOwnPropertyJSDocInfo("java.io.IOException: ");
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
        boolean boolean70 = functionType68.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType68.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = functionType20.getTypesUnderShallowInequality(jSType72);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = functionType20.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType20.collapseUnion();
        boolean boolean76 = jSType75.isString();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typePair45);
        org.junit.Assert.assertNull(jSDocInfo47);
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
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(typePair73);
        org.junit.Assert.assertNull(parameterizedType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0329");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean6 = jSDocInfo0.hasType();
        boolean boolean7 = jSDocInfo0.isExpose();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0330");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
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
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry3.createFunctionType(jSType5, node19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType22.getExtendedInterfaces();
        boolean boolean24 = functionType22.matchesStringContext();
        boolean boolean26 = functionType22.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection32 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node28);
        int int33 = node28.getLineno();
        boolean boolean34 = node28.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType22, node28);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec37 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str38 = assertionFunctionSpec37.getFunctionName();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.isOr();
        node41.setLineno(2);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0, node41);
        com.google.javascript.rhino.Node node46 = assertionFunctionSpec37.getAssertedParam(node41);
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
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isObjectLit();
        com.google.javascript.rhino.InputId inputId78 = com.google.javascript.jscomp.NodeUtil.getInputId(node75);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), node75);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean83 = node82.hasOneChild();
        boolean boolean84 = node82.isObjectLit();
        com.google.javascript.rhino.InputId inputId85 = com.google.javascript.jscomp.NodeUtil.getInputId(node82);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((-1), node82);
        boolean boolean87 = node86.isNE();
        node79.addChildToBack(node86);
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry70.createFunctionType(jSType72, node86);
        int int90 = functionType89.getMaxArguments();
        functionType68.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType92 = functionType68.autoboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable93 = functionType68.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry1.createFromTypeNodes(node46, "Unknown class name", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER -1.0 2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(nodeCollection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
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
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(inputId78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(inputId85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertNotNull(nodeIterable93);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0331");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.ListIterator<java.lang.String> strItor7 = strList3.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            strItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0332");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        node7.setLineno(15);
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
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isObjectLit();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node28);
        node32.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind35 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node25, node32);
        node32.setSourceEncodedPosition((int) (byte) 10);
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
        java.lang.String str54 = node44.getSourceFileName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), node57);
        java.lang.String str62 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node61);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec64 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str65 = assertionFunctionSpec64.getFunctionName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.isOr();
        node68.setLineno(2);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0, node68);
        com.google.javascript.rhino.Node node73 = assertionFunctionSpec64.getAssertedParam(node68);
        com.google.javascript.rhino.Node node74 = node61.srcref(node73);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 100, node7, node32, node44, node74);
        node7.setWasEmptyNode(false);
        boolean boolean78 = node7.hasMoreThanOneChild();
        java.lang.Class<?> wildcardClass79 = node7.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NUMBER -1.0\n" + "'", str15, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0333");
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
        boolean boolean45 = functionType20.isFunctionPrototypeType();
        boolean boolean46 = functionType20.hasInstanceType();
        boolean boolean47 = functionType20.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType20.getCtorImplementedInterfaces();
        java.lang.Iterable iterable49 = functionType20.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNotNull(iterable49);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0334");
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
        boolean boolean14 = node1.isQuotedString();
        boolean boolean15 = node1.isOr();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node1.children();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator17 = nodeIterable16.spliterator();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0335");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        boolean boolean10 = node6.hasMoreThanOneChild();
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
        node6.setJSType((com.google.javascript.rhino.jstype.JSType) objectType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo40.getReturnType();
        java.lang.String str42 = jSDocInfo40.getOriginalCommentString();
        boolean boolean43 = jSDocInfo40.isExterns();
        jSDocInfo40.addSuppression("hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        java.lang.String str50 = com.google.javascript.jscomp.NodeUtil.getSourceName(node47);
        jSDocInfo40.setAssociatedNode(node47);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType37, node47);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean56 = node55.isOr();
        boolean boolean57 = node55.isLabel();
        java.lang.String str58 = node55.toStringTree();
        boolean boolean59 = node55.isDebugger();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean68 = node67.hasOneChild();
        boolean boolean69 = node67.isAnd();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.hasOneChild();
        boolean boolean73 = node71.isObjectLit();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(0, node55, node61, node67, node71, 12, 0);
        com.google.javascript.rhino.Node node77 = node61.cloneNode();
        int int78 = node47.getIndexOfChild(node61);
        java.lang.String str79 = com.google.javascript.jscomp.NodeUtil.getSourceName(node47);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertNull(jSTypeExpression41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NUMBER -1.0\n" + "'", str58, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0336");
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
        boolean boolean13 = node10.isCatch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        node16.setLineno(2);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0, node16);
        java.lang.String str21 = node16.toStringTree();
        boolean boolean22 = node16.isSetterDef();
        boolean boolean23 = node10.isEquivalentTo(node16);
        com.google.javascript.rhino.InputId inputId24 = node16.getInputId();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "NUMBER -1.0 2\n" + "'", str21, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(inputId24);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0337");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = strList3.asList();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        boolean boolean20 = node16.isDebugger();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind27 = new com.google.javascript.jscomp.CodingConvention.Bind(node16, node22, node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), node32);
        node36.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind39 = new com.google.javascript.jscomp.CodingConvention.Bind(node25, node29, node36);
        node36.setSourceEncodedPosition((int) (byte) 10);
        boolean boolean42 = node36.isSetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = jSDocInfo43.getReturnType();
        java.lang.String str45 = jSDocInfo43.getOriginalCommentString();
        boolean boolean46 = jSDocInfo43.isExterns();
        jSDocInfo43.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet49 = jSDocInfo43.getModifies();
        int int50 = strSet49.size();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.isOr();
        node52.setLineno(2);
        boolean boolean56 = strSet49.contains((java.lang.Object) 2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo57.getReturnType();
        java.lang.String str59 = jSDocInfo57.getOriginalCommentString();
        boolean boolean60 = jSDocInfo57.isExterns();
        jSDocInfo57.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet63 = jSDocInfo57.getModifies();
        boolean boolean64 = strSet49.retainAll((java.util.Collection<java.lang.String>) strSet63);
        java.lang.String[] strArray70 = new java.lang.String[] { "unknown", "NUMBER -1.0\n", "unknown", "JSDocInfo", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo73.getReturnType();
        java.lang.String str75 = jSDocInfo73.getOriginalCommentString();
        boolean boolean76 = jSDocInfo73.isExterns();
        jSDocInfo73.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList79 = jSDocInfo73.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression80 = jSDocInfo73.getType();
        boolean boolean81 = strList71.contains((java.lang.Object) jSDocInfo73);
        java.lang.Object[] objArray82 = strList71.toArray();
        boolean boolean83 = strSet49.retainAll((java.util.Collection<java.lang.String>) strList71);
        node36.setDirectives(strSet49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = strList3.removeAll((java.util.Collection<java.lang.String>) strSet49);
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
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER -1.0\n" + "'", str19, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jSTypeExpression44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(jSTypeExpression74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList79);
        org.junit.Assert.assertNull(jSTypeExpression80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[unknown, NUMBER -1.0\n, unknown, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[unknown, NUMBER -1.0\n, unknown, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0338");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int8 = namePosition7.getEndLine();
        int int9 = namePosition7.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition10 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int11 = namePosition10.getEndLine();
        int int12 = namePosition10.getEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition13 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition13.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition19 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition19.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.Node node25 = namePosition19.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition26 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition26.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        int int32 = namePosition26.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList33 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition7, namePosition10, namePosition13, namePosition19, namePosition26);
        int int34 = namePosition10.getEndLine();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(namePositionList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0339");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean18 = strList15.add("");
        boolean boolean19 = strSet10.remove((java.lang.Object) strList15);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        jSTypeRegistry21.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isObjectLit();
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node26);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), node26);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node33);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node33);
        boolean boolean38 = node37.isNE();
        node30.addChildToBack(node37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry21.createFunctionType(jSType23, node37);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        boolean boolean59 = node58.isNE();
        node51.addChildToBack(node58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry42.createFunctionType(jSType44, node58);
        int int62 = functionType61.getMaxArguments();
        functionType40.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType40.autoboxesTo();
        com.google.javascript.rhino.Node node65 = functionType40.getSource();
        java.util.Set<java.lang.String> strSet66 = functionType40.getOwnPropertyNames();
        boolean boolean67 = strList15.containsAll((java.util.Collection<java.lang.String>) strSet66);
        int int68 = strSet66.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression70 = jSDocInfo69.getReturnType();
        java.lang.String str71 = jSDocInfo69.getOriginalCommentString();
        boolean boolean72 = jSDocInfo69.isExterns();
        jSDocInfo69.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet75 = jSDocInfo69.getModifies();
        int int76 = strSet75.size();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.isOr();
        node78.setLineno(2);
        boolean boolean82 = strSet75.contains((java.lang.Object) 2);
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList86 = com.google.common.collect.ImmutableList.copyOf(strArray85);
        java.util.Iterator<java.lang.String> strItor87 = strList86.iterator();
        boolean boolean88 = strSet75.retainAll((java.util.Collection<java.lang.String>) strList86);
        strSet75.clear();
        boolean boolean90 = strSet66.containsAll((java.util.Collection<java.lang.String>) strSet75);
        int int91 = strSet75.size();
        strSet75.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = strList3.addAll((java.util.Collection<java.lang.String>) strSet75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNull(jSTypeExpression70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strItor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0340");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType33.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = functionType33.getParentScope();
        boolean boolean36 = functionType33.hasAnyTemplate();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType33.getReturnType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node45);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean53 = node52.hasOneChild();
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), node52);
        boolean boolean57 = node56.isNE();
        node49.addChildToBack(node56);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry40.createFunctionType(jSType42, node56);
        int int60 = functionType59.getMaxArguments();
        boolean boolean61 = functionType59.hasImplementedInterfaces();
        boolean boolean63 = functionType59.removeProperty("true");
        boolean boolean65 = functionType59.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType59.findPropertyType("InputId: Function");
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(12);
        boolean boolean70 = node69.isExprResult();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.isOr();
        boolean boolean74 = node72.isLabel();
        java.lang.String str75 = node72.toStringTree();
        boolean boolean76 = node72.isDebugger();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean82 = node81.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind83 = new com.google.javascript.jscomp.CodingConvention.Bind(node72, node78, node81);
        com.google.javascript.rhino.Node node84 = node69.srcref(node72);
        boolean boolean85 = functionType33.defineDeclaredProperty("[, hi!]", jSType67, node84);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node84);
        // The following exception was thrown during execution in test generation
        try {
            node1.removeChild(node84);
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
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNotNull(jSTypeStaticScope35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "NUMBER -1.0\n" + "'", str75, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0341");
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
        int int69 = functionType65.getExtendedInterfacesCount();
        boolean boolean70 = functionType65.matchesObjectContext();
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0342");
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
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator28 = nodeIterable27.spliterator();
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
        org.junit.Assert.assertNotNull(nodeSpliterator28);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0343");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        node1.addSuppression("");
        boolean boolean6 = node1.isScript();
        boolean boolean7 = node1.isDo();
        int int8 = node1.getSourceOffset();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0344");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        boolean boolean8 = node2.isLocalResultCall();
        boolean boolean9 = node2.isNE();
        com.google.javascript.rhino.InputId inputId10 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        node2.setLength(41);
        // The following exception was thrown during execution in test generation
        try {
            node2.setString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 2 [length: 41] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0345");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0346");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        boolean boolean27 = node26.isNE();
        node19.addChildToBack(node26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry10.createFunctionType(jSType12, node26);
        int int30 = functionType29.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType29.collapseUnion();
        boolean boolean32 = jSTypeRegistry1.declareType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSType31);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean34 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getNativeType(jSTypeNative35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0347");
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
        boolean boolean26 = functionType20.isPropertyInExterns("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType20.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSType27);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0348");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        boolean boolean27 = node26.isNE();
        node19.addChildToBack(node26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry10.createFunctionType(jSType12, node26);
        int int30 = functionType29.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType29.collapseUnion();
        boolean boolean32 = jSTypeRegistry1.declareType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSType31);
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.isOr();
        boolean boolean38 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType39 = node36.getJSType();
        boolean boolean40 = node36.isAssignAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isObjectLit();
        com.google.javascript.rhino.InputId inputId50 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node54);
        boolean boolean59 = node58.isNE();
        node51.addChildToBack(node58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry42.createFunctionType(jSType44, node58);
        int int62 = functionType61.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType61.collapseUnion();
        boolean boolean64 = functionType61.hasAnyTemplateInternal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = functionType61.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry1.createObjectType("(InputId: Function)", node36, (com.google.javascript.rhino.jstype.ObjectType) functionType61);
        boolean boolean67 = objectType66.isNoType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSDocInfo65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0349");
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
        boolean boolean28 = node21.isBreak();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node21, "");
        com.google.javascript.rhino.Node node31 = jSTypeExpression30.getRoot();
        com.google.javascript.rhino.Node node32 = jSTypeExpression30.getRoot();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node39);
        boolean boolean41 = node39.isBreak();
        boolean boolean42 = node39.isAssignAdd();
        boolean boolean43 = node39.hasMoreThanOneChild();
        java.lang.String str44 = node39.getQualifiedName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        node47.setLineno(2);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0, node47);
        java.lang.String str52 = node47.toStringTree();
        int int53 = node47.getChildCount();
        boolean boolean54 = node47.isArrayLit();
        node47.removeProp(3);
        // The following exception was thrown during execution in test generation
        try {
            node32.replaceChild(node39, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node already has a parent.");
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
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER -1.0 2\n" + "'", str52, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0350");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(46, nodeArray3);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(47, nodeArray3);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(51, nodeArray3, 51, (int) ' ');
        com.google.javascript.rhino.Node node9 = node8.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node9.setLineno(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0351");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String str8 = strList3.toString();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor9 = strList3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.set(0, "Function");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[, hi!]" + "'", str8, "[, hi!]");
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0352");
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
        java.lang.String str72 = null; // flaky: functionType45.toString();
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
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Function" + "'", str72, "Function");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0353");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("?");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0354");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        node1.setLineno(2);
        com.google.javascript.rhino.Node node5 = node1.cloneTree();
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
        boolean boolean39 = node29.isInc();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.hasOneChild();
        boolean boolean48 = node46.isObjectLit();
        com.google.javascript.rhino.InputId inputId49 = com.google.javascript.jscomp.NodeUtil.getInputId(node46);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node53);
        boolean boolean58 = node57.isNE();
        node50.addChildToBack(node57);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry41.createFunctionType(jSType43, node57);
        int int61 = functionType60.getMaxArguments();
        boolean boolean62 = functionType60.isParameterizedType();
        java.lang.String str63 = null; // flaky: functionType60.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = functionType60.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node65 = functionType60.getParametersNode();
        com.google.javascript.rhino.Node node66 = node65.detachFromParent();
        // The following exception was thrown during execution in test generation
        try {
            node1.replaceChildAfter(node29, node66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Function" + "'", str63, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0355");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        int int8 = typePosition0.getStartLine();
        boolean boolean9 = typePosition0.hasBrackets();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0356");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = unionType69.matchesObjectContext();
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0357");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("");
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        int int8 = jSDocInfo0.getParameterCount();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0358");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope69 = functionType65.getParentScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression71 = jSDocInfo70.getReturnType();
        java.lang.String str72 = jSDocInfo70.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility73 = jSDocInfo70.getVisibility();
        java.lang.String str74 = jSDocInfo70.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo70.getParameterType("");
        int int77 = jSDocInfo70.getExtendedInterfacesCount();
        java.util.Collection<java.lang.String> strCollection78 = jSDocInfo70.getReferences();
        functionType65.setJSDocInfo(jSDocInfo70);
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList80 = functionType65.getSubTypes();
        boolean boolean82 = functionType65.hasProperty("java.io.IOException: ");
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope69);
        org.junit.Assert.assertNull(jSTypeExpression71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(visibility73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(jSTypeExpression76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(strCollection78);
        org.junit.Assert.assertNull(functionTypeList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0359");
        java.io.IOException iOException1 = new java.io.IOException("Function");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0360");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = strList3.asList();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        com.google.javascript.rhino.InputId inputId19 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        boolean boolean20 = strList3.equals((java.lang.Object) inputId19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor22 = strList3.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (3) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0361");
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
        int int33 = functionType32.getMaxArguments();
        boolean boolean34 = functionType32.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType32.getParameterType();
        boolean boolean37 = functionType32.hasAnyTemplateInternal();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = strList3.remove((java.lang.Object) boolean37);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0362");
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
        com.google.javascript.rhino.jstype.ObjectType objectType22 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType20, "NUMBER -1.0 2\n");
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
        org.junit.Assert.assertNull(objectType22);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0363");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int6 = node1.getLineno();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        node8.setLineno(2);
        com.google.javascript.rhino.Node node12 = node1.useSourceInfoFromForTree(node8);
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0364");
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
        com.google.javascript.rhino.Node node45 = functionType20.getSource();
        java.util.Set<java.lang.String> strSet46 = functionType20.getOwnPropertyNames();
        boolean boolean47 = functionType20.isEmptyType();
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
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.getIndexType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot73 = functionType68.getSlot("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair74 = functionType20.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean75 = functionType20.hasDisplayName();
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
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
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
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNull(jSTypeStaticSlot73);
        org.junit.Assert.assertNotNull(typePair74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0365");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor8 = strList3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strList3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0366");
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
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative47);
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0367");
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
        boolean boolean14 = node1.getBooleanProp(2);
        boolean boolean15 = node1.isObjectLit();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0368");
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
        boolean boolean24 = jSTypeRegistry1.hasNamespace("java.io.IOException: ");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.copyOf(strArray27);
        int int30 = strList28.lastIndexOf((java.lang.Object) (short) 100);
        java.util.ListIterator<java.lang.String> strItor32 = strList28.listIterator(1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        boolean boolean40 = node35.isName();
        boolean boolean41 = node35.isComma();
        boolean boolean42 = strList28.contains((java.lang.Object) boolean41);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor43 = strList28.iterator();
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList28);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList28.replaceAll(strUnaryOperator45);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strItor43);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0369");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = functionType65.getSlot("Function");
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType65.findPropertyType("Not declared as a type name");
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
        org.junit.Assert.assertNull(property71);
        org.junit.Assert.assertNull(jSType73);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0370");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType69 = functionType20.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = parameterizedType69.matchesObjectContext();
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
        org.junit.Assert.assertNull(parameterizedType69);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0371");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        node2.addSuppression("null.prototype");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0372");
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
        boolean boolean45 = functionType20.isFunctionPrototypeType();
        boolean boolean47 = functionType20.isPropertyInExterns("(unknown)");
        java.util.Set<java.lang.String> strSet48 = functionType20.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property50 = functionType20.getSlot("true");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(property50);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0373");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node7 = typePosition0.getItem();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        int int14 = node9.getLineno();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        node16.setLineno(2);
        com.google.javascript.rhino.Node node20 = node9.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node21 = node7.srcrefTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node28);
        boolean boolean30 = node28.isBreak();
        boolean boolean31 = node28.isAssignAdd();
        boolean boolean32 = node28.isOnlyModifiesThisCall();
        node28.setSourceEncodedPosition(36);
        boolean boolean35 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node36 = node20.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.isOr();
        boolean boolean41 = node39.isLabel();
        java.lang.String str42 = node39.toStringTree();
        boolean boolean43 = node39.isDebugger();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection49 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isAnd();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean56 = node55.hasOneChild();
        boolean boolean57 = node55.isObjectLit();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0, node39, node45, node51, node55, 12, 0);
        boolean boolean61 = node55.isUnscopedQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = jSDocInfo62.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility64 = null;
        jSDocInfo62.setVisibility(visibility64);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo62.getReturnType();
        boolean boolean67 = jSDocInfo62.isConsistentIdGenerator();
        boolean boolean68 = jSDocInfo62.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet69 = jSDocInfo62.getParameterNames();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.isOr();
        boolean boolean73 = node71.isLabel();
        node71.setOptionalArg(false);
        boolean boolean76 = strSet69.equals((java.lang.Object) node71);
        // The following exception was thrown during execution in test generation
        try {
            node28.replaceChild(node55, node71);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "NUMBER -1.0\n" + "'", str42, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(nodeCollection49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSTypeExpression63);
        org.junit.Assert.assertNull(jSTypeExpression66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0374");
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
        java.lang.Iterable iterable24 = functionType20.getCtorExtendedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator25 = iterable24.spliterator();
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
        org.junit.Assert.assertNotNull(iterable24);
        org.junit.Assert.assertNotNull(nodeSpliterator25);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0375");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.isInterface();
        java.lang.String str9 = jSDocInfo0.getVersion();
        boolean boolean10 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0376");
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
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType45.findPropertyType("Function");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = jSType82.isTemplateType();
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
        org.junit.Assert.assertNull(jSType82);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0377");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        boolean boolean18 = strList3.contains((java.lang.Object) strArray16);
        int int20 = strList3.lastIndexOf((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.clear();
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0378");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        java.lang.String str5 = node1.getSourceFileName();
        boolean boolean6 = node1.isOr();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), node9);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node13);
        boolean boolean15 = node13.isBreak();
        boolean boolean16 = node13.isAssignAdd();
        boolean boolean17 = node13.hasMoreThanOneChild();
        java.lang.String str18 = node13.getQualifiedName();
        boolean boolean19 = node13.isOr();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = node1.removeChildAfter(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0379");
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
        boolean boolean99 = objectType98.isNoObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0380");
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
        boolean boolean45 = functionType20.isNumberObjectType();
        boolean boolean46 = functionType20.hasInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0381");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setReturnsTainted();
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0382");
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
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec26 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        boolean boolean32 = jSTypeRegistry29.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry29.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec26.getAssertedType(node27, jSTypeRegistry29);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.hasOneChild();
        boolean boolean48 = node46.isObjectLit();
        com.google.javascript.rhino.InputId inputId49 = com.google.javascript.jscomp.NodeUtil.getInputId(node46);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node53);
        boolean boolean58 = node57.isNE();
        node50.addChildToBack(node57);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry41.createFunctionType(jSType43, node57);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType60.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType60.getPrototype();
        boolean boolean63 = jSTypeRegistry37.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType62);
        com.google.javascript.rhino.jstype.JSType jSType65 = objectType62.findPropertyType("(unknown)");
        com.google.javascript.rhino.jstype.JSType jSType66 = objectType62.restrictByNotNullOrUndefined();
        jSTypeRegistry29.unregisterPropertyOnType("", jSType66);
        boolean boolean69 = jSTypeRegistry29.isForwardDeclaredType("(JSDocInfo)");
        jSTypeRegistry29.clearNamedTypes();
        boolean boolean71 = strList3.remove((java.lang.Object) jSTypeRegistry29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry29.createUnionType(jSTypeArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0383");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        node3.setLineno(2);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0, node3);
        java.lang.String str8 = node3.toStringTree();
        boolean boolean9 = node3.isLocalResultCall();
        int int10 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isAnd();
        boolean boolean15 = node12.isGetElem();
        boolean boolean16 = node12.isExprResult();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.isLabel();
        java.lang.String str22 = node19.toStringTree();
        boolean boolean23 = node19.isDebugger();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection29 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isAnd();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0, node19, node25, node31, node35, 12, 0);
        boolean boolean41 = node35.isUnscopedQualifiedName();
        int int42 = node35.getCharno();
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
        boolean boolean65 = functionType63.hasDisplayName();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean68 = node67.isOr();
        boolean boolean69 = node67.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType70 = node67.getJSType();
        boolean boolean71 = node67.isAssignAdd();
        boolean boolean72 = functionType63.equals((java.lang.Object) boolean71);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType63.toMaybeFunctionType();
        node35.setJSType((com.google.javascript.rhino.jstype.JSType) functionType73);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (short) 0, node3, node12, node35, (int) (short) -1, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NUMBER -1.0 2\n" + "'", str8, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "NUMBER -1.0\n" + "'", str22, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(nodeCollection29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType73);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0384");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.InputId inputId8 = node6.getInputId();
        boolean boolean9 = node6.isNew();
        java.lang.Class<?> wildcardClass10 = node6.getClass();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.InputId inputId14 = node12.getInputId();
        boolean boolean15 = node12.isNew();
        java.lang.Class<?> wildcardClass16 = node12.getClass();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.isOr();
        com.google.javascript.rhino.InputId inputId20 = node18.getInputId();
        boolean boolean21 = node18.isNew();
        java.lang.Class<?> wildcardClass22 = node18.getClass();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.isOr();
        com.google.javascript.rhino.InputId inputId26 = node24.getInputId();
        boolean boolean27 = node24.isNew();
        java.lang.Class<?> wildcardClass28 = node24.getClass();
        java.lang.reflect.Type[] typeArray29 = new java.lang.reflect.Type[] { wildcardClass10, wildcardClass16, wildcardClass22, wildcardClass28 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList30 = com.google.common.collect.ImmutableList.copyOf(typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray31 = strList3.toArray(typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeList30);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0385");
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
        boolean boolean25 = node21.isFunction();
        boolean boolean26 = node21.isTypeOf();
        boolean boolean27 = node21.isAnd();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0386");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        boolean boolean9 = node7.isBreak();
        boolean boolean10 = node7.isAssignAdd();
        boolean boolean11 = node7.isOnlyModifiesThisCall();
        boolean boolean12 = node7.isThis();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
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
        boolean boolean37 = functionType35.matchesStringContext();
        boolean boolean39 = functionType35.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection45 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node41);
        int int46 = node41.getLineno();
        boolean boolean47 = node41.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry14.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType35, node41);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 100, node7, node41, 4, 35);
        // The following exception was thrown during execution in test generation
        try {
            node51.setString("Not declared as a constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR 4 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNotNull(nodeCollection45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(functionType48);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0387");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = functionType20.getTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        boolean boolean34 = jSTypeRegistry32.isForwardDeclaredType("Not declared as a constructor");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = jSTypeRegistry32.getErrorReporter();
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
        boolean boolean58 = functionType56.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isObjectLit();
        com.google.javascript.rhino.InputId inputId68 = com.google.javascript.jscomp.NodeUtil.getInputId(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), node65);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.hasOneChild();
        boolean boolean74 = node72.isObjectLit();
        com.google.javascript.rhino.InputId inputId75 = com.google.javascript.jscomp.NodeUtil.getInputId(node72);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((-1), node72);
        boolean boolean77 = node76.isNE();
        node69.addChildToBack(node76);
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry60.createFunctionType(jSType62, node76);
        boolean boolean80 = functionType79.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair81 = functionType56.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType79);
        boolean boolean82 = functionType56.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry32.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType56);
        jSTypeRegistry32.incrementGeneration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = strList30.remove((java.lang.Object) jSTypeRegistry32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(errorReporter35);
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
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typePair81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSType83);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0388");
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
        boolean boolean24 = jSTypeRegistry1.hasNamespace("java.io.IOException: ");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable70 = functionType45.getParameters();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType45.unboxesTo();
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
        int int93 = functionType92.getMaxArguments();
        boolean boolean94 = functionType92.hasImplementedInterfaces();
        boolean boolean95 = functionType92.hasInstanceType();
        boolean boolean96 = functionType92.isInterface();
        com.google.javascript.rhino.jstype.FunctionType functionType97 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType45, (com.google.javascript.rhino.jstype.JSType) functionType92);
        int int98 = functionType45.getMinArguments();
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
        org.junit.Assert.assertNotNull(nodeIterable70);
        org.junit.Assert.assertNull(jSType71);
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(functionType97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0389");
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
        boolean boolean99 = functionType48.isString();
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0390");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isInterface();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0391");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        stringPosition0.setItem("[, hi!]");
        java.lang.String str5 = stringPosition0.getItem();
        stringPosition0.setPositionInformation(0, 4, 12, 50);
        java.lang.String str11 = stringPosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition12 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int13 = stringPosition12.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList14 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition12);
        stringPosition12.setItem("[, hi!]");
        stringPosition12.setItem("(JSDocInfo)");
        int int19 = stringPosition12.getEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition20 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int21 = stringPosition20.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList22 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition20);
        stringPosition20.setItem("[, hi!]");
        stringPosition20.setItem("(JSDocInfo)");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition27 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int28 = stringPosition27.getEndLine();
        int int29 = stringPosition27.getPositionOnStartLine();
        int int30 = stringPosition27.getEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition31 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int32 = stringPosition31.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList33 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition31);
        stringPosition31.setItem("[, hi!]");
        stringPosition31.setItem("(JSDocInfo)");
        int int38 = stringPosition31.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition39 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int40 = stringPosition39.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList41 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition39);
        stringPosition39.setItem("[, hi!]");
        int int44 = stringPosition39.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition45 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int46 = stringPosition45.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList47 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition45);
        java.lang.String str48 = stringPosition45.getItem();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList49 = com.google.common.collect.ImmutableList.of(stringPosition0, stringPosition12, stringPosition20, stringPosition27, stringPosition31, stringPosition39, stringPosition45);
        int int50 = stringPosition45.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[, hi!]" + "'", str5, "[, hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, hi!]" + "'", str11, "[, hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(stringPositionList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0392");
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
        boolean boolean23 = functionType20.hasReferenceName();
        boolean boolean24 = functionType20.isRecordType();
        boolean boolean25 = functionType20.isStringValueType();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0393");
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
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType26.getImplicitPrototype();
        boolean boolean28 = functionType26.matchesObjectContext();
        boolean boolean29 = functionType26.isStringValueType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = functionType26.getSlot("null.prototype");
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
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot31);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0394");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        java.lang.Object[] objArray8 = strSet6.toArray();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0395");
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
        boolean boolean45 = functionType20.isNumberObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType20.getInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0396");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType20.restrictByNotNullOrUndefined();
        boolean boolean48 = jSType47.isNominalType();
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
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0397");
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
        boolean boolean22 = functionType20.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType23 = functionType20.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType20.getInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(enumElementType23);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0398");
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
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType20.autoboxesTo();
        boolean boolean26 = functionType20.isOrdinaryFunction();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = functionType20.getParameters();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator28 = nodeIterable27.spliterator();
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
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(nodeSpliterator28);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0399");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isExpose();
        java.lang.String str6 = jSDocInfo0.getVersion();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("(unknown)");
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0400");
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
        boolean boolean13 = node7.isSetterDef();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        // The following exception was thrown during execution in test generation
        try {
            node7.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }
}
