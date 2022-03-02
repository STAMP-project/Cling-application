import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0801");
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
        boolean boolean20 = node4.isCatch();
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(46, nodeArray24);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, nodeArray24);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(51, nodeArray24, 51, (int) ' ');
        int int30 = node4.getIndexOfChild(node29);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = node4.getExistingIntProp(51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 51");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0802");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0803");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        boolean boolean5 = node1.isWith();
        int int6 = node1.getType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39 + "'", int6 == 39);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0804");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        com.google.javascript.rhino.Node node5 = node1.removeChildren();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0805");
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
        com.google.javascript.rhino.jstype.TemplateType templateType77 = functionType72.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TemplateType templateType78 = templateType77.toMaybeTemplateType();
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
        org.junit.Assert.assertNull(templateType77);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0806");
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
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType20.getParentScope();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = functionType20.getPossibleToBooleanOutcomes();
        boolean boolean29 = booleanLiteralSet27.contains(false);
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0807");
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
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition19 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isAnd();
        typePosition19.setItem(node21);
        int int25 = strList3.indexOf((java.lang.Object) node21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean32 = strList29.add("");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = com.google.common.collect.ImmutableList.copyOf(strArray35);
        int int38 = strList36.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean40 = strList36.equals((java.lang.Object) 8);
        boolean boolean41 = strList36.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = jSDocInfo42.getReturnType();
        java.lang.String str44 = jSDocInfo42.getOriginalCommentString();
        boolean boolean45 = jSDocInfo42.isExterns();
        jSDocInfo42.addSuppression("");
        boolean boolean48 = jSDocInfo42.isDeprecated();
        boolean boolean49 = strList36.equals((java.lang.Object) boolean48);
        boolean boolean50 = strList29.containsAll((java.util.Collection<java.lang.String>) strList36);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor51 = strList36.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = strList3.removeAll((java.util.Collection<java.lang.String>) strList36);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSTypeExpression43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strItor51);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0808");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        java.lang.String str4 = jSDocInfo0.getLendsName();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0809");
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
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.InputId inputId47 = com.google.javascript.jscomp.NodeUtil.getInputId(node44);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1), node44);
        boolean boolean49 = node48.isNE();
        node41.addChildToBack(node48);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry32.createFunctionType(jSType34, node48);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType51.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType51.getPrototype();
        boolean boolean54 = jSTypeRegistry28.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        jSTypeRegistry56.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), node61);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.hasOneChild();
        boolean boolean70 = node68.isObjectLit();
        com.google.javascript.rhino.InputId inputId71 = com.google.javascript.jscomp.NodeUtil.getInputId(node68);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), node68);
        boolean boolean73 = node72.isNE();
        node65.addChildToBack(node72);
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry56.createFunctionType(jSType58, node72);
        int int76 = functionType75.getMaxArguments();
        boolean boolean77 = functionType75.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection78 = jSTypeRegistry28.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType75);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean82 = node81.hasOneChild();
        boolean boolean83 = node81.isObjectLit();
        com.google.javascript.rhino.InputId inputId84 = com.google.javascript.jscomp.NodeUtil.getInputId(node81);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((-1), node81);
        java.lang.String str86 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node85);
        node85.setLineno(15);
        functionType75.setSource(node85);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = functionType75.getExtendedInterfaces();
        java.lang.String str91 = null; // flaky: functionType75.toString();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType92 = functionType75.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType75, "Unknown class name");
        boolean boolean95 = functionType75.hasAnyTemplateInternal();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable96 = functionType75.getImplementedInterfaces();
        boolean boolean97 = functionType75.isReturnTypeInferred();
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
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(inputId71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(inputId84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Function" + "'", str91, "Function");
        org.junit.Assert.assertNull(enumElementType92);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0810");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("FALSE [source_file: ]\n    NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0811");
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
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.findPropertyType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType45.getExtendedInterfaces();
        boolean boolean48 = functionType45.isPropertyInExterns("unknown");
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = jSDocInfo49.getReturnType();
        java.lang.String str51 = jSDocInfo49.getOriginalCommentString();
        boolean boolean52 = jSDocInfo49.isExterns();
        jSDocInfo49.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList55 = jSDocInfo49.getExtendedInterfaces();
        boolean boolean56 = jSDocInfo49.isNoSideEffects();
        boolean boolean57 = jSDocInfo49.isNoCompile();
        boolean boolean58 = jSDocInfo49.isImplicitCast();
        java.lang.String str59 = jSDocInfo49.getVersion();
        java.util.Set<java.lang.String> strSet60 = jSDocInfo49.getSuppressions();
        functionType45.setJSDocInfo(jSDocInfo49);
        boolean boolean62 = jSDocInfo49.hasThisType();
        functionType20.setPropertyJSDocInfo("null.prototype", jSDocInfo49);
        boolean boolean65 = functionType20.hasProperty("null.prototype");
        com.google.javascript.rhino.jstype.TemplateType templateType66 = functionType20.toMaybeTemplateType();
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
        org.junit.Assert.assertNull(jSType23);
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
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSTypeExpression50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(templateType66);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0812");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo28.getReturnType();
        java.lang.String str30 = jSDocInfo28.getOriginalCommentString();
        boolean boolean31 = jSDocInfo28.isExterns();
        jSDocInfo28.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet34 = jSDocInfo28.getModifies();
        int int35 = strSet34.size();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.isOr();
        node37.setLineno(2);
        boolean boolean41 = strSet34.contains((java.lang.Object) 2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = jSDocInfo42.getReturnType();
        java.lang.String str44 = jSDocInfo42.getOriginalCommentString();
        boolean boolean45 = jSDocInfo42.isExterns();
        jSDocInfo42.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet48 = jSDocInfo42.getModifies();
        boolean boolean49 = strSet34.retainAll((java.util.Collection<java.lang.String>) strSet48);
        java.lang.String[] strArray55 = new java.lang.String[] { "unknown", "NUMBER -1.0\n", "unknown", "JSDocInfo", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo58.getReturnType();
        java.lang.String str60 = jSDocInfo58.getOriginalCommentString();
        boolean boolean61 = jSDocInfo58.isExterns();
        jSDocInfo58.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList64 = jSDocInfo58.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo58.getType();
        boolean boolean66 = strList56.contains((java.lang.Object) jSDocInfo58);
        java.lang.Object[] objArray67 = strList56.toArray();
        boolean boolean68 = strSet34.retainAll((java.util.Collection<java.lang.String>) strList56);
        node21.setDirectives(strSet34);
        boolean boolean70 = strSet34.isEmpty();
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
        org.junit.Assert.assertNull(jSTypeExpression29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSTypeExpression43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(jSTypeExpression59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList64);
        org.junit.Assert.assertNull(jSTypeExpression65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[unknown, NUMBER -1.0\n, unknown, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[unknown, NUMBER -1.0\n, unknown, JSDocInfo, JSDocInfo]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0813");
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
        boolean boolean30 = functionType20.hasAnyTemplateInternal();
        java.lang.String str31 = functionType20.getNormalizedReferenceName();
        com.google.javascript.rhino.Node node32 = functionType20.getSource();
        java.lang.String str33 = functionType20.getDisplayName();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0814");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile2 = null;
        node1.setStaticSourceFile(staticSourceFile2);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.hasOneChild();
        boolean boolean7 = node5.isObjectLit();
        com.google.javascript.rhino.InputId inputId8 = com.google.javascript.jscomp.NodeUtil.getInputId(node5);
        boolean boolean9 = node5.hasMoreThanOneChild();
        java.lang.String str10 = node1.checkTreeEquals(node5);
        node5.setDouble((double) 45);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n" + "'", str10, "Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0815");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor4 = strList3.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node21);
        boolean boolean26 = node25.isNE();
        node18.addChildToBack(node25);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry9.createFunctionType(jSType11, node25);
        int int29 = functionType28.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType28.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry6.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        boolean boolean32 = functionType28.matchesInt32Context();
        boolean boolean33 = strList3.equals((java.lang.Object) functionType28);
        com.google.javascript.rhino.Node node35 = functionType28.getPropertyNode("");
        boolean boolean36 = functionType28.isConstructor();
        boolean boolean37 = functionType28.isVoidType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList38 = functionType28.getSubTypes();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(functionTypeList38);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0816");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        stringPosition0.setItem("[, hi!]");
        java.lang.String str5 = stringPosition0.getItem();
        stringPosition0.setItem("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[, hi!]" + "'", str5, "[, hi!]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0817");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("NUMBER -1.0 2\n");
        java.lang.String str8 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0818");
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
        int int61 = strList8.size();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList8.replaceAll(strUnaryOperator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0819");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(visibility9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0820");
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
        boolean boolean26 = node11.isDefaultCase();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node33);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isObjectLit();
        com.google.javascript.rhino.InputId inputId43 = com.google.javascript.jscomp.NodeUtil.getInputId(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), node40);
        boolean boolean45 = node44.isNE();
        node37.addChildToBack(node44);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry28.createFunctionType(jSType30, node44);
        int int48 = functionType47.getMaxArguments();
        boolean boolean49 = functionType47.isParameterizedType();
        java.lang.String str50 = null; // flaky: functionType47.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType47.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node52 = functionType47.getParametersNode();
        com.google.javascript.rhino.Node node53 = node52.detachFromParent();
        boolean boolean54 = node53.isTry();
        com.google.javascript.rhino.Node node55 = node53.cloneNode();
        boolean boolean56 = node55.hasMoreThanOneChild();
        java.lang.String str57 = node55.getSourceFileName();
        boolean boolean58 = node11.isEquivalentToTyped(node55);
        boolean boolean59 = node11.isNull();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Function" + "'", str50, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0821");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable98 = functionType92.getExtendedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable98);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0822");
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
        int int70 = functionType20.getPropertiesCount();
        boolean boolean72 = functionType20.isPropertyTypeInferred("function (): {1890705858}");
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0823");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        java.lang.Object[] objArray7 = strSet6.toArray();
        java.lang.String[] strArray9 = new java.lang.String[] { "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Iterator<java.lang.String> strItor12 = strSet10.iterator();
        boolean boolean13 = strSet6.contains((java.lang.Object) strItor12);
        java.lang.Object[] objArray14 = strSet6.toArray();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0824");
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
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType20.getParentScope();
        boolean boolean26 = functionType20.hasReferenceName();
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
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0825");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getParameterCount();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0826");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        int int5 = node1.getChildCount();
        boolean boolean6 = node1.isGetProp();
        com.google.javascript.rhino.Node node8 = node1.getAncestor((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = node8.cloneNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0827");
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
        boolean boolean24 = functionType20.isString();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0828");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile2 = null;
        node1.setStaticSourceFile(staticSourceFile2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean5 = node4.isArrayLit();
        boolean boolean6 = node4.isDelProp();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        boolean boolean19 = node17.isLabel();
        boolean boolean20 = node17.isAssignAdd();
        boolean boolean21 = node17.isQualifiedName();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(30, node14, node17, 4095, (int) (short) 0);
        boolean boolean25 = node17.isWith();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isAnd();
        node27.setLength(50);
        node27.addSuppression("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.Node node34 = node17.copyInformationFrom(node27);
        com.google.javascript.rhino.Node node35 = node4.useSourceInfoIfMissingFromForTree(node34);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0829");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor4 = strList3.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node21);
        boolean boolean26 = node25.isNE();
        node18.addChildToBack(node25);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry9.createFunctionType(jSType11, node25);
        int int29 = functionType28.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType28.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry6.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        boolean boolean32 = functionType28.matchesInt32Context();
        boolean boolean33 = strList3.equals((java.lang.Object) functionType28);
        boolean boolean34 = functionType28.isFunctionPrototypeType();
        java.lang.String str35 = null; // flaky: functionType28.toAnnotationString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Function" + "'", str35, "Function");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0830");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.lang.String str9 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0831");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("");
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
        boolean boolean29 = functionType25.removeProperty("true");
        boolean boolean31 = functionType25.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType25.findPropertyType("InputId: Function");
        int int34 = functionType25.getMaxArguments();
        java.lang.String str35 = functionType25.getDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType25.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry39.createParameters(jSTypeArray40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        jSTypeRegistry43.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.hasOneChild();
        boolean boolean50 = node48.isObjectLit();
        com.google.javascript.rhino.InputId inputId51 = com.google.javascript.jscomp.NodeUtil.getInputId(node48);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), node48);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean56 = node55.hasOneChild();
        boolean boolean57 = node55.isObjectLit();
        com.google.javascript.rhino.InputId inputId58 = com.google.javascript.jscomp.NodeUtil.getInputId(node55);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1), node55);
        boolean boolean60 = node59.isNE();
        node52.addChildToBack(node59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry43.createFunctionType(jSType45, node59);
        int int63 = functionType62.getMaxArguments();
        boolean boolean64 = functionType62.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType62.getParameterType();
        boolean boolean67 = functionType62.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType62.autoboxesTo();
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
        boolean boolean91 = functionType89.hasImplementedInterfaces();
        java.util.Set<java.lang.String> strSet92 = functionType89.getOwnPropertyNames();
        boolean boolean93 = functionType89.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray94 = new com.google.javascript.rhino.jstype.JSType[] { jSType68, functionType89 };
        com.google.javascript.rhino.Node node95 = jSTypeRegistry39.createParameters(jSTypeArray94);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType36, false, jSTypeArray94);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable98 = jSTypeRegistry1.getEachReferenceTypeWithProperty("Node tree inequality:\nTree1:\nOR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: OR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0\n");
        org.junit.Assert.assertNotNull(objectTypeIterable4);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(inputId58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSType68);
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSTypeArray94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(objectTypeIterable98);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0832");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue12.and(ternaryValue13);
        int int15 = strList3.indexOf((java.lang.Object) ternaryValue14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        jSTypeRegistry17.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        boolean boolean34 = node33.isNE();
        node26.addChildToBack(node33);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry17.createFunctionType(jSType19, node33);
        int int37 = functionType36.getMaxArguments();
        boolean boolean38 = functionType36.isParameterizedType();
        java.lang.String str39 = null; // flaky: functionType36.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = functionType36.getPossibleToBooleanOutcomes();
        java.lang.Iterable iterable41 = functionType36.getCtorImplementedInterfaces();
        boolean boolean42 = strList3.equals((java.lang.Object) functionType36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = strList3.add("true");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Function" + "'", str39, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(iterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0833");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection10 = jSTypeRegistry1.getDirectImplementors(objectType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0834");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = jSDocInfo78.getReturnType();
        java.lang.String str80 = jSDocInfo78.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility81 = jSDocInfo78.getVisibility();
        java.lang.String str82 = jSDocInfo78.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression84 = jSDocInfo78.getParameterType("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList85 = jSDocInfo78.getThrownTypes();
        functionType72.setJSDocInfo(jSDocInfo78);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType72.toObjectType();
        com.google.javascript.rhino.Node node88 = functionType72.getSource();
        functionType72.clearCachedValues();
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
        org.junit.Assert.assertNull(jSTypeExpression79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(visibility81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(jSTypeExpression84);
        org.junit.Assert.assertNotNull(jSTypeExpressionList85);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(node88);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0835");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor4 = strList3.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        boolean boolean23 = node21.isObjectLit();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node21);
        boolean boolean26 = node25.isNE();
        node18.addChildToBack(node25);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry9.createFunctionType(jSType11, node25);
        int int29 = functionType28.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType28.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry6.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        boolean boolean32 = functionType28.matchesInt32Context();
        boolean boolean33 = strList3.equals((java.lang.Object) functionType28);
        com.google.javascript.rhino.Node node35 = functionType28.getPropertyNode("");
        boolean boolean36 = functionType28.isConstructor();
        boolean boolean37 = functionType28.isVoidType();
        boolean boolean39 = functionType28.isPropertyTypeInferred("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0836");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        int int9 = node6.getLength();
        boolean boolean10 = node6.isEmpty();
        com.google.javascript.rhino.Node node11 = node6.removeChildren();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), node14);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node18);
        boolean boolean20 = node18.isBreak();
        boolean boolean21 = node18.isAssignAdd();
        boolean boolean22 = node18.isOnlyModifiesThisCall();
        boolean boolean23 = node18.isThis();
        boolean boolean24 = node18.isTrue();
        com.google.javascript.rhino.Node node25 = node6.useSourceInfoFrom(node18);
        node25.setLength(40);
        // The following exception was thrown during execution in test generation
        try {
            node25.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0837");
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
        boolean boolean63 = node54.isGetElem();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0838");
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
        boolean boolean25 = node9.isIn();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        node28.setLineno(2);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0, node28);
        java.lang.String str33 = node28.toStringTree();
        int int34 = node28.getChildCount();
        boolean boolean35 = node28.isArrayLit();
        node28.removeProp(3);
        boolean boolean38 = node28.isNull();
        int int39 = node28.getCharno();
        int int40 = node9.getIndexOfChild(node28);
        boolean boolean41 = node28.isComma();
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
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NUMBER -1.0 2\n" + "'", str33, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0839");
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
        com.google.javascript.rhino.jstype.JSType jSType73 = objectType67.findPropertyType("(JSDocInfo)");
        com.google.javascript.rhino.jstype.JSType jSType74 = jSType73.restrictByNotNullOrUndefined();
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
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0840");
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
        boolean boolean27 = functionType20.isPropertyInExterns("(unknown)");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = functionType20.setValidator(jSTypePredicate28);
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
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0841");
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
        int int27 = functionType20.getExtendedInterfacesCount();
        boolean boolean28 = functionType20.isTemplateType();
        java.lang.Iterable iterable29 = functionType20.getCtorExtendedInterfaces();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterable29);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0842");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.isLabel();
        boolean boolean5 = node2.isAssignAdd();
        boolean boolean6 = node2.isQualifiedName();
        java.lang.String str7 = node2.getSourceFileName();
        boolean boolean8 = node2.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection14 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node10);
        int int15 = node10.getLineno();
        boolean boolean16 = node10.isHook();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        com.google.javascript.rhino.InputId inputId26 = com.google.javascript.jscomp.NodeUtil.getInputId(node23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), node23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        boolean boolean35 = node34.isNE();
        node27.addChildToBack(node34);
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry18.createFunctionType(jSType20, node34);
        int int38 = functionType37.getMaxArguments();
        boolean boolean39 = functionType37.isParameterizedType();
        java.lang.String str40 = null; // flaky: functionType37.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = functionType37.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node42 = functionType37.getParametersNode();
        com.google.javascript.rhino.Node node43 = node42.detachFromParent();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.isOr();
        node46.setLineno(2);
        com.google.javascript.rhino.Node node50 = node46.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(2, node2, node10, node43, node50, 42, 2);
        boolean boolean54 = node43.isSetterDef();
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(nodeCollection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Function" + "'", str40, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0843");
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
        java.lang.Object[] objArray88 = strList6.toArray();
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
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0844");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        int int5 = node1.getChildCount();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str8 = assertionFunctionSpec7.getFunctionName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        node11.setLineno(2);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node11);
        com.google.javascript.rhino.Node node16 = assertionFunctionSpec7.getAssertedParam(node11);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node11);
        node11.addSuppression("hi!");
        boolean boolean20 = node11.isTypeOf();
        boolean boolean21 = node11.isBreak();
        com.google.javascript.rhino.Node node22 = node1.srcref(node11);
        java.lang.String str23 = node22.getQualifiedName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0845");
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
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node33);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isObjectLit();
        com.google.javascript.rhino.InputId inputId43 = com.google.javascript.jscomp.NodeUtil.getInputId(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), node40);
        boolean boolean45 = node44.isNE();
        node37.addChildToBack(node44);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry28.createFunctionType(jSType30, node44);
        int int48 = functionType47.getMaxArguments();
        boolean boolean49 = functionType47.isParameterizedType();
        java.lang.String str50 = null; // flaky: functionType47.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType47.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node52 = functionType47.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType53.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = jSType55.getPossibleToBooleanOutcomes();
        boolean boolean57 = jSType55.isNoType();
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Function" + "'", str50, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0846");
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
        boolean boolean94 = functionType90.removeProperty("true");
        boolean boolean96 = functionType90.isPropertyInExterns("");
        boolean boolean97 = functionType90.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType98 = functionType90.getTypeOfThis();
        boolean boolean99 = functionType65.differsFrom(jSType98);
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0847");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0848");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isLabel();
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
        node1.setDirectives(strSet12);
        boolean boolean30 = node1.isStringKey();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0849");
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
        boolean boolean46 = functionType20.isReturnTypeInferred();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.isOr();
        boolean boolean50 = node48.isLabel();
        boolean boolean51 = node48.isAssignAdd();
        boolean boolean52 = node48.isAnd();
        functionType20.setSource(node48);
        boolean boolean54 = node48.isFalse();
        boolean boolean55 = node48.isCall();
        java.lang.Object obj57 = null;
        node48.putProp(36, obj57);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0850");
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
        boolean boolean23 = functionType20.hasAnyTemplate();
        java.lang.String str24 = functionType20.getDisplayName();
        boolean boolean25 = functionType20.isVoidType();
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0851");
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
        boolean boolean24 = functionType20.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair26 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType20, jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = typePair26.typeB;
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType27);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0852");
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
        node24.setSourceEncodedPositionForTree((-1));
        // The following exception was thrown during execution in test generation
        try {
            node24.setString("InputId: Function");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER -1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0853");
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
        boolean boolean26 = functionType20.isNoType();
        boolean boolean27 = functionType20.isEmptyType();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType20.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType20.dereference();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType20.getExtendedInterfaces();
        boolean boolean31 = functionType20.canBeCalled();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0854");
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
        boolean boolean46 = functionType43.matchesStringContext();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0855");
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
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.isOr();
        boolean boolean20 = node18.hasMoreThanOneChild();
        boolean boolean21 = node1.isEquivalentToTyped(node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        boolean boolean32 = node30.isLabel();
        java.lang.String str33 = node30.toStringTree();
        node30.setVarArgs(false);
        double double36 = node30.getDouble();
        boolean boolean37 = node30.isNE();
        node28.addChildrenToBack(node30);
        boolean boolean39 = node28.isWith();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.isOr();
        node45.setLineno(2);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0, node45);
        com.google.javascript.rhino.Node node50 = node42.useSourceInfoFromForTree(node45);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node53);
        node57.setType(43);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean63 = node62.hasOneChild();
        boolean boolean64 = node62.isObjectLit();
        com.google.javascript.rhino.InputId inputId65 = com.google.javascript.jscomp.NodeUtil.getInputId(node62);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((-1), node62);
        java.lang.String str67 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node66);
        boolean boolean68 = node66.isBreak();
        boolean boolean69 = node66.isAssignAdd();
        boolean boolean70 = node66.hasMoreThanOneChild();
        java.lang.String str71 = node66.getQualifiedName();
        com.google.javascript.rhino.Node node72 = node57.copyInformationFromForTree(node66);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean75 = node74.hasOneChild();
        boolean boolean76 = node74.isObjectLit();
        java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getSourceName(node74);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile78 = null;
        node74.setStaticSourceFile(staticSourceFile78);
        boolean boolean80 = node74.isObjectLit();
        node66.addChildToBack(node74);
        node74.detachChildren();
        boolean boolean83 = node74.isLabelName();
        node74.setSourceEncodedPosition(3);
        com.google.javascript.rhino.Node node86 = node50.useSourceInfoFromForTree(node74);
        // The following exception was thrown during execution in test generation
        try {
            node18.addChildrenAfter(node28, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NUMBER -1.0\n" + "'", str33, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(inputId65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0856");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = jSDocInfo47.getReturnType();
        java.lang.String str49 = jSDocInfo47.getOriginalCommentString();
        boolean boolean50 = jSDocInfo47.isExterns();
        jSDocInfo47.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet53 = jSDocInfo47.getModifies();
        int int54 = strSet53.size();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = com.google.common.collect.ImmutableList.copyOf(strArray57);
        java.util.Iterator<java.lang.String> strItor59 = strList58.iterator();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList63 = com.google.common.collect.ImmutableList.copyOf(strArray62);
        int int65 = strList63.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean66 = strList58.contains((java.lang.Object) int65);
        boolean boolean67 = strSet53.remove((java.lang.Object) int65);
        boolean boolean68 = strSet46.contains((java.lang.Object) boolean67);
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
        org.junit.Assert.assertNull(jSTypeExpression48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0857");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(6);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0858");
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
        boolean boolean14 = node7.isTrue();
        boolean boolean15 = node7.isContinue();
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
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0859");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 43, 38, 4095);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0860");
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
        int int41 = functionType40.getMaxArguments();
        boolean boolean42 = functionType40.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType40.getOwnImplementedInterfaces();
        boolean boolean44 = functionType40.matchesInt32Context();
        int int45 = functionType40.getMinArguments();
        boolean boolean46 = strSet6.equals((java.lang.Object) int45);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0861");
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
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = jSTypeRegistry1.createOptionalParameters(jSTypeArray34);
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
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0862");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isInterface();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.isExpose();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0863");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isLabelName();
        boolean boolean6 = node1.hasChildren();
        boolean boolean7 = node1.isString();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0864");
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
        int int26 = node16.getChildCount();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        boolean boolean30 = node28.isLabel();
        boolean boolean31 = node28.isAssignAdd();
        boolean boolean32 = node28.isQualifiedName();
        java.lang.String str33 = node28.getSourceFileName();
        boolean boolean34 = node28.isUnscopedQualifiedName();
        java.lang.String str35 = node28.toString();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isObjectLit();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node38);
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node42);
        boolean boolean44 = node42.isBreak();
        int int45 = node42.getLength();
        // The following exception was thrown during execution in test generation
        try {
            node16.addChildrenAfter(node28, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "NUMBER -1.0" + "'", str35, "NUMBER -1.0");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0865");
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
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType20.getPropertyType("function (): {1890705858}");
        boolean boolean26 = jSType25.isDateType();
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
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0866");
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
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.isOr();
        boolean boolean37 = node35.isLabel();
        java.lang.String str38 = node35.toStringTree();
        boolean boolean39 = node35.isDebugger();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind46 = new com.google.javascript.jscomp.CodingConvention.Bind(node35, node41, node44);
        java.util.Set<java.lang.String> strSet47 = node35.getDirectives();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node35, "null.prototype");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = node32.removeChildAfter(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NUMBER -1.0\n" + "'", str38, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(strSet47);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0867");
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType48.getTypeOfThis();
        boolean boolean66 = functionType48.isInstanceType();
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
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0868");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("true");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0869");
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
        java.lang.String str53 = functionType52.toDebugHashCodeString();
        boolean boolean54 = functionType52.isNumberValueType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "function (): {1682766579}" + "'", str53, "function (): {1682766579}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0870");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        java.util.Set<java.lang.String> strSet9 = node7.getDirectives();
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
        int int31 = functionType30.getMaxArguments();
        boolean boolean32 = functionType30.isParameterizedType();
        java.lang.String str33 = null; // flaky: functionType30.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = functionType30.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node35 = functionType30.getParametersNode();
        com.google.javascript.rhino.Node node36 = node35.detachFromParent();
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(46, nodeArray41);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray41);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(31, nodeArray41);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray41, (int) (short) 1, 41);
        java.lang.Object obj49 = node47.getProp((int) '4');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection55 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node51);
        int int56 = node51.getLineno();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.isOr();
        node58.setLineno(2);
        com.google.javascript.rhino.Node node62 = node51.useSourceInfoFromForTree(node58);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(3, node7, node35, node47, node58, 0, (int) (short) 10);
        com.google.javascript.rhino.Node node66 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = node65.srcrefTree(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strSet9);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Function" + "'", str33, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(nodeCollection55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0871");
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
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = null;
        node23.setStaticSourceFile(staticSourceFile27);
        boolean boolean29 = node23.isObjectLit();
        node15.addChildToBack(node23);
        node23.detachChildren();
        boolean boolean32 = node23.isLabelName();
        node23.setSourceEncodedPosition(3);
        boolean boolean35 = node23.isFromExterns();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0872");
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
        java.lang.Object[] objArray20 = strSet6.toArray();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean27 = strList24.add("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = com.google.common.collect.ImmutableList.copyOf(strArray30);
        int int33 = strList31.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean35 = strList31.equals((java.lang.Object) 8);
        boolean boolean36 = strList31.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo37.getReturnType();
        java.lang.String str39 = jSDocInfo37.getOriginalCommentString();
        boolean boolean40 = jSDocInfo37.isExterns();
        jSDocInfo37.addSuppression("");
        boolean boolean43 = jSDocInfo37.isDeprecated();
        boolean boolean44 = strList31.equals((java.lang.Object) boolean43);
        boolean boolean45 = strList24.containsAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean46 = strSet6.removeAll((java.util.Collection<java.lang.String>) strList24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = jSDocInfo47.getReturnType();
        java.lang.String str49 = jSDocInfo47.getOriginalCommentString();
        boolean boolean50 = jSDocInfo47.isExterns();
        jSDocInfo47.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet53 = jSDocInfo47.getModifies();
        int int54 = strSet53.size();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.isOr();
        node56.setLineno(2);
        boolean boolean60 = strSet53.contains((java.lang.Object) 2);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = com.google.common.collect.ImmutableList.copyOf(strArray63);
        java.util.Iterator<java.lang.String> strItor65 = strList64.iterator();
        boolean boolean66 = strSet53.retainAll((java.util.Collection<java.lang.String>) strList64);
        java.lang.Object[] objArray67 = strSet53.toArray();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean74 = strList71.add("");
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList78 = com.google.common.collect.ImmutableList.copyOf(strArray77);
        int int80 = strList78.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean82 = strList78.equals((java.lang.Object) 8);
        boolean boolean83 = strList78.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = jSDocInfo84.getReturnType();
        java.lang.String str86 = jSDocInfo84.getOriginalCommentString();
        boolean boolean87 = jSDocInfo84.isExterns();
        jSDocInfo84.addSuppression("");
        boolean boolean90 = jSDocInfo84.isDeprecated();
        boolean boolean91 = strList78.equals((java.lang.Object) boolean90);
        boolean boolean92 = strList71.containsAll((java.util.Collection<java.lang.String>) strList78);
        boolean boolean93 = strSet53.removeAll((java.util.Collection<java.lang.String>) strList71);
        java.lang.Object obj94 = null;
        boolean boolean95 = strList71.remove(obj94);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = strSet6.addAll((java.util.Collection<java.lang.String>) strList71);
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(jSTypeExpression48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(jSTypeExpression85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0873");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean6 = jSDocInfo0.hasType();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str8 = jSDocInfo0.toString();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSDocInfo" + "'", str8, "JSDocInfo");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0874");
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
        com.google.javascript.rhino.InputId inputId26 = null;
        node25.setInputId(inputId26);
        boolean boolean28 = node25.isSwitch();
        node25.setWasEmptyNode(false);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0875");
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
        java.lang.String str43 = assertionFunctionSpec18.getFunctionName();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0876");
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
        boolean boolean62 = functionType61.isConstructor();
        com.google.javascript.rhino.Node node64 = functionType61.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        jSTypeRegistry66.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.hasOneChild();
        boolean boolean73 = node71.isObjectLit();
        com.google.javascript.rhino.InputId inputId74 = com.google.javascript.jscomp.NodeUtil.getInputId(node71);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), node71);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isObjectLit();
        com.google.javascript.rhino.InputId inputId81 = com.google.javascript.jscomp.NodeUtil.getInputId(node78);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), node78);
        boolean boolean83 = node82.isNE();
        node75.addChildToBack(node82);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry66.createFunctionType(jSType68, node82);
        int int86 = functionType85.getMaxArguments();
        boolean boolean87 = functionType85.isParameterizedType();
        java.lang.String str88 = null; // flaky: functionType85.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = functionType85.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node90 = functionType85.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType85.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = functionType91.getImplicitPrototype();
        boolean boolean93 = functionType91.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = functionType91.getOwnPropertyJSDocInfo("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType61.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType91);
        com.google.javascript.rhino.jstype.FunctionType functionType98 = functionType91.getBindReturnType(6);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable99 = functionType98.getAllImplementedInterfaces();
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
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(inputId74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(inputId81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Function" + "'", str88, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(jSDocInfo95);
        org.junit.Assert.assertNotNull(typePair96);
        org.junit.Assert.assertNotNull(functionType98);
        org.junit.Assert.assertNotNull(objectTypeIterable99);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0877");
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
        boolean boolean26 = functionType20.hasProperty("(InputId: Function)");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType20.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSType27.restrictByNotNullOrUndefined();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(jSType28);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0878");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 31, 47);
        boolean boolean4 = node3.isNoSideEffectsCall();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0879");
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
        boolean boolean23 = functionType20.isPropertyInExterns("unknown");
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo24.getReturnType();
        java.lang.String str26 = jSDocInfo24.getOriginalCommentString();
        boolean boolean27 = jSDocInfo24.isExterns();
        jSDocInfo24.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList30 = jSDocInfo24.getExtendedInterfaces();
        boolean boolean31 = jSDocInfo24.isNoSideEffects();
        boolean boolean32 = jSDocInfo24.isNoCompile();
        boolean boolean33 = jSDocInfo24.isImplicitCast();
        java.lang.String str34 = jSDocInfo24.getVersion();
        java.util.Set<java.lang.String> strSet35 = jSDocInfo24.getSuppressions();
        functionType20.setJSDocInfo(jSDocInfo24);
        java.util.Set<java.lang.String> strSet37 = jSDocInfo24.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo24.getEnumParameterType();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(jSTypeExpression38);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0880");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean20 = strList17.add("");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean27 = strList24.add("");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean34 = strList31.add("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean41 = strList38.add("");
        java.util.AbstractList[] abstractListArray43 = new java.util.AbstractList[4];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.String>[] strListArray44 = (java.util.AbstractList<java.lang.String>[]) abstractListArray43;
        strListArray44[0] = strList17;
        strListArray44[1] = strList24;
        strListArray44[2] = strList31;
        strListArray44[3] = strList38;
        com.google.common.collect.ImmutableList<java.util.AbstractList<java.lang.String>> strListList53 = com.google.common.collect.ImmutableList.of(strListArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.lang.String>[] strIterableArray54 = strList3.toArray((java.lang.Iterable<java.lang.String>[]) strListArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(abstractListArray43);
        org.junit.Assert.assertNotNull(strListArray44);
        org.junit.Assert.assertNotNull(strListList53);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0881");
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
        java.util.Set<java.lang.String> strSet78 = functionType72.getOwnPropertyNames();
        boolean boolean80 = functionType72.removeProperty("function (): {1890705858}");
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
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0882");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0883");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        int int10 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0884");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean13 = strList10.add("");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        int int19 = strList17.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean21 = strList17.equals((java.lang.Object) 8);
        boolean boolean22 = strList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo23.getReturnType();
        java.lang.String str25 = jSDocInfo23.getOriginalCommentString();
        boolean boolean26 = jSDocInfo23.isExterns();
        jSDocInfo23.addSuppression("");
        boolean boolean29 = jSDocInfo23.isDeprecated();
        boolean boolean30 = strList17.equals((java.lang.Object) boolean29);
        boolean boolean31 = strList10.containsAll((java.util.Collection<java.lang.String>) strList17);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec33 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.clearTemplateTypeNames();
        boolean boolean39 = jSTypeRegistry36.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry36.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec33.getAssertedType(node34, jSTypeRegistry36);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType67.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType67.getPrototype();
        boolean boolean70 = jSTypeRegistry44.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType69);
        com.google.javascript.rhino.jstype.JSType jSType72 = objectType69.findPropertyType("(unknown)");
        com.google.javascript.rhino.jstype.JSType jSType73 = objectType69.restrictByNotNullOrUndefined();
        jSTypeRegistry36.unregisterPropertyOnType("", jSType73);
        boolean boolean76 = jSTypeRegistry36.isForwardDeclaredType("(JSDocInfo)");
        jSTypeRegistry36.clearNamedTypes();
        boolean boolean78 = strList10.remove((java.lang.Object) jSTypeRegistry36);
        boolean boolean79 = strSet6.containsAll((java.util.Collection<java.lang.String>) strList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = strSet6.add("unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jSType41);
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
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0885");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "ERROR");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0886");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = jSDocInfo78.getReturnType();
        java.lang.String str80 = jSDocInfo78.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility81 = jSDocInfo78.getVisibility();
        java.lang.String str82 = jSDocInfo78.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression84 = jSDocInfo78.getParameterType("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList85 = jSDocInfo78.getThrownTypes();
        functionType72.setJSDocInfo(jSDocInfo78);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType72.toObjectType();
        boolean boolean88 = functionType72.isNullType();
        boolean boolean89 = functionType72.isNoResolvedType();
        com.google.javascript.rhino.Node node90 = functionType72.getRootNode();
        java.lang.String str91 = functionType72.getNormalizedReferenceName();
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
        org.junit.Assert.assertNull(jSTypeExpression79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(visibility81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(jSTypeExpression84);
        org.junit.Assert.assertNotNull(jSTypeExpressionList85);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0887");
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
        node24.setLineno(51);
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0888");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        boolean boolean4 = node1.isGetElem();
        boolean boolean5 = node1.isExprResult();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str8 = assertionFunctionSpec7.getFunctionName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        node11.setLineno(2);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node11);
        com.google.javascript.rhino.Node node16 = assertionFunctionSpec7.getAssertedParam(node11);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node11);
        node11.addSuppression("hi!");
        boolean boolean20 = node11.isTypeOf();
        boolean boolean21 = node11.isBreak();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType44.getExtendedInterfaces();
        boolean boolean46 = functionType44.matchesStringContext();
        boolean boolean48 = functionType44.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection54 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node50);
        int int55 = node50.getLineno();
        boolean boolean56 = node50.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry23.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType44, node50);
        boolean boolean58 = node50.isCase();
        boolean boolean59 = node50.isNull();
        com.google.javascript.rhino.Node node60 = node11.useSourceInfoIfMissingFromForTree(node50);
        com.google.javascript.rhino.Node node61 = node1.copyInformationFrom(node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node62 = node1.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertNotNull(nodeCollection54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0889");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "[, hi!]");
        boolean boolean3 = node2.isBreak();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0890");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.isOr();
        node5.setLineno(2);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, node5);
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFromForTree(node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        node17.setType(43);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node22);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node26);
        boolean boolean28 = node26.isBreak();
        boolean boolean29 = node26.isAssignAdd();
        boolean boolean30 = node26.hasMoreThanOneChild();
        java.lang.String str31 = node26.getQualifiedName();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getSourceName(node34);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = null;
        node34.setStaticSourceFile(staticSourceFile38);
        boolean boolean40 = node34.isObjectLit();
        node26.addChildToBack(node34);
        node34.detachChildren();
        boolean boolean43 = node34.isLabelName();
        node34.setSourceEncodedPosition(3);
        com.google.javascript.rhino.Node node46 = node10.useSourceInfoFromForTree(node34);
        boolean boolean47 = node46.isLabelName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0891");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = functionType23.getCtorExtendedInterfaces();
        java.lang.String str95 = functionType23.getReferenceName();
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
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0892");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        java.lang.String str9 = jSDocInfo0.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean11 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0893");
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
        java.util.Spliterator<java.lang.String> strSpliterator22 = strSet6.spliterator();
        java.lang.String[][][] strArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][] strArray24 = strSet6.toArray(strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0894");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        int int8 = node2.getChildCount();
        boolean boolean9 = node2.isArrayLit();
        node2.removeProp(3);
        boolean boolean12 = node2.isNull();
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0895");
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
        boolean boolean23 = functionType20.hasInstanceType();
        boolean boolean24 = functionType20.isInterface();
        boolean boolean25 = functionType20.isReturnTypeInferred();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0896");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.clearSideEffectFlags();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0897");
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
        boolean boolean55 = jSTypeRegistry1.hasNamespace("EQ\n");
        boolean boolean57 = jSTypeRegistry1.hasNamespace("unknown");
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
        int int80 = functionType79.getMaxArguments();
        boolean boolean81 = functionType79.hasDisplayName();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean84 = node83.isOr();
        boolean boolean85 = node83.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType86 = node83.getJSType();
        boolean boolean87 = node83.isAssignAdd();
        boolean boolean88 = functionType79.equals((java.lang.Object) boolean87);
        boolean boolean89 = functionType79.isVoidType();
        boolean boolean90 = jSTypeRegistry1.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType79);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot92 = functionType79.getSlot("Node tree inequality:\nTree1:\nOR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: OR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0\n");
        boolean boolean93 = functionType79.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0898");
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
        jSDocInfo0.setLicense("NUMBER -1.0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0899");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        node11.setLineno(2);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node11);
        com.google.javascript.rhino.Node node16 = node8.useSourceInfoFromForTree(node11);
        boolean boolean17 = node1.isEquivalentTo(node11);
        boolean boolean18 = node1.isVoid();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0900");
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
        com.google.javascript.rhino.Node node11 = jSDocInfo0.getAssociatedNode();
        java.lang.String str12 = jSDocInfo0.getDescription();
        java.lang.String str13 = jSDocInfo0.getDeprecationReason();
        java.lang.String str14 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0901");
        java.lang.String[] strArray2 = new java.lang.String[] { "(NUMBER -1.0)", "(null.prototype)" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = com.google.common.collect.ImmutableList.copyOf(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "(NUMBER -1.0)", "java.io.IOException: hi!", "?", "null.prototype", "(NUMBER -1.0)", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n" };
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.copyOf(strArray18);
        int int21 = strList19.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean23 = strList19.equals((java.lang.Object) 8);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList19.containsAll((java.util.Collection<java.lang.String>) strList27);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = com.google.common.collect.ImmutableList.copyOf(strArray32);
        boolean boolean34 = strList19.contains((java.lang.Object) strArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = com.google.common.collect.ImmutableList.copyOf(strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = com.google.common.collect.ImmutableList.copyOf(strArray41);
        int int44 = strList42.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean46 = strList42.equals((java.lang.Object) 8);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strList42.containsAll((java.util.Collection<java.lang.String>) strList50);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = com.google.common.collect.ImmutableList.copyOf(strArray55);
        boolean boolean57 = strList42.contains((java.lang.Object) strArray55);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = com.google.common.collect.ImmutableList.copyOf(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList65 = com.google.common.collect.ImmutableList.copyOf(strArray64);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList67 = com.google.common.collect.ImmutableList.of(strArray2, strArray5, strArray13, strArray15, strArray32, strArray37, strArray55, strArray60, strArray64, strArray66);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArrayList67);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0902");
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
        boolean boolean27 = functionType20.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.EnumType enumType28 = functionType20.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType20.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isDateType();
        boolean boolean31 = jSType29.isGlobalThisType();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(enumType28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0903");
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
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.getParameterType();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0904");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        com.google.javascript.rhino.InputId inputId8 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        boolean boolean9 = node2.isString();
        com.google.javascript.rhino.InputId inputId11 = new com.google.javascript.rhino.InputId("Function");
        java.lang.String str12 = inputId11.toString();
        node2.setInputId(inputId11);
        java.lang.String str14 = inputId11.getIdName();
        java.lang.String str15 = inputId11.toString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InputId: Function" + "'", str12, "InputId: Function");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Function" + "'", str14, "Function");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "InputId: Function" + "'", str15, "InputId: Function");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0905");
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
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = null;
        node23.setStaticSourceFile(staticSourceFile27);
        boolean boolean29 = node23.isObjectLit();
        node15.addChildToBack(node23);
        node23.detachChildren();
        node23.putBooleanProp(38, true);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0906");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo20.getReturnType();
        java.lang.String str22 = jSDocInfo20.getOriginalCommentString();
        boolean boolean23 = jSDocInfo20.isExterns();
        jSDocInfo20.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet26 = jSDocInfo20.getModifies();
        boolean boolean28 = strSet26.contains((java.lang.Object) "unknown");
        boolean boolean29 = strSet26.isEmpty();
        boolean boolean30 = strSet6.containsAll((java.util.Collection<java.lang.String>) strSet26);
        boolean boolean31 = strSet6.isEmpty();
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
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0907");
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
        boolean boolean47 = functionType42.isString();
        boolean boolean48 = functionType42.isNullType();
        java.util.Set<java.lang.String> strSet49 = functionType42.getPropertyNames();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strSet49);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0908");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker2 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.Marker marker3 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker3.getType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList5 = com.google.common.collect.ImmutableList.of(marker0, marker2, marker3);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker3.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker3.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker3.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNotNull(markerList5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition8);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0909");
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
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType48.getIndexType();
        int int52 = functionType48.getMinArguments();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec54 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str55 = assertionFunctionSpec54.getFunctionName();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean59 = node58.isOr();
        node58.setLineno(2);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0, node58);
        com.google.javascript.rhino.Node node63 = assertionFunctionSpec54.getAssertedParam(node58);
        boolean boolean64 = node58.isString();
        functionType48.setSource(node58);
        boolean boolean67 = functionType48.removeProperty("Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n");
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType48, "?");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative70 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative70);
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
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType69);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0910");
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
        com.google.javascript.rhino.jstype.JSType jSType28 = objectType27.unboxesTo();
        boolean boolean29 = objectType27.isUnknownType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = objectType27.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType32 = objectType27.getPropertyType("FALSE [source_file: ]\n    NUMBER -1.0\n");
        boolean boolean33 = objectType27.isDateType();
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
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0911");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        boolean boolean9 = node7.isFor();
        boolean boolean10 = node7.isOptionalArg();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node7);
        boolean boolean12 = node7.isIn();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.isOr();
        boolean boolean16 = node14.isLabel();
        java.lang.String str17 = node14.toStringTree();
        boolean boolean18 = node14.isDebugger();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind25 = new com.google.javascript.jscomp.CodingConvention.Bind(node14, node20, node23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.InputId inputId33 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node30);
        node34.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind37 = new com.google.javascript.jscomp.CodingConvention.Bind(node23, node27, node34);
        node34.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node34.children();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.hasOneChild();
        boolean boolean45 = node43.isObjectLit();
        com.google.javascript.rhino.InputId inputId46 = com.google.javascript.jscomp.NodeUtil.getInputId(node43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), node43);
        java.lang.String str48 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node47);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec50 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str51 = assertionFunctionSpec50.getFunctionName();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.isOr();
        node54.setLineno(2);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0, node54);
        com.google.javascript.rhino.Node node59 = assertionFunctionSpec50.getAssertedParam(node54);
        com.google.javascript.rhino.Node node60 = node47.srcref(node59);
        com.google.javascript.rhino.Node node61 = node34.useSourceInfoFrom(node60);
        boolean boolean62 = node60.isTrue();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(100, node7, node60, 43, 48);
        com.google.javascript.rhino.Node node66 = node60.cloneNode();
        boolean boolean67 = node66.isDelProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER -1.0\n" + "'", str17, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0912");
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
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node50);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), node57);
        boolean boolean62 = node61.isNE();
        node54.addChildToBack(node61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry45.createFunctionType(jSType47, node61);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType64.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = functionType64.getPrototype();
        boolean boolean67 = functionType42.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType20.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType42);
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
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jSType68);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0913");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isGetProp();
        boolean boolean6 = node1.isGetElem();
        java.lang.String str7 = node1.toStringTree();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0\n" + "'", str7, "NUMBER -1.0\n");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0914");
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
        boolean boolean20 = node18.isTypeOf();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0915");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.wasEmptyNode();
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0916");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        node1.setSourceEncodedPositionForTree(2);
        boolean boolean4 = node1.isDefaultCase();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0917");
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
        boolean boolean62 = functionType61.isConstructor();
        com.google.javascript.rhino.Node node64 = functionType61.getPropertyNode("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        jSTypeRegistry66.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.hasOneChild();
        boolean boolean73 = node71.isObjectLit();
        com.google.javascript.rhino.InputId inputId74 = com.google.javascript.jscomp.NodeUtil.getInputId(node71);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), node71);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isObjectLit();
        com.google.javascript.rhino.InputId inputId81 = com.google.javascript.jscomp.NodeUtil.getInputId(node78);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), node78);
        boolean boolean83 = node82.isNE();
        node75.addChildToBack(node82);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry66.createFunctionType(jSType68, node82);
        int int86 = functionType85.getMaxArguments();
        boolean boolean87 = functionType85.isParameterizedType();
        java.lang.String str88 = null; // flaky: functionType85.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = functionType85.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node90 = functionType85.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType85.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = functionType91.getImplicitPrototype();
        boolean boolean93 = functionType91.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = functionType91.getOwnPropertyJSDocInfo("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType61.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType91);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType97 = functionType61.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(inputId74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(inputId81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Function" + "'", str88, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(jSDocInfo95);
        org.junit.Assert.assertNotNull(typePair96);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0918");
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
        java.lang.String str72 = null; // flaky: functionType20.toString();
        boolean boolean73 = functionType20.isFunctionType();
        java.lang.Iterable iterable74 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType20.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.TemplateType templateType76 = jSType75.toMaybeTemplateType();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(iterable74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNull(templateType76);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0919");
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
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.clearTemplateTypeNames();
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0920");
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
        int int46 = functionType45.getMaxArguments();
        boolean boolean47 = functionType45.isParameterizedType();
        java.lang.String str48 = null; // flaky: functionType45.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = functionType45.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node50 = functionType45.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = functionType45.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType51.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair53 = functionType20.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isObjectLit();
        com.google.javascript.rhino.InputId inputId63 = com.google.javascript.jscomp.NodeUtil.getInputId(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node60);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean68 = node67.hasOneChild();
        boolean boolean69 = node67.isObjectLit();
        com.google.javascript.rhino.InputId inputId70 = com.google.javascript.jscomp.NodeUtil.getInputId(node67);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((-1), node67);
        boolean boolean72 = node71.isNE();
        node64.addChildToBack(node71);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry55.createFunctionType(jSType57, node71);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = functionType74.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType74.getPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = objectType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node79 = objectType76.getPropertyNode("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType80 = objectType76.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = functionType51.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType80);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Function" + "'", str48, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNotNull(typePair53);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(inputId70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(objectType80);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0921");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isCatch();
        com.google.javascript.rhino.Node node4 = node1.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.wasEmptyNode();
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0922");
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
        boolean boolean47 = jSTypeRegistry1.shouldTolerateUndefinedValues();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0923");
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
            com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType20.cloneWithoutArrowType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertNull(functionType24);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0924");
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
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType20.toMaybeFunctionType();
        boolean boolean73 = functionType72.matchesUint32Context();
        boolean boolean74 = functionType72.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType76 = functionType72.findPropertyType("JSDocInfo");
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
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(jSType76);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0925");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        int int8 = node6.getChildCount();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isFor();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoFrom(node10);
        boolean boolean14 = node13.isBlock();
        boolean boolean15 = node13.isLabel();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0926");
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
        boolean boolean24 = functionType20.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair26 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType20, jSType25);
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType20.getRestrictedTypeGivenToBooleanOutcome(false);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType28);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0927");
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
        boolean boolean65 = node1.isIf();
        boolean boolean66 = node1.isArrayLit();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0928");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = functionType20.getParameters();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = jSDocInfo50.getReturnType();
        java.lang.String str52 = jSDocInfo50.getOriginalCommentString();
        boolean boolean53 = jSDocInfo50.isExterns();
        jSDocInfo50.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList56 = jSDocInfo50.getExtendedInterfaces();
        boolean boolean57 = jSDocInfo50.hasReturnType();
        java.lang.String str58 = jSDocInfo50.getLicense();
        jSDocInfo50.addSuppression("true");
        functionType20.setPropertyJSDocInfo("ERROR", jSDocInfo50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = functionType20.getJSDocInfo();
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
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertNull(jSTypeExpression51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(jSDocInfo62);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0929");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        boolean boolean8 = node2.isLocalResultCall();
        boolean boolean9 = node2.isNE();
        com.google.javascript.rhino.InputId inputId10 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        node2.setLength(41);
        boolean boolean13 = node2.isOr();
        boolean boolean14 = node2.isWhile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0930");
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
        node7.setSourceEncodedPositionForTree(42);
        boolean boolean17 = node7.isFalse();
        boolean boolean18 = node7.isNot();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0931");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        int int6 = node1.getSourcePosition();
        int int7 = node1.getSideEffectFlags();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0932");
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
        boolean boolean18 = node7.isCatch();
        node7.setLineno(15);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags21 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int22 = sideEffectFlags21.valueOf();
        sideEffectFlags21.clearAllFlags();
        sideEffectFlags21.clearAllFlags();
        sideEffectFlags21.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node7.setSideEffectFlags(sideEffectFlags21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0933");
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
        boolean boolean72 = functionType20.isStringValueType();
        boolean boolean74 = functionType20.removeProperty("[, hi!]");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = functionType20.getOwnImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0934");
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
        com.google.javascript.rhino.ErrorReporter errorReporter52 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node59);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean67 = node66.hasOneChild();
        boolean boolean68 = node66.isObjectLit();
        com.google.javascript.rhino.InputId inputId69 = com.google.javascript.jscomp.NodeUtil.getInputId(node66);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((-1), node66);
        boolean boolean71 = node70.isNE();
        node63.addChildToBack(node70);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry54.createFunctionType(jSType56, node70);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = functionType73.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope75 = functionType73.getParentScope();
        boolean boolean76 = functionType73.isEmptyType();
        boolean boolean77 = functionType73.isDateType();
        jSTypeRegistry1.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType73);
        jSTypeRegistry1.incrementGeneration();
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
        org.junit.Assert.assertNull(errorReporter52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertNotNull(jSTypeStaticScope75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0935");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        int int2 = jSDocInfo0.getParameterCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0936");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0937");
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
        boolean boolean23 = functionType20.isPropertyInExterns("unknown");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType44.getExtendedInterfaces();
        boolean boolean46 = functionType44.matchesStringContext();
        boolean boolean48 = functionType44.isPropertyTypeDeclared("Not declared as a constructor");
        boolean boolean49 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType20, (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.Node node51 = functionType20.getPropertyNode("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType20.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType52.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(functionType52);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0938");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "JSDocInfo");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        node2.putIntProp(15, 1);
        boolean boolean7 = node2.isUnscopedQualifiedName();
        boolean boolean8 = node2.isFor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0939");
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
        boolean boolean46 = functionType20.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType20.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType20.findPropertyType("function (): {230041977}");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(jSType49);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0940");
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
        com.google.javascript.rhino.Node node11 = jSDocInfo0.getAssociatedNode();
        java.lang.String str12 = jSDocInfo0.getDescription();
        boolean boolean13 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0941");
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
        com.google.javascript.rhino.jstype.FunctionType functionType97 = objectType67.toMaybeFunctionType();
        boolean boolean98 = objectType67.isVoidType();
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
        org.junit.Assert.assertNull(functionType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0942");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0943");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.hasOneChild();
        boolean boolean6 = node4.isObjectLit();
        com.google.javascript.rhino.InputId inputId7 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), node4);
        node8.setType(43);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        boolean boolean19 = node17.isLabel();
        java.lang.String str20 = node17.toStringTree();
        node17.setVarArgs(false);
        double double23 = node17.getDouble();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(3, node8, node12, node17, 2, 49);
        com.google.javascript.rhino.InputId inputId27 = null;
        node26.setInputId(inputId27);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        boolean boolean32 = node30.isLabel();
        boolean boolean33 = node30.isAssignAdd();
        boolean boolean34 = node30.isQualifiedName();
        java.lang.String str35 = node30.getSourceFileName();
        boolean boolean36 = node30.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node30);
        int int38 = node30.getSourceOffset();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship39 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node26, node30);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.isOr();
        node43.setLineno(2);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, node43);
        boolean boolean48 = node47.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship49 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node40, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NUMBER -1.0\n" + "'", str20, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0944");
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
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType20.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType27.findPropertyType("((InputId: Function))");
        boolean boolean30 = objectType27.isNoObjectType();
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
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0945");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        boolean boolean8 = strSet6.isEmpty();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        com.google.javascript.rhino.InputId inputId14 = com.google.javascript.jscomp.NodeUtil.getInputId(node11);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1), node11);
        node15.setType(43);
        node15.setSourceFileForTesting("");
        java.lang.String str20 = node15.toStringTree();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node15.siblings();
        boolean boolean22 = node15.isFunction();
        boolean boolean23 = strSet6.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FALSE [source_file: ]\n    NUMBER -1.0\n" + "'", str20, "FALSE [source_file: ]\n    NUMBER -1.0\n");
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0946");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        com.google.javascript.rhino.Node node4 = node1.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0947");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        boolean boolean4 = node3.isNew();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        node6.setSourceEncodedPositionForTree(2);
        int int10 = node6.getIntProp((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(2, node1, node3, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0948");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isFor();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        com.google.javascript.rhino.InputId inputId15 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), node12);
        node16.setType(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.isOr();
        boolean boolean27 = node25.isLabel();
        java.lang.String str28 = node25.toStringTree();
        node25.setVarArgs(false);
        double double31 = node25.getDouble();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(3, node16, node20, node25, 2, 49);
        com.google.javascript.rhino.Node node35 = node6.useSourceInfoFromForTree(node34);
        boolean boolean36 = node35.isThrow();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER -1.0\n" + "'", str28, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0949");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        com.google.javascript.rhino.Node node8 = node2.cloneNode();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            node8.removeChild(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0950");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        boolean boolean8 = strList3.isEmpty();
        int int9 = strList3.size();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0951");
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
        boolean boolean21 = node17.isLabelName();
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
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0952");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, 0, 16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo4.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = null;
        jSDocInfo4.setVisibility(visibility6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo4.getReturnType();
        boolean boolean9 = jSDocInfo4.isConsistentIdGenerator();
        boolean boolean10 = jSDocInfo4.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo4.getParameterNames();
        node3.setDirectives(strSet11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet11.add("NUMBER -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0953");
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
        node1.setLength(32);
        java.lang.String str67 = node1.toString();
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NUMBER -1.0 [length: 32]" + "'", str67, "NUMBER -1.0 [length: 32]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0954");
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
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.isLabel();
        boolean boolean22 = node19.isAssignAdd();
        boolean boolean23 = node19.isQualifiedName();
        java.lang.String str24 = node19.getSourceFileName();
        boolean boolean25 = node19.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection31 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node27);
        int int32 = node27.getLineno();
        boolean boolean33 = node27.isHook();
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
        boolean boolean56 = functionType54.isParameterizedType();
        java.lang.String str57 = null; // flaky: functionType54.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = functionType54.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node59 = functionType54.getParametersNode();
        com.google.javascript.rhino.Node node60 = node59.detachFromParent();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node60.getStaticSourceFile();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.isOr();
        node63.setLineno(2);
        com.google.javascript.rhino.Node node67 = node63.cloneTree();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(2, node19, node27, node60, node67, 42, 2);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildToBack(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(nodeCollection31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Function" + "'", str57, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0955");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, 0, 16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo4.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = null;
        jSDocInfo4.setVisibility(visibility6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo4.getReturnType();
        boolean boolean9 = jSDocInfo4.isConsistentIdGenerator();
        boolean boolean10 = jSDocInfo4.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo4.getParameterNames();
        node3.setDirectives(strSet11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        com.google.javascript.rhino.InputId inputId19 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), node16);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node20);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.isOr();
        boolean boolean25 = node23.isLabel();
        boolean boolean26 = node23.isAssignAdd();
        boolean boolean27 = node23.isQualifiedName();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(30, node20, node23, 4095, (int) (short) 0);
        boolean boolean31 = node30.isFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = node30.getJSDocInfo();
        boolean boolean33 = node30.isHook();
        boolean boolean34 = node30.isString();
        // The following exception was thrown during execution in test generation
        try {
            node3.removeChild(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSDocInfo32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0956");
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
        com.google.javascript.rhino.jstype.JSType jSType28 = node26.getJSType();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node35);
        java.util.Set<java.lang.String> strSet37 = node35.getDirectives();
        // The following exception was thrown during execution in test generation
        try {
            node26.removeChild(node35);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(strSet37);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0957");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo99 = functionType20.getOwnPropertyJSDocInfo("");
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
        org.junit.Assert.assertNull(jSDocInfo99);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0958");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo0.setVisibility(visibility8);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0959");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (short) 1);
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0960");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0961");
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
        boolean boolean96 = functionType90.isStringValueType();
        boolean boolean97 = functionType90.isNoObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0962");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setMutatesArguments();
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0963");
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
            com.google.javascript.rhino.Node node73 = jSTypeRegistry29.createParameters(jSTypeArray72);
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0964");
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
        boolean boolean76 = functionType20.isInterface();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType20.getImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable77);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0965");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), node9);
        boolean boolean14 = node13.isNE();
        node6.addChildToBack(node13);
        node13.addSuppression("");
        boolean boolean18 = node13.isComma();
        boolean boolean19 = node13.isRegExp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0966");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue12.and(ternaryValue13);
        int int15 = strList3.indexOf((java.lang.Object) ternaryValue14);
        boolean boolean17 = strList3.contains((java.lang.Object) "?");
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo18.getReturnType();
        java.lang.String str20 = jSDocInfo18.getOriginalCommentString();
        boolean boolean21 = jSDocInfo18.isExterns();
        jSDocInfo18.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet24 = jSDocInfo18.getModifies();
        int int25 = strSet24.size();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.isOr();
        node27.setLineno(2);
        boolean boolean31 = strSet24.contains((java.lang.Object) 2);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = com.google.common.collect.ImmutableList.copyOf(strArray34);
        java.util.Iterator<java.lang.String> strItor36 = strList35.iterator();
        boolean boolean37 = strSet24.retainAll((java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = strList35.toString();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = com.google.common.collect.ImmutableList.copyOf(strArray41);
        java.util.Iterator<java.lang.String> strItor43 = strList42.iterator();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = com.google.common.collect.ImmutableList.copyOf(strArray46);
        int int49 = strList47.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean50 = strList42.contains((java.lang.Object) int49);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor51 = strList42.listIterator();
        boolean boolean52 = strList35.equals((java.lang.Object) strList42);
        boolean boolean53 = strList3.contains((java.lang.Object) boolean52);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSTypeExpression19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[, hi!]" + "'", str38, "[, hi!]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0967");
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
        node1.setSourceFileForTesting("FALSE\n    NUMBER -1.0\n");
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
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0968");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry2.setResolveMode(resolveMode3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo5.getReturnType();
        java.lang.String str7 = jSDocInfo5.getOriginalCommentString();
        boolean boolean8 = jSDocInfo5.isExterns();
        jSDocInfo5.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet11 = jSDocInfo5.getModifies();
        int int12 = strSet11.size();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.isOr();
        node14.setLineno(2);
        boolean boolean18 = strSet11.contains((java.lang.Object) 2);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), node25);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), node32);
        boolean boolean37 = node36.isNE();
        node29.addChildToBack(node36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry20.createFunctionType(jSType22, node36);
        int int40 = functionType39.getMaxArguments();
        boolean boolean41 = functionType39.hasImplementedInterfaces();
        boolean boolean43 = functionType39.removeProperty("true");
        boolean boolean45 = functionType39.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType39.findPropertyType("InputId: Function");
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType39.toMaybeFunctionType();
        boolean boolean49 = strSet11.remove((java.lang.Object) functionType39);
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
        int int71 = functionType70.getMaxArguments();
        boolean boolean72 = functionType70.isParameterizedType();
        java.lang.String str73 = null; // flaky: functionType70.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = functionType70.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = functionType70.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType70.getParentScope();
        boolean boolean77 = jSTypeRegistry2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType39, (com.google.javascript.rhino.jstype.ObjectType) functionType70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = functionType39.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNotNull(functionType48);
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Function" + "'", str73, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet74 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet74.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0969");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        boolean boolean5 = node2.isFunction();
        boolean boolean6 = node2.isSyntheticBlock();
        boolean boolean7 = node2.isCall();
        boolean boolean8 = node2.isInc();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        java.lang.String str13 = node10.toStringTree();
        boolean boolean14 = node10.isDebugger();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind21 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node16, node19);
        boolean boolean22 = node10.isSwitch();
        boolean boolean23 = node10.isQuotedString();
        boolean boolean24 = node10.isOr();
        com.google.javascript.rhino.Node node25 = node2.copyInformationFrom(node10);
        node2.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 1, node2);
        boolean boolean29 = node2.isIf();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NUMBER -1.0\n" + "'", str13, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0970");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean13 = strList10.add("");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        int int19 = strList17.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean21 = strList17.equals((java.lang.Object) 8);
        boolean boolean22 = strList17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo23.getReturnType();
        java.lang.String str25 = jSDocInfo23.getOriginalCommentString();
        boolean boolean26 = jSDocInfo23.isExterns();
        jSDocInfo23.addSuppression("");
        boolean boolean29 = jSDocInfo23.isDeprecated();
        boolean boolean30 = strList17.equals((java.lang.Object) boolean29);
        boolean boolean31 = strList10.containsAll((java.util.Collection<java.lang.String>) strList17);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec33 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.clearTemplateTypeNames();
        boolean boolean39 = jSTypeRegistry36.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry36.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec33.getAssertedType(node34, jSTypeRegistry36);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType67.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType67.getPrototype();
        boolean boolean70 = jSTypeRegistry44.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType69);
        com.google.javascript.rhino.jstype.JSType jSType72 = objectType69.findPropertyType("(unknown)");
        com.google.javascript.rhino.jstype.JSType jSType73 = objectType69.restrictByNotNullOrUndefined();
        jSTypeRegistry36.unregisterPropertyOnType("", jSType73);
        boolean boolean76 = jSTypeRegistry36.isForwardDeclaredType("(JSDocInfo)");
        jSTypeRegistry36.clearNamedTypes();
        boolean boolean78 = strList10.remove((java.lang.Object) jSTypeRegistry36);
        boolean boolean79 = strSet6.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String str81 = strList10.get(0);
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jSType41);
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
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0971");
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
        int int20 = node19.getLineno();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0972");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = unionType65.hasAnyTemplate();
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0973");
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
        boolean boolean24 = functionType20.isOrdinaryFunction();
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType20.getTemplateTypeNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo26.getReturnType();
        java.lang.String str28 = jSDocInfo26.getOriginalCommentString();
        boolean boolean29 = jSDocInfo26.isExterns();
        jSDocInfo26.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet32 = jSDocInfo26.getModifies();
        int int33 = strSet32.size();
        boolean boolean34 = strSet32.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strList25.removeAll((java.util.Collection<java.lang.String>) strSet32);
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
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(jSTypeExpression27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0974");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0975");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        boolean boolean5 = node1.isInc();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node1.getExistingIntProp((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0976");
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
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        jSDocInfo0.setDeprecated(true);
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertNotNull(markerCollection13);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0977");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor4 = strList3.listIterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = strList3.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        com.google.javascript.rhino.InputId inputId15 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), node12);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.hasOneChild();
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.InputId inputId22 = com.google.javascript.jscomp.NodeUtil.getInputId(node19);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), node19);
        boolean boolean24 = node23.isNE();
        node16.addChildToBack(node23);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry7.createFunctionType(jSType9, node23);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node33);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isObjectLit();
        com.google.javascript.rhino.InputId inputId43 = com.google.javascript.jscomp.NodeUtil.getInputId(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), node40);
        boolean boolean45 = node44.isNE();
        node37.addChildToBack(node44);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry28.createFunctionType(jSType30, node44);
        int int48 = functionType47.getMaxArguments();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType47);
        int int50 = strList5.lastIndexOf((java.lang.Object) functionType26);
        boolean boolean52 = functionType26.removeProperty("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0978");
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
        boolean boolean98 = functionType92.canBeCalled();
        boolean boolean99 = functionType92.hasCachedValues();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0979");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        jSTypeRegistry1.resetForTypeCheck();
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
        boolean boolean31 = functionType29.isParameterizedType();
        java.lang.String str32 = null; // flaky: functionType29.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = functionType29.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node34 = functionType29.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType29.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType35);
        com.google.javascript.rhino.Node node37 = null;
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
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean67 = node66.hasOneChild();
        boolean boolean68 = node66.isObjectLit();
        com.google.javascript.rhino.InputId inputId69 = com.google.javascript.jscomp.NodeUtil.getInputId(node66);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((-1), node66);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.hasOneChild();
        boolean boolean75 = node73.isObjectLit();
        com.google.javascript.rhino.InputId inputId76 = com.google.javascript.jscomp.NodeUtil.getInputId(node73);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((-1), node73);
        boolean boolean78 = node77.isNE();
        node70.addChildToBack(node77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry61.createFunctionType(jSType63, node77);
        int int81 = functionType80.getMaxArguments();
        functionType59.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType59.autoboxesTo();
        boolean boolean84 = functionType59.hasCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable85 = functionType59.getAllExtendedInterfaces();
        boolean boolean86 = functionType59.hasCachedValues();
        boolean boolean87 = functionType59.isInterface();
        boolean boolean88 = functionType59.hasReferenceName();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList89 = functionType59.getSubTypes();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry1.createFromTypeNodes(node37, "Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType59);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Function" + "'", str32, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertNotNull(objectType36);
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
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(inputId76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(functionTypeList89);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0980");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.isOr();
        boolean boolean27 = node25.isLabel();
        boolean boolean28 = node25.isAssignAdd();
        int int29 = node25.getChildCount();
        boolean boolean30 = node25.isGetProp();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = functionType23.equals((java.lang.Object) boolean30);
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0981");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0982");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        boolean boolean3 = jSTypeRegistry1.isForwardDeclaredType("Not declared as a constructor");
        com.google.javascript.rhino.ErrorReporter errorReporter4 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.clearTemplateTypeNames();
        boolean boolean10 = jSTypeRegistry7.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        com.google.javascript.rhino.InputId inputId15 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        boolean boolean16 = node12.hasMoreThanOneChild();
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
        node12.setJSType((com.google.javascript.rhino.jstype.JSType) objectType43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo46.getReturnType();
        java.lang.String str48 = jSDocInfo46.getOriginalCommentString();
        boolean boolean49 = jSDocInfo46.isExterns();
        jSDocInfo46.addSuppression("hi!");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        java.lang.String str56 = com.google.javascript.jscomp.NodeUtil.getSourceName(node53);
        jSDocInfo46.setAssociatedNode(node53);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry7.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType43, node53);
        boolean boolean59 = jSTypeRegistry1.declareType("Node tree inequality:\nTree1:\nERROR\n    NUMBER -1.0\n\n\nTree2:\nDELPROP  2\n\n\nSubtree1: ERROR\n    NUMBER -1.0\n\n\nSubtree2: DELPROP  2\n", (com.google.javascript.rhino.jstype.JSType) objectType43);
        boolean boolean61 = jSTypeRegistry1.isForwardDeclaredType("ERROR\n    NUMBER -1.0\n");
        com.google.javascript.rhino.ErrorReporter errorReporter62 = jSTypeRegistry1.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
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
        org.junit.Assert.assertNull(jSTypeExpression47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(errorReporter62);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0983");
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
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType20.toObjectType();
        java.lang.String str24 = objectType23.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType25 = objectType23.restrictByNotNullOrUndefined();
        boolean boolean27 = objectType23.removeProperty("FALSE\n    NUMBER -1.0\n");
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
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0984");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry1.getNativeObjectType(jSTypeNative28);
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
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0985");
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
        boolean boolean98 = functionType20.hasProperty("hi!");
        int int99 = functionType20.getExtendedInterfacesCount();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0986");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("hi!", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("hi!", throwable8);
        iOException5.addSuppressed((java.lang.Throwable) iOException9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0987");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.isLabel();
        boolean boolean5 = node2.isAssignAdd();
        boolean boolean6 = node2.isQualifiedName();
        int int7 = node2.getSourcePosition();
        int int8 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node node9 = null;
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
        boolean boolean23 = node17.isSetterDef();
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        node17.setSourceEncodedPositionForTree(42);
        boolean boolean27 = node17.isFalse();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        boolean boolean32 = jSTypeRegistry29.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        boolean boolean38 = node34.hasMoreThanOneChild();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType63.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType63.getPrototype();
        boolean boolean66 = jSTypeRegistry40.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType65);
        node34.setJSType((com.google.javascript.rhino.jstype.JSType) objectType65);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression69 = jSDocInfo68.getReturnType();
        java.lang.String str70 = jSDocInfo68.getOriginalCommentString();
        boolean boolean71 = jSDocInfo68.isExterns();
        jSDocInfo68.addSuppression("hi!");
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isObjectLit();
        java.lang.String str78 = com.google.javascript.jscomp.NodeUtil.getSourceName(node75);
        jSDocInfo68.setAssociatedNode(node75);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry29.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType65, node75);
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node75);
        com.google.javascript.jscomp.CodingConvention.Bind bind82 = new com.google.javascript.jscomp.CodingConvention.Bind(node9, node17, node75);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(54, node2, node75, 39, 42);
        com.google.javascript.rhino.Node node86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node87 = node85.srcref(node86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
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
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(jSTypeExpression69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0988");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0989");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isLabelName();
        boolean boolean6 = node1.hasChildren();
        node1.setLineno((int) (byte) 10);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0990");
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
        boolean boolean26 = functionType20.isNoType();
        boolean boolean27 = functionType20.isEmptyType();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType20.getOwnerFunction();
        boolean boolean29 = functionType20.isOrdinaryFunction();
        java.lang.String str30 = null; // flaky: functionType20.toAnnotationString();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Function" + "'", str30, "Function");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0991");
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
        java.lang.Iterable iterable25 = functionType20.getCtorImplementedInterfaces();
        boolean boolean27 = functionType20.isPropertyInExterns("");
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
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Function" + "'", str23, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(iterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0992");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor6 = strList3.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strList3.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = strList3.asList();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList12.spliterator();
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
        boolean boolean39 = strList12.contains((java.lang.Object) node33);
        boolean boolean40 = strList3.containsAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean41 = strList3.isEmpty();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0993");
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
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType20.findPropertyType("InputId: Function");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType20.toMaybeFunctionType();
        int int30 = functionType29.getMinArguments();
        com.google.javascript.rhino.Node node31 = functionType29.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        jSTypeRegistry33.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isObjectLit();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node38);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isObjectLit();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node45);
        boolean boolean50 = node49.isNE();
        node42.addChildToBack(node49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry33.createFunctionType(jSType35, node49);
        int int53 = functionType52.getMaxArguments();
        boolean boolean54 = functionType52.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        jSTypeRegistry56.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), node61);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.hasOneChild();
        boolean boolean70 = node68.isObjectLit();
        com.google.javascript.rhino.InputId inputId71 = com.google.javascript.jscomp.NodeUtil.getInputId(node68);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), node68);
        boolean boolean73 = node72.isNE();
        node65.addChildToBack(node72);
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry56.createFunctionType(jSType58, node72);
        boolean boolean76 = functionType75.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair77 = functionType52.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType75);
        boolean boolean78 = functionType52.isReturnTypeInferred();
        functionType29.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType52);
        com.google.javascript.rhino.jstype.EnumType enumType80 = functionType29.toMaybeEnumType();
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
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(inputId71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(typePair77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(enumType80);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0994");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int6 = node1.getLineno();
        boolean boolean7 = node1.isDec();
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node1);
        boolean boolean9 = node1.isVoid();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = node1.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0995");
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
        com.google.javascript.rhino.jstype.ObjectType objectType81 = objectType78.dereference();
        boolean boolean82 = objectType78.isAllType();
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
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0996");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        java.lang.String str2 = ternaryValue0.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue4.not();
        java.lang.String str6 = ternaryValue4.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue3.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        boolean boolean13 = ternaryValue11.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue14.not();
        java.lang.String str16 = ternaryValue14.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue9.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        java.lang.String str20 = ternaryValue19.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue21.not();
        java.lang.String str23 = ternaryValue21.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue21.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue25.not();
        java.lang.String str27 = ternaryValue25.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue25.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue24.and(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue19.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue18.xor(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unknown" + "'", str2, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unknown" + "'", str6, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "unknown" + "'", str16, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "true" + "'", str20, "true");
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "unknown" + "'", str23, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "unknown" + "'", str27, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0997");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        int int5 = node1.getLength();
        boolean boolean6 = node1.isArrayLit();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0998");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        int int5 = node1.getSourcePosition();
        node1.putIntProp((int) '#', (-1));
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        boolean boolean13 = node10.isAssignAdd();
        boolean boolean14 = node10.isQualifiedName();
        int int15 = node10.getSourcePosition();
        int int16 = node10.getSideEffectFlags();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node10.siblings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = node1.clonePropsFrom(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeIterable17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0999");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test1000");
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
        boolean boolean46 = functionType20.isReturnTypeInferred();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.isOr();
        boolean boolean50 = node48.isLabel();
        boolean boolean51 = node48.isAssignAdd();
        boolean boolean52 = node48.isAnd();
        functionType20.setSource(node48);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType20.getJSDocInfo();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSDocInfo54);
    }
}
