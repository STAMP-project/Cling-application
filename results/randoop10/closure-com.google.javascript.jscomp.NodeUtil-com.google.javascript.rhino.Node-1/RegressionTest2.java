import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType65.cloneWithoutArrowType();
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
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0402");
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
        boolean boolean28 = objectType27.isEnumElementType();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0403");
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
        boolean boolean72 = objectType67.isFunctionType();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0404");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean2 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0405");
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
        com.google.javascript.rhino.jstype.FunctionType functionType97 = functionType92.getConstructor();
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
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0406");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
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
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = null;
        node24.setStaticSourceFile(staticSourceFile25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        boolean boolean28 = node27.isArrayLit();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node19, node27);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType30 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType31 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
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
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile55 = null;
        node54.setStaticSourceFile(staticSourceFile55);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newExpr(node54);
        boolean boolean58 = node57.isArrayLit();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship59 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType31, node49, node57);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType60 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType61 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType62 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
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
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile86 = null;
        node85.setStaticSourceFile(staticSourceFile86);
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newExpr(node85);
        boolean boolean89 = node88.isArrayLit();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship90 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType62, node80, node88);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType91 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList92 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1, subclassType30, subclassType31, subclassType60, subclassType61, subclassType62, subclassType91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + subclassType30 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType30.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertTrue("'" + subclassType31 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType31.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
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
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + subclassType61 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType61.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType62 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType62.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
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
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + subclassType91 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType91.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0407");
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
        boolean boolean26 = node24.isLabelName();
        boolean boolean27 = node24.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0408");
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
            java.lang.String str19 = strList3.set((int) (short) -1, "[, hi!]");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0409");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.clearSideEffectFlags();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setMutatesThis();
        boolean boolean4 = sideEffectFlags0.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0410");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        int int9 = node6.getLength();
        boolean boolean10 = node6.isEmpty();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str13 = assertionFunctionSpec12.getFunctionName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        node16.setLineno(2);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0, node16);
        com.google.javascript.rhino.Node node21 = assertionFunctionSpec12.getAssertedParam(node16);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        node16.addSuppression("hi!");
        boolean boolean25 = node16.isTypeOf();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node31 = node27.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildBefore(node16, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0411");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        node1.setVarArgs(false);
        double double7 = node1.getDouble();
        boolean boolean8 = node1.isNE();
        node1.setCharno((-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = null;
        node12.setStaticSourceFile(staticSourceFile16);
        boolean boolean18 = node12.isObjectLit();
        boolean boolean19 = node12.isAssign();
        node1.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12);
        boolean boolean23 = node22.isExprResult();
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
        com.google.javascript.rhino.Node node37 = node22.srcref(node25);
        com.google.javascript.rhino.Node node38 = node12.srcref(node25);
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = functionType59.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType59.getReturnType();
        java.lang.String str64 = jSType63.toString();
        node38.setJSType(jSType63);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER -1.0\n" + "'", str28, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
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
        org.junit.Assert.assertNotNull(objectTypeIterable62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "?" + "'", str64, "?");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0412");
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
        int int29 = functionType20.getMaxArguments();
        boolean boolean30 = functionType20.isResolved();
        boolean boolean31 = functionType20.isConstructor();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0413");
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
        node17.removeProp((-1));
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0414");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "java.io.IOException: ");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node10);
        node10.setLineno(15);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        boolean boolean17 = node15.isLabel();
        java.lang.String str18 = node15.toStringTree();
        boolean boolean19 = node15.isDebugger();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.hasOneChild();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind26 = new com.google.javascript.jscomp.CodingConvention.Bind(node15, node21, node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        node35.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind38 = new com.google.javascript.jscomp.CodingConvention.Bind(node24, node28, node35);
        node35.setSourceEncodedPosition((int) (byte) 10);
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
        java.lang.String str57 = node47.getSourceFileName();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isObjectLit();
        com.google.javascript.rhino.InputId inputId63 = com.google.javascript.jscomp.NodeUtil.getInputId(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node60);
        java.lang.String str65 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node64);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec67 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str68 = assertionFunctionSpec67.getFunctionName();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean72 = node71.isOr();
        node71.setLineno(2);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0, node71);
        com.google.javascript.rhino.Node node76 = assertionFunctionSpec67.getAssertedParam(node71);
        com.google.javascript.rhino.Node node77 = node64.srcref(node76);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 100, node10, node35, node47, node77);
        boolean boolean79 = node10.hasOneChild();
        com.google.javascript.rhino.Node node80 = node10.getNext();
        com.google.javascript.rhino.Node node81 = node2.srcrefTree(node10);
        // The following exception was thrown during execution in test generation
        try {
            node10.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER -1.0\n" + "'", str18, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0415");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.clearSideEffectFlags();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0416");
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
        // The following exception was thrown during execution in test generation
        try {
            strList28.add(53, "(Named type with empty name component)");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType82 = functionType65.getTopMostDefiningType("?");
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0418");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isFor();
        boolean boolean9 = node6.isOptionalArg();
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node6);
        boolean boolean11 = node6.isIn();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        boolean boolean15 = node13.isLabel();
        boolean boolean16 = node13.isAssignAdd();
        boolean boolean17 = node13.isQualifiedName();
        java.lang.String str18 = node13.getSourceFileName();
        boolean boolean19 = node13.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node13);
        int int21 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        boolean boolean29 = node24.isName();
        boolean boolean30 = node24.isComma();
        boolean boolean31 = node24.isDo();
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildBefore(node13, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0419");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasDescriptionForParameter("NUMBER -1.0 2\n");
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
        boolean boolean25 = functionType23.isParameterizedType();
        java.lang.String str26 = null; // flaky: functionType23.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node28 = functionType23.getParametersNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isObjectLit();
        boolean boolean33 = node30.isFunction();
        boolean boolean34 = node30.isSyntheticBlock();
        boolean boolean35 = node30.isCall();
        boolean boolean36 = node30.isInc();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        boolean boolean40 = node38.isLabel();
        java.lang.String str41 = node38.toStringTree();
        boolean boolean42 = node38.isDebugger();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind49 = new com.google.javascript.jscomp.CodingConvention.Bind(node38, node44, node47);
        boolean boolean50 = node38.isSwitch();
        boolean boolean51 = node38.isQuotedString();
        boolean boolean52 = node38.isOr();
        com.google.javascript.rhino.Node node53 = node30.copyInformationFrom(node38);
        node30.setIsSyntheticBlock(true);
        boolean boolean56 = node28.isEquivalentToTyped(node30);
        jSDocInfo0.setAssociatedNode(node30);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isObjectLit();
        com.google.javascript.rhino.InputId inputId63 = com.google.javascript.jscomp.NodeUtil.getInputId(node60);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node60);
        boolean boolean65 = node64.isTry();
        boolean boolean66 = node64.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = node30.removeChildAfter(node64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Function" + "'", str26, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NUMBER -1.0\n" + "'", str41, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0420");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        java.lang.Class<?> wildcardClass5 = node1.getClass();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.InputId inputId9 = node7.getInputId();
        boolean boolean10 = node7.isNew();
        java.lang.Class<?> wildcardClass11 = node7.getClass();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.InputId inputId15 = node13.getInputId();
        boolean boolean16 = node13.isNew();
        java.lang.Class<?> wildcardClass17 = node13.getClass();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        com.google.javascript.rhino.InputId inputId21 = node19.getInputId();
        boolean boolean22 = node19.isNew();
        java.lang.Class<?> wildcardClass23 = node19.getClass();
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] { wildcardClass5, wildcardClass11, wildcardClass17, wildcardClass23 };
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList25 = com.google.common.collect.ImmutableList.copyOf(typeArray24);
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList26 = com.google.common.collect.ImmutableList.copyOf(typeArray24);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeList25);
        org.junit.Assert.assertNotNull(typeList26);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0421");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor6 = strList3.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strList3.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = strList3.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.set(43, "");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0422");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0423");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean6 = strList3.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strList3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "(InputId: Function)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSpliterator7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0424");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getPositionOnStartLine();
        int int3 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node10);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec13 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str14 = assertionFunctionSpec13.getFunctionName();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        node17.setLineno(2);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0, node17);
        com.google.javascript.rhino.Node node22 = assertionFunctionSpec13.getAssertedParam(node17);
        com.google.javascript.rhino.Node node23 = node10.srcref(node22);
        com.google.javascript.rhino.Node node24 = node23.getFirstChild();
        boolean boolean25 = node24.isCall();
        namePosition0.setItem(node24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0425");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression70 = jSDocInfo69.getReturnType();
        java.lang.String str71 = jSDocInfo69.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility72 = jSDocInfo69.getVisibility();
        java.lang.String str73 = jSDocInfo69.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = jSDocInfo69.getParameterType("");
        int int76 = jSDocInfo69.getExtendedInterfacesCount();
        functionType20.setJSDocInfo(jSDocInfo69);
        boolean boolean78 = functionType20.isInstanceType();
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
        org.junit.Assert.assertNull(jSTypeExpression70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(visibility72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(jSTypeExpression75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0426");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0427");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.InputId inputId6 = node2.getInputId();
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("Function");
        node2.setInputId(inputId8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.isOr();
        boolean boolean14 = node12.isLabel();
        boolean boolean15 = node12.isAssignAdd();
        boolean boolean16 = node12.isQualifiedName();
        java.lang.String str17 = node12.getSourceFileName();
        boolean boolean18 = node12.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node20);
        int int25 = node20.getLineno();
        boolean boolean26 = node20.isHook();
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node53.getStaticSourceFile();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.isOr();
        node56.setLineno(2);
        com.google.javascript.rhino.Node node60 = node56.cloneTree();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(2, node12, node20, node53, node60, 42, 2);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean67 = node66.hasOneChild();
        boolean boolean68 = node66.isObjectLit();
        com.google.javascript.rhino.InputId inputId69 = com.google.javascript.jscomp.NodeUtil.getInputId(node66);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((-1), node66);
        boolean boolean71 = node66.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node63, node66, 46, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(nodeCollection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
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
        org.junit.Assert.assertNull(staticSourceFile54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0428");
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
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection16 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node6);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator17 = nodeCollection16.spliterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeCollection16);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0429");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor6 = strList3.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strList3.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = strList3.asList();
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
        functionType29.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType29.autoboxesTo();
        boolean boolean54 = functionType29.isFunctionPrototypeType();
        boolean boolean55 = functionType29.hasInstanceType();
        java.util.Set<java.lang.String> strSet56 = functionType29.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = strList8.retainAll((java.util.Collection<java.lang.String>) strSet56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertNotNull(strList8);
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
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strSet56);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0430");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        boolean boolean7 = node6.isTrue();
        com.google.javascript.rhino.Node node8 = node6.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0431");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = node2.getFirstChild();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str9 = assertionFunctionSpec8.getFunctionName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.isOr();
        node12.setLineno(2);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0, node12);
        com.google.javascript.rhino.Node node17 = assertionFunctionSpec8.getAssertedParam(node12);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        node12.addSuppression("hi!");
        boolean boolean21 = node12.isTypeOf();
        boolean boolean22 = node12.isBreak();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
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
        boolean boolean47 = functionType45.matchesStringContext();
        boolean boolean49 = functionType45.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection55 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node51);
        int int56 = node51.getLineno();
        boolean boolean57 = node51.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry24.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node51);
        boolean boolean59 = node51.isCase();
        boolean boolean60 = node51.isNull();
        com.google.javascript.rhino.Node node61 = node12.useSourceInfoIfMissingFromForTree(node51);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        jSTypeRegistry63.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.hasOneChild();
        boolean boolean70 = node68.isObjectLit();
        com.google.javascript.rhino.InputId inputId71 = com.google.javascript.jscomp.NodeUtil.getInputId(node68);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), node68);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isObjectLit();
        com.google.javascript.rhino.InputId inputId78 = com.google.javascript.jscomp.NodeUtil.getInputId(node75);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), node75);
        boolean boolean80 = node79.isNE();
        node72.addChildToBack(node79);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry63.createFunctionType(jSType65, node79);
        int int83 = functionType82.getMaxArguments();
        boolean boolean84 = functionType82.isParameterizedType();
        java.lang.String str85 = null; // flaky: functionType82.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = functionType82.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node87 = functionType82.getParametersNode();
        com.google.javascript.rhino.Node node88 = node87.detachFromParent();
        boolean boolean89 = node88.isTry();
        com.google.javascript.rhino.Node node90 = node88.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(4095, node6, node61, node90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(nodeCollection55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(inputId71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(inputId78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0432");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[]> resolveModeArrayBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[]>();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0433");
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
        boolean boolean26 = functionType20.hasOwnProperty("Not declared as a constructor");
        boolean boolean27 = functionType20.isAllType();
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
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0434");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        boolean boolean5 = node3.hasMoreThanOneChild();
        boolean boolean6 = node3.isReturn();
        boolean boolean7 = node3.isScript();
        boolean boolean8 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.rhino.InputId inputId12 = node10.getInputId();
        boolean boolean13 = node10.isNot();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        node19.setLineno(2);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, node19);
        com.google.javascript.rhino.Node node24 = node16.useSourceInfoFromForTree(node19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.isOr();
        boolean boolean28 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType29 = node26.getJSType();
        boolean boolean30 = node26.isAssignAdd();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(41, node3, node10, node24, node26, (int) '4', 45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(2, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0435");
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
        boolean boolean49 = objectType48.isEmptyType();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0436");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        java.lang.Object obj5 = node1.getProp((int) (short) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0437");
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
        strSet6.clear();
        java.lang.Object[] objArray49 = strSet6.toArray();
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
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0438");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        java.lang.String str3 = stringPosition0.getItem();
        int int4 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0439");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node1.getString();
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0440");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        int int8 = typePosition0.getPositionOnStartLine();
        boolean boolean9 = typePosition0.hasBrackets();
        int int10 = typePosition0.getEndLine();
        boolean boolean11 = typePosition0.hasBrackets();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0441");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType20.getExtendedInterfaces();
        java.lang.String str47 = functionType20.getDisplayName();
        boolean boolean49 = functionType20.hasProperty("(null.prototype)");
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
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0442");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        node1.setLineno(2);
        com.google.javascript.rhino.InputId inputId5 = node1.getInputId();
        com.google.javascript.rhino.InputId inputId7 = new com.google.javascript.rhino.InputId("Function");
        node1.setInputId(inputId7);
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
        boolean boolean31 = functionType29.hasImplementedInterfaces();
        boolean boolean33 = functionType29.removeProperty("true");
        boolean boolean35 = functionType29.isPropertyInExterns("");
        boolean boolean36 = inputId7.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId5);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0443");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0444");
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
        boolean boolean25 = node19.isUnscopedQualifiedName();
        java.lang.String str26 = node19.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(14, node19);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0445");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression52 = jSDocInfo51.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility53 = null;
        jSDocInfo51.setVisibility(visibility53);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = jSDocInfo51.getReturnType();
        boolean boolean56 = jSDocInfo51.isConsistentIdGenerator();
        boolean boolean57 = jSDocInfo51.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet58 = jSDocInfo51.getParameterNames();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.isOr();
        boolean boolean62 = node60.isLabel();
        node60.setOptionalArg(false);
        boolean boolean65 = strSet58.equals((java.lang.Object) node60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = strList5.retainAll((java.util.Collection<java.lang.String>) strSet58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(jSTypeExpression52);
        org.junit.Assert.assertNull(jSTypeExpression55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0446");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        node6.setLineno(2);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, node6);
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFromForTree(node6);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node19);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.isOr();
        boolean boolean24 = node22.isLabel();
        boolean boolean25 = node22.isAssignAdd();
        boolean boolean26 = node22.isQualifiedName();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(30, node19, node22, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.hasOneChild();
        boolean boolean35 = node33.isObjectLit();
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node33);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node33);
        node37.setType(43);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.isOr();
        boolean boolean48 = node46.isLabel();
        java.lang.String str49 = node46.toStringTree();
        node46.setVarArgs(false);
        double double52 = node46.getDouble();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(3, node37, node41, node46, 2, 49);
        boolean boolean56 = node41.isScript();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(14, node6, node19, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "NUMBER -1.0\n" + "'", str49, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0448");
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
        com.google.javascript.rhino.Node node51 = node50.detachFromParent();
        boolean boolean52 = node51.isTry();
        com.google.javascript.rhino.Node node53 = node51.cloneNode();
        functionType20.setSource(node51);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType20.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = jSType55.isEmptyType();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Function" + "'", str48, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(jSType55);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0449");
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
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType20.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType26 = objectType25.autoboxesTo();
        boolean boolean28 = objectType25.removeProperty("JSDocInfo");
        boolean boolean29 = objectType25.isConstructor();
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
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0450");
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
        java.lang.String str48 = functionType20.getDisplayName();
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
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0451");
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
        java.util.Collection<java.lang.String> strCollection17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strList3.addAll(30, strCollection17);
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
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0452");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.isOr();
        node5.setLineno(2);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, node5);
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFromForTree(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0453");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getParameterCount();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        boolean boolean3 = jSDocInfo0.isConstructor();
        jSDocInfo0.addSuppression("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0454");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0455");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        stringPosition0.setItem("[, hi!]");
        int int5 = stringPosition0.getPositionOnEndLine();
        java.lang.String str6 = stringPosition0.getItem();
        int int7 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[, hi!]" + "'", str6, "[, hi!]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0456");
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
        boolean boolean23 = objectType22.matchesUint32Context();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0457");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = node6.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node11.getExistingIntProp(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 48");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0458");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(46, nodeArray5);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(47, nodeArray5);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(37, nodeArray5);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(10, nodeArray5, 12, 36);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(40, nodeArray5, 2, (int) '#');
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags15 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int16 = sideEffectFlags15.valueOf();
        sideEffectFlags15.clearAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node14.setSideEffectFlags(sideEffectFlags15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0459");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(31, "");
        node3.setVarArgs(false);
        int int6 = node3.getLength();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship8 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0460");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        boolean boolean9 = jSDocInfo0.isNoShadow();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0461");
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
        boolean boolean76 = node7.isGetterDef();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0462");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType20.findPropertyType("Not declared as a constructor");
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
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(jSType48);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0463");
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
        com.google.javascript.rhino.jstype.JSType jSType66 = objectType65.getParameterType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = objectType65.getOwnerFunction();
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
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNull(functionType67);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0464");
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
        java.lang.String[] strArray44 = new java.lang.String[] { "Unknown class name", "InputId: Function", "InputId: Function", "Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", "(InputId: Function)", "Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", "NUMBER -1.0\n", "(Unknown class name)", "", "Unknown class name", "Not declared as a type name", "FALSE [source_file: ]\n    NUMBER -1.0\n", "null.prototype", "true", "(Named type with empty name component)", "ERROR\n    NUMBER -1.0\n", "(unknown)", "(Unknown class name)", "JSDocInfo", "InputId: Function", "FALSE [source_file: ]\n    NUMBER -1.0\n", "JSDocInfo", "(InputId: Function)", "hi!", "hi!", "NUMBER -1.0", "(Named type with empty name component)", "Not declared as a type name", "(Named type with empty name component)", "Node tree inequality:\nTree1:\nERROR\n    NUMBER -1.0\n\n\nTree2:\nDELPROP  2\n\n\nSubtree1: ERROR\n    NUMBER -1.0\n\n\nSubtree2: DELPROP  2\n" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = strSet6.addAll((java.util.Collection<java.lang.String>) strList45);
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0465");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setThrows();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0466");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "JSDocInfo");
        int int3 = node2.getCharno();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0467");
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
            boolean boolean24 = functionType23.isUnknownType();
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0468");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        boolean boolean8 = strList3.isEmpty();
        java.util.ListIterator<java.lang.String> strItor9 = strList3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor9.remove();
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0469");
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
        java.util.Set<java.lang.String> strSet23 = functionType20.getOwnPropertyNames();
        boolean boolean24 = functionType20.hasReferenceName();
        boolean boolean25 = functionType20.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo26.getReturnType();
        java.lang.String str28 = jSDocInfo26.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = jSDocInfo26.getVisibility();
        java.lang.String str30 = jSDocInfo26.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo26.getParameterType("");
        int int33 = jSDocInfo26.getExtendedInterfacesCount();
        functionType20.setJSDocInfo(jSDocInfo26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = functionType20.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSTypeExpression27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(visibility29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0470");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node1.getStaticSourceFile();
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.appendStringTree(appendable17);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0471");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType20.getCtorExtendedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable23);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0472");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("");
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isOverride();
        boolean boolean9 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType41.getSuperClassConstructor();
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0474");
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
        boolean boolean27 = functionType26.isConstructor();
        boolean boolean28 = functionType26.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType26.getOwnerFunction();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(functionType29);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0475");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 1, 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.hasOneChild();
        boolean boolean8 = node6.isObjectLit();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), node6);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node10);
        int int12 = node10.getChildCount();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.isFor();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoFrom(node14);
        boolean boolean18 = node10.isAssignAdd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.isOr();
        node32.setLineno(2);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0, node32);
        java.lang.String str37 = node32.toStringTree();
        int int38 = node32.getChildCount();
        boolean boolean39 = node32.isArrayLit();
        node32.removeProp(3);
        boolean boolean42 = node32.isNull();
        boolean boolean43 = node32.isFor();
        com.google.javascript.rhino.Node node44 = node29.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        boolean boolean49 = node47.isLabel();
        java.lang.String str50 = node47.toStringTree();
        boolean boolean51 = node47.isDebugger();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection57 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isAnd();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0, node47, node53, node59, node63, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile69 = node68.getStaticSourceFile();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) -1, node24, node29, node68);
        boolean boolean71 = node29.isAssign();
        com.google.javascript.rhino.Node node73 = node29.getChildAtIndex((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChild(node10, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node has siblings.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "NUMBER -1.0 2\n" + "'", str37, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "NUMBER -1.0\n" + "'", str50, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertNotNull(nodeCollection57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(staticSourceFile69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0476");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isInterface();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0477");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        int int9 = node6.getLength();
        boolean boolean10 = node6.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node6.siblings();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeIterable11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0478");
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
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.hasOneChild();
        boolean boolean63 = node61.isObjectLit();
        com.google.javascript.rhino.InputId inputId64 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), node61);
        node65.setType(43);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isObjectLit();
        java.lang.String str72 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node69);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean75 = node74.isOr();
        boolean boolean76 = node74.isLabel();
        java.lang.String str77 = node74.toStringTree();
        node74.setVarArgs(false);
        double double80 = node74.getDouble();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(3, node65, node69, node74, 2, 49);
        com.google.javascript.rhino.Node node84 = node18.useSourceInfoFromForTree(node83);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo85 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "NUMBER -1.0\n" + "'", str77, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertNotNull(node84);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0479");
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
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType43.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = functionType46.isNominalConstructor();
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
        org.junit.Assert.assertNull(functionType46);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0480");
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
        boolean boolean34 = node32.isArrayLit();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0481");
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
        com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType20.getConstructor();
        boolean boolean26 = functionType20.isNominalType();
        boolean boolean27 = functionType20.isAllType();
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
        org.junit.Assert.assertNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0482");
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
        int int14 = jSDocInfo0.getExtendedInterfacesCount();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0483");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.Marker marker2 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.Marker marker3 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker3.getType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList5 = com.google.common.collect.ImmutableList.of(marker0, marker2, marker3);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNotNull(markerList5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0484");
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
        boolean boolean48 = functionType20.isReturnTypeInferred();
        boolean boolean49 = functionType20.isConstructor();
        java.lang.String str50 = null; // flaky: functionType20.toAnnotationString();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Function" + "'", str50, "Function");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0485");
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
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType20.getPropertyType("true");
        java.lang.String str75 = functionType20.getReferenceName();
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
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0486");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType95 = functionType90.getSuperClassConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0487");
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
        java.util.Set<java.lang.String> strSet23 = functionType20.getOwnPropertyNames();
        boolean boolean24 = functionType20.hasReferenceName();
        boolean boolean25 = functionType20.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo26.getReturnType();
        java.lang.String str28 = jSDocInfo26.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = jSDocInfo26.getVisibility();
        java.lang.String str30 = jSDocInfo26.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo26.getParameterType("");
        int int33 = jSDocInfo26.getExtendedInterfacesCount();
        functionType20.setJSDocInfo(jSDocInfo26);
        java.lang.String str35 = jSDocInfo26.getMeaning();
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
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSTypeExpression27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(visibility29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0488");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isSyntheticBlock();
        node2.setWasEmptyNode(false);
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            node2.appendStringTree(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0489");
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
        boolean boolean48 = functionType20.isReturnTypeInferred();
        int int49 = functionType20.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType20.getPropertyType("InputId: Function");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(jSType51);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0490");
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = com.google.common.collect.ImmutableList.of("", "NUMBER -1.0\n", "", "unknown", "hi!", "unknown", "NUMBER -1.0\n", "", "JSDocInfo", "NUMBER -1.0\n");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor11 = strList10.listIterator();
        java.util.ListIterator<java.lang.String> strItor12 = strList10.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            strList10.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0491");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType28.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType28.getPrototype();
        boolean boolean31 = jSTypeRegistry5.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean33 = objectType30.isPropertyInExterns("Function");
        boolean boolean34 = strList3.contains((java.lang.Object) boolean33);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = com.google.common.collect.ImmutableList.copyOf(strArray37);
        int int40 = strList38.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean42 = strList38.equals((java.lang.Object) 8);
        boolean boolean43 = strList38.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = strList3.addAll((java.util.Collection<java.lang.String>) strList38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
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
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0492");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean2 = jSDocInfo0.hasThisType();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0493");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable73 = functionType20.getOwnImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable73);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0494");
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
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.isOr();
        boolean boolean59 = node57.isLabel();
        java.lang.String str60 = node57.toStringTree();
        boolean boolean61 = node57.isDebugger();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection67 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node63);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isAnd();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.hasOneChild();
        boolean boolean75 = node73.isObjectLit();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0, node57, node63, node69, node73, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile79 = node78.getStaticSourceFile();
        node50.putProp((int) (byte) 1, (java.lang.Object) staticSourceFile79);
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
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NUMBER -1.0\n" + "'", str60, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputId66);
        org.junit.Assert.assertNotNull(nodeCollection67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(staticSourceFile79);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0495");
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
        org.junit.Assert.assertNull(jSDocInfo54);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0496");
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
        boolean boolean71 = functionType65.hasReferenceName();
        boolean boolean72 = functionType65.isBooleanValueType();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0497");
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
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType26.findPropertyType("(unknown)");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = objectType26.getCtorImplementedInterfaces();
        boolean boolean31 = objectType26.isVoidType();
        boolean boolean32 = objectType26.isNullType();
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
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0498");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(12);
        boolean boolean3 = node2.isExprResult();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.isOr();
        boolean boolean7 = node5.isLabel();
        java.lang.String str8 = node5.toStringTree();
        boolean boolean9 = node5.isDebugger();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node5, node11, node14);
        com.google.javascript.rhino.Node node17 = node2.srcref(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.isLabel();
        java.lang.String str22 = node19.toStringTree();
        boolean boolean23 = node19.isDebugger();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind30 = new com.google.javascript.jscomp.CodingConvention.Bind(node19, node25, node28);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(29, node2, node19, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NUMBER -1.0\n" + "'", str8, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "NUMBER -1.0\n" + "'", str22, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0499");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode34 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
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
        functionType58.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType79);
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType58.autoboxesTo();
        boolean boolean83 = functionType58.hasCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType58.getAllExtendedInterfaces();
        boolean boolean85 = functionType58.hasCachedValues();
        boolean boolean86 = functionType58.isInterface();
        java.lang.Iterable iterable87 = functionType58.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { functionType58 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry1.createConstructorType(jSType36, true, jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType89.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType89.getSlot("?");
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
        org.junit.Assert.assertTrue("'" + resolveMode34 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode34.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
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
        org.junit.Assert.assertNull(jSType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterable87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNull(property92);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0500");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry2.setResolveMode(resolveMode3);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType6 = jSTypeRegistry2.getNativeObjectType(jSTypeNative5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0501");
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
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        jSTypeRegistry34.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), node39);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.hasOneChild();
        boolean boolean48 = node46.isObjectLit();
        com.google.javascript.rhino.InputId inputId49 = com.google.javascript.jscomp.NodeUtil.getInputId(node46);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node46);
        boolean boolean51 = node50.isNE();
        node43.addChildToBack(node50);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry34.createFunctionType(jSType36, node50);
        int int54 = functionType53.getMaxArguments();
        boolean boolean55 = functionType53.isParameterizedType();
        java.lang.String str56 = null; // flaky: functionType53.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = functionType53.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType53.autoboxesTo();
        boolean boolean59 = functionType53.isOrdinaryFunction();
        boolean boolean60 = functionType53.isReturnTypeInferred();
        int int61 = strList3.indexOf((java.lang.Object) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType53.autoboxesTo();
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
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Function" + "'", str56, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(jSType62);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0502");
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
        boolean boolean27 = functionType25.hasDisplayName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.isFor();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType25, node29);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot33 = functionType25.getOwnSlot("Function");
        java.util.Set<java.lang.String> strSet34 = functionType25.getPropertyNames();
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNull(jSTypeStaticSlot33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0503");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        int int2 = jSDocInfo0.getParameterCount();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(markerCollection3);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0504");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0505");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.Node node6 = node3.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship7 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node1, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0506");
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
        boolean boolean33 = node32.isOptionalArg();
        boolean boolean34 = node32.isString();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = node32.getExistingIntProp(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 4");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0507");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(46, nodeArray5);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(47, nodeArray5);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(37, nodeArray5);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(10, nodeArray5, 12, 36);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        node19.setType(43);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        boolean boolean30 = node28.isLabel();
        java.lang.String str31 = node28.toStringTree();
        node28.setVarArgs(false);
        double double34 = node28.getDouble();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(3, node19, node23, node28, 2, 49);
        com.google.javascript.rhino.Node node38 = node37.getParent();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.isOr();
        node41.setLineno(2);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0, node41);
        java.lang.String str46 = node41.toStringTree();
        com.google.javascript.rhino.InputId inputId47 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) 100, node11, node38, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NUMBER -1.0\n" + "'", str31, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "NUMBER -1.0 2\n" + "'", str46, "NUMBER -1.0 2\n");
        org.junit.Assert.assertNull(inputId47);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0508");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        java.lang.String str9 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0509");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.restrictByNotNullOrUndefined();
        boolean boolean25 = jSType24.isNoType();
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0510");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.isOnlyModifiesThisCall();
        boolean boolean11 = node6.isThis();
        java.lang.String str15 = node6.toString(false, true, true);
        boolean boolean16 = node6.isArrayLit();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ERROR" + "'", str15, "ERROR");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0511");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        jSDocInfo0.setDeprecated(true);
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0512");
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
        boolean boolean47 = functionType20.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0513");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        boolean boolean8 = node2.isLocalResultCall();
        int int9 = node2.getSideEffectFlags();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node2.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        java.lang.String str18 = node13.toStringTree();
        boolean boolean19 = node13.isLocalResultCall();
        int int20 = node13.getSideEffectFlags();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node13.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.isOr();
        node24.setLineno(2);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0, node24);
        java.lang.String str29 = node24.toStringTree();
        boolean boolean30 = node24.isLocalResultCall();
        int int31 = node24.getSideEffectFlags();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node24.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.isOr();
        node35.setLineno(2);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0, node35);
        java.lang.String str40 = node35.toStringTree();
        boolean boolean41 = node35.isLocalResultCall();
        int int42 = node35.getSideEffectFlags();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node35.new FileLevelJsDocBuilder();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList44 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilder10, fileLevelJsDocBuilder21, fileLevelJsDocBuilder32, fileLevelJsDocBuilder43);
        fileLevelJsDocBuilder21.append("hi!");
        fileLevelJsDocBuilder21.append("[, hi!]");
        fileLevelJsDocBuilder21.append("hi!");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER -1.0 2\n" + "'", str18, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NUMBER -1.0 2\n" + "'", str29, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NUMBER -1.0 2\n" + "'", str40, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilderList44);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0514");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.setThrows();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0515");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative47 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray48 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative47 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry1.createUnionType(jSTypeNativeArray48);
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
        org.junit.Assert.assertNotNull(jSTypeNativeArray48);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0516");
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
        int int25 = node8.getSourceOffset();
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
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0517");
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList1 = exceptionBuilder0.build();
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder2 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("hi!", throwable4);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("hi!", throwable7);
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder10 = exceptionBuilder2.add((java.lang.Exception) iOException8);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder11 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable13 = null;
        java.io.IOException iOException14 = new java.io.IOException("hi!", throwable13);
        java.lang.Throwable throwable16 = null;
        java.io.IOException iOException17 = new java.io.IOException("hi!", throwable16);
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder19 = exceptionBuilder11.add((java.lang.Exception) iOException17);
        java.lang.Throwable throwable21 = null;
        java.io.IOException iOException22 = new java.io.IOException("hi!", throwable21);
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.lang.Exception[] exceptionArray24 = new java.lang.Exception[] { iOException17, iOException22 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder25 = exceptionBuilder2.add(exceptionArray24);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder26 = exceptionBuilder0.add(exceptionArray24);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder27 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList28 = exceptionBuilder27.build();
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder29 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable31 = null;
        java.io.IOException iOException32 = new java.io.IOException("hi!", throwable31);
        java.lang.Throwable throwable34 = null;
        java.io.IOException iOException35 = new java.io.IOException("hi!", throwable34);
        iOException32.addSuppressed((java.lang.Throwable) iOException35);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder37 = exceptionBuilder29.add((java.lang.Exception) iOException35);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder38 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable40 = null;
        java.io.IOException iOException41 = new java.io.IOException("hi!", throwable40);
        java.lang.Throwable throwable43 = null;
        java.io.IOException iOException44 = new java.io.IOException("hi!", throwable43);
        iOException41.addSuppressed((java.lang.Throwable) iOException44);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder46 = exceptionBuilder38.add((java.lang.Exception) iOException44);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>> exceptionBuilderList47 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder27, (com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder37, (com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder38);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder48 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable50 = null;
        java.io.IOException iOException51 = new java.io.IOException("hi!", throwable50);
        java.lang.Throwable throwable53 = null;
        java.io.IOException iOException54 = new java.io.IOException("hi!", throwable53);
        iOException51.addSuppressed((java.lang.Throwable) iOException54);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder56 = exceptionBuilder48.add((java.lang.Exception) iOException54);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>> exceptionBuilderList57 = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder0, (com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder27, (com.google.common.collect.ImmutableCollection.Builder<java.lang.Exception>) exceptionBuilder56);
        java.io.IOException iOException59 = new java.io.IOException("");
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder60 = exceptionBuilder0.add((java.lang.Exception) iOException59);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder61 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable63 = null;
        java.io.IOException iOException64 = new java.io.IOException("hi!", throwable63);
        java.lang.Throwable throwable66 = null;
        java.io.IOException iOException67 = new java.io.IOException("hi!", throwable66);
        iOException64.addSuppressed((java.lang.Throwable) iOException67);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder69 = exceptionBuilder61.add((java.lang.Exception) iOException67);
        com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList70 = exceptionBuilder61.build();
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder71 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable73 = null;
        java.io.IOException iOException74 = new java.io.IOException("hi!", throwable73);
        java.lang.Throwable throwable76 = null;
        java.io.IOException iOException77 = new java.io.IOException("hi!", throwable76);
        iOException74.addSuppressed((java.lang.Throwable) iOException77);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder79 = exceptionBuilder71.add((java.lang.Exception) iOException77);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder80 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable82 = null;
        java.io.IOException iOException83 = new java.io.IOException("hi!", throwable82);
        java.lang.Throwable throwable85 = null;
        java.io.IOException iOException86 = new java.io.IOException("hi!", throwable85);
        iOException83.addSuppressed((java.lang.Throwable) iOException86);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder88 = exceptionBuilder80.add((java.lang.Exception) iOException86);
        java.lang.Throwable throwable90 = null;
        java.io.IOException iOException91 = new java.io.IOException("hi!", throwable90);
        java.lang.Throwable[] throwableArray92 = iOException91.getSuppressed();
        java.lang.Exception[] exceptionArray93 = new java.lang.Exception[] { iOException86, iOException91 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder94 = exceptionBuilder71.add(exceptionArray93);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList95 = com.google.common.collect.ImmutableList.of((java.lang.Throwable[]) exceptionArray93);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder96 = exceptionBuilder61.add(exceptionArray93);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder97 = exceptionBuilder0.add(exceptionArray93);
        org.junit.Assert.assertNotNull(exceptionBuilder0);
        org.junit.Assert.assertNotNull(exceptionList1);
        org.junit.Assert.assertNotNull(exceptionBuilder2);
        org.junit.Assert.assertNotNull(exceptionBuilder10);
        org.junit.Assert.assertNotNull(exceptionBuilder11);
        org.junit.Assert.assertNotNull(exceptionBuilder19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(exceptionArray24);
        org.junit.Assert.assertNotNull(exceptionBuilder25);
        org.junit.Assert.assertNotNull(exceptionBuilder26);
        org.junit.Assert.assertNotNull(exceptionBuilder27);
        org.junit.Assert.assertNotNull(exceptionList28);
        org.junit.Assert.assertNotNull(exceptionBuilder29);
        org.junit.Assert.assertNotNull(exceptionBuilder37);
        org.junit.Assert.assertNotNull(exceptionBuilder38);
        org.junit.Assert.assertNotNull(exceptionBuilder46);
        org.junit.Assert.assertNotNull(exceptionBuilderList47);
        org.junit.Assert.assertNotNull(exceptionBuilder48);
        org.junit.Assert.assertNotNull(exceptionBuilder56);
        org.junit.Assert.assertNotNull(exceptionBuilderList57);
        org.junit.Assert.assertNotNull(exceptionBuilder60);
        org.junit.Assert.assertNotNull(exceptionBuilder61);
        org.junit.Assert.assertNotNull(exceptionBuilder69);
        org.junit.Assert.assertNotNull(exceptionList70);
        org.junit.Assert.assertNotNull(exceptionBuilder71);
        org.junit.Assert.assertNotNull(exceptionBuilder79);
        org.junit.Assert.assertNotNull(exceptionBuilder80);
        org.junit.Assert.assertNotNull(exceptionBuilder88);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(exceptionArray93);
        org.junit.Assert.assertNotNull(exceptionBuilder94);
        org.junit.Assert.assertNotNull(throwableList95);
        org.junit.Assert.assertNotNull(exceptionBuilder96);
        org.junit.Assert.assertNotNull(exceptionBuilder97);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0518");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("java.io.IOException: ");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        boolean boolean5 = node3.isLabel();
        boolean boolean6 = node3.isAssignAdd();
        int int7 = node3.getChildCount();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec9 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str10 = assertionFunctionSpec9.getFunctionName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        com.google.javascript.rhino.Node node18 = assertionFunctionSpec9.getAssertedParam(node13);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        node13.addSuppression("hi!");
        boolean boolean22 = node13.isTypeOf();
        boolean boolean23 = node13.isBreak();
        com.google.javascript.rhino.Node node24 = node3.srcref(node13);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec26 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
        boolean boolean32 = jSTypeRegistry29.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry29.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec26.getAssertedType(node27, jSTypeRegistry29);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.hasOneChild();
        boolean boolean50 = node48.isObjectLit();
        com.google.javascript.rhino.InputId inputId51 = com.google.javascript.jscomp.NodeUtil.getInputId(node48);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), node48);
        boolean boolean53 = node52.isNE();
        node45.addChildToBack(node52);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry36.createFunctionType(jSType38, node52);
        int int56 = functionType55.getMaxArguments();
        boolean boolean57 = functionType55.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType55.getPropertyType("NUMBER -1.0\n");
        com.google.javascript.rhino.jstype.ObjectType objectType60 = functionType55.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType61 = objectType60.autoboxesTo();
        boolean boolean62 = objectType60.isAllType();
        boolean boolean63 = objectType60.isUnknownType();
        boolean boolean65 = objectType60.hasOwnProperty("?");
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry29.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType60, "ERROR", "Unknown class name", 0, (int) (byte) 0);
        com.google.javascript.rhino.jstype.JSType jSType71 = assertionFunctionSpec1.getAssertedType(node24, jSTypeRegistry29);
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
        boolean boolean94 = functionType92.isParameterizedType();
        java.lang.String str95 = null; // flaky: functionType92.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet96 = functionType92.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable97 = functionType92.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType98 = functionType92.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType99 = jSTypeRegistry29.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType92);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jSType70);
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
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Function" + "'", str95, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet96 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet96.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable97);
        org.junit.Assert.assertNotNull(objectType98);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0519");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("");
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("hi!");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean10 = jSDocInfo0.hasParameter("JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0520");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        java.lang.String str10 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0521");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = functionType97.toAnnotationString();
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
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0522");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = node21.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0523");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("(unknown)");
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0524");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(46);
        sideEffectFlags1.setAllFlags();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0525");
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
        boolean boolean22 = functionType20.isEmptyType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType20.getSuperClassConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0526");
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
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.isOr();
        node42.setLineno(2);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0, node42);
        java.lang.String str47 = node42.toStringTree();
        int int48 = node42.getChildCount();
        boolean boolean49 = node42.isArrayLit();
        node42.removeProp(3);
        boolean boolean52 = node42.isNull();
        boolean boolean53 = node42.isFor();
        com.google.javascript.rhino.Node node54 = node39.useSourceInfoFrom(node42);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.isOr();
        boolean boolean59 = node57.isLabel();
        java.lang.String str60 = node57.toStringTree();
        boolean boolean61 = node57.isDebugger();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection67 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node63);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isAnd();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.hasOneChild();
        boolean boolean75 = node73.isObjectLit();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0, node57, node63, node69, node73, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile79 = node78.getStaticSourceFile();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) -1, node34, node39, node78);
        // The following exception was thrown during execution in test generation
        try {
            node24.addChildrenToBack(node39);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "NUMBER -1.0 2\n" + "'", str47, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NUMBER -1.0\n" + "'", str60, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputId66);
        org.junit.Assert.assertNotNull(nodeCollection67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(staticSourceFile79);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0527");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList2 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "EQ\n");
        org.junit.Assert.assertNotNull(charSequenceList2);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0528");
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
        java.util.Iterator<java.lang.String> strItor14 = strSet6.iterator();
        int int15 = strSet6.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = strSet6.spliterator();
        java.lang.Object[] objArray17 = strSet6.toArray();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0529");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 1, 1);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable8 = jSTypeRegistry5.getTypesWithProperty("JSDocInfo");
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
        boolean boolean31 = functionType29.hasDisplayName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.isFor();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry5.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType29, node33);
        // The following exception was thrown during execution in test generation
        try {
            node3.removeChild(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSTypeIterable8);
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(functionType35);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0530");
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
        boolean boolean44 = functionType20.isInterface();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType45 = functionType20.toMaybeParameterizedType();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(parameterizedType45);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0531");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0532");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0533");
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
        java.lang.String str14 = strItor12.next();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "unknown" + "'", str14, "unknown");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0534");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression71 = jSDocInfo70.getReturnType();
        java.lang.String str72 = jSDocInfo70.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility73 = jSDocInfo70.getVisibility();
        java.lang.String str74 = jSDocInfo70.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo70.getParameterType("");
        int int77 = jSDocInfo70.getExtendedInterfacesCount();
        functionType65.setPropertyJSDocInfo("[, hi!]", jSDocInfo70);
        boolean boolean79 = functionType65.matchesNumberContext();
        boolean boolean80 = functionType65.isObject();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable81 = functionType65.getCtorExtendedInterfaces();
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
        org.junit.Assert.assertNull(jSTypeExpression71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(visibility73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(jSTypeExpression76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable81);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0535");
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
        boolean boolean98 = functionType92.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType99 = functionType92.getTypeOfThis();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0536");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList10.set(35, "hi!");
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
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0537");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        boolean boolean6 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(39, (int) '4', 6, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 39?end-line: 6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0538");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        boolean boolean8 = node2.isCatch();
        boolean boolean9 = node2.isOr();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo10 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0539");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = node26.getChildAtIndex(39);
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSType28);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0540");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile2 = null;
        node1.setStaticSourceFile(staticSourceFile2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean5 = node1.hasMoreThanOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0541");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("NUMBER -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(NUMBER -1.0)" + "'", str1, "(NUMBER -1.0)");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0542");
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
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isNoCompile();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0543");
        java.util.Spliterator<java.lang.String>[] strSpliteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.util.Spliterator<java.lang.String>> strSpliteratorList1 = com.google.common.collect.ImmutableList.copyOf(strSpliteratorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0544");
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
        // The following exception was thrown during execution in test generation
        try {
            node28.setSideEffectFlags(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0545");
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
        com.google.javascript.rhino.Node node37 = node36.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType38 = node37.getJSType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0546");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        boolean boolean7 = node6.isTrue();
        com.google.javascript.rhino.Node node8 = node6.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = node6.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0547");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        java.lang.String str18 = node13.toStringTree();
        int int19 = node13.getChildCount();
        boolean boolean20 = node13.isArrayLit();
        node13.removeProp(3);
        boolean boolean23 = node13.isNull();
        boolean boolean24 = node13.isFor();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        boolean boolean30 = node28.isLabel();
        java.lang.String str31 = node28.toStringTree();
        boolean boolean32 = node28.isDebugger();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection38 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isAnd();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0, node28, node34, node40, node44, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node49.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) -1, node5, node10, node49);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node10);
        java.lang.Appendable appendable53 = null;
        // The following exception was thrown during execution in test generation
        try {
            node10.appendStringTree(appendable53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER -1.0 2\n" + "'", str18, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NUMBER -1.0\n" + "'", str31, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(nodeCollection38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertNotNull(nodeCollection52);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0548");
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
        java.util.ListIterator<java.lang.String> strItor19 = strList3.listIterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = jSDocInfo21.getReturnType();
        java.lang.String str23 = jSDocInfo21.getOriginalCommentString();
        boolean boolean24 = jSDocInfo21.isExterns();
        jSDocInfo21.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet27 = jSDocInfo21.getModifies();
        int int28 = strSet27.size();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        node30.setLineno(2);
        boolean boolean34 = strSet27.contains((java.lang.Object) 2);
        java.util.Iterator<java.lang.String> strItor35 = strSet27.iterator();
        int int36 = strSet27.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strList3.addAll(3, (java.util.Collection<java.lang.String>) strSet27);
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
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNull(jSTypeExpression22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0549");
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(strArrayList0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0550");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean6 = strList3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList9 = strList3.subList(45, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (45) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0551");
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
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean28 = node27.hasOneChild();
        boolean boolean29 = node27.isObjectLit();
        boolean boolean30 = node27.isFunction();
        boolean boolean31 = node27.isSyntheticBlock();
        boolean boolean32 = node27.isCall();
        boolean boolean33 = node27.isInc();
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
        boolean boolean47 = node35.isSwitch();
        boolean boolean48 = node35.isQuotedString();
        boolean boolean49 = node35.isOr();
        com.google.javascript.rhino.Node node50 = node27.copyInformationFrom(node35);
        node27.setIsSyntheticBlock(true);
        boolean boolean53 = node25.isEquivalentToTyped(node27);
        // The following exception was thrown during execution in test generation
        try {
            node27.setSideEffectFlags(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0552");
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
        boolean boolean48 = functionType20.isReturnTypeInferred();
        boolean boolean49 = functionType20.isConstructor();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType70.getExtendedInterfaces();
        boolean boolean73 = functionType70.isPropertyInExterns("unknown");
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = jSDocInfo74.getReturnType();
        java.lang.String str76 = jSDocInfo74.getOriginalCommentString();
        boolean boolean77 = jSDocInfo74.isExterns();
        jSDocInfo74.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList80 = jSDocInfo74.getExtendedInterfaces();
        boolean boolean81 = jSDocInfo74.isNoSideEffects();
        boolean boolean82 = jSDocInfo74.isNoCompile();
        boolean boolean83 = jSDocInfo74.isImplicitCast();
        java.lang.String str84 = jSDocInfo74.getVersion();
        java.util.Set<java.lang.String> strSet85 = jSDocInfo74.getSuppressions();
        functionType70.setJSDocInfo(jSDocInfo74);
        com.google.javascript.rhino.Node node87 = functionType70.getRootNode();
        boolean boolean88 = functionType20.hasEqualCallType(functionType70);
        boolean boolean89 = functionType20.isInterface();
        boolean boolean90 = functionType20.isRegexpType();
        java.lang.String str91 = null; // flaky: functionType20.toAnnotationString();
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
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSTypeExpression75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Function" + "'", str91, "Function");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0553");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = enumType28.isPropertyTypeInferred("");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(enumType28);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0554");
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
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType42.getTypeOfThis();
        java.lang.String str47 = jSType46.getDisplayName();
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
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Unknown" + "'", str47, "Unknown");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0555");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0556");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "java.io.IOException: ");
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
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node20);
        node24.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind27 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node17, node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node35);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        boolean boolean40 = node38.isLabel();
        boolean boolean41 = node38.isAssignAdd();
        boolean boolean42 = node38.isQualifiedName();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(30, node35, node38, 4095, (int) (short) 0);
        boolean boolean46 = node45.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildBefore(node17, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0\n" + "'", str7, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0557");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.hasMoreThanOneChild();
        boolean boolean5 = node2.isReturn();
        boolean boolean6 = node2.isSwitch();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str9 = assertionFunctionSpec8.getFunctionName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.isOr();
        node12.setLineno(2);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0, node12);
        com.google.javascript.rhino.Node node17 = assertionFunctionSpec8.getAssertedParam(node12);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        node12.addSuppression("hi!");
        boolean boolean21 = node12.isTypeOf();
        boolean boolean22 = node12.isBreak();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
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
        boolean boolean47 = functionType45.matchesStringContext();
        boolean boolean49 = functionType45.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.hasOneChild();
        boolean boolean53 = node51.isObjectLit();
        com.google.javascript.rhino.InputId inputId54 = com.google.javascript.jscomp.NodeUtil.getInputId(node51);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection55 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node51);
        int int56 = node51.getLineno();
        boolean boolean57 = node51.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry24.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType45, node51);
        boolean boolean59 = node51.isCase();
        boolean boolean60 = node51.isNull();
        com.google.javascript.rhino.Node node61 = node12.useSourceInfoIfMissingFromForTree(node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node61, 31, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(nodeCollection55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0558");
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
        boolean boolean66 = functionType20.isObject();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType20.findPropertyType("");
        java.lang.String str69 = functionType20.getNormalizedReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(jSType68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0559");
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
        java.util.Iterator<java.lang.String> strItor14 = strSet13.iterator();
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
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0560");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0561");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType20.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo48.getReturnType();
        java.lang.String str50 = jSDocInfo48.getOriginalCommentString();
        boolean boolean51 = jSDocInfo48.isJavaDispatch();
        com.google.javascript.rhino.Node node52 = jSDocInfo48.getAssociatedNode();
        boolean boolean53 = jSDocInfo48.isExpose();
        java.lang.String str54 = jSDocInfo48.getVersion();
        boolean boolean56 = jSDocInfo48.hasDescriptionForParameter("(unknown)");
        functionType20.setJSDocInfo(jSDocInfo48);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo48.getType();
        java.lang.String str60 = jSDocInfo48.getDescriptionForParameter("Not declared as a constructor");
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
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(jSTypeExpression49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0562");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        int int9 = node6.getLength();
        boolean boolean10 = node6.isEmpty();
        boolean boolean11 = node6.isDo();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0563");
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
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
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
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = null;
        node47.setStaticSourceFile(staticSourceFile48);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node47);
        boolean boolean51 = node50.isArrayLit();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship52 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType24, node42, node50);
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
        int int74 = functionType73.getMaxArguments();
        boolean boolean75 = functionType73.isParameterizedType();
        java.lang.String str76 = null; // flaky: functionType73.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet77 = functionType73.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType73.autoboxesTo();
        boolean boolean79 = functionType73.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry1.createConstructorType("[, hi!]", node23, node42, (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType80.getSuperClassConstructor();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope82 = functionType80.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + subclassType24 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType24.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
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
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Function" + "'", str76, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet77 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet77.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertNotNull(jSTypeStaticScope82);
        org.junit.Assert.assertNull(jSType83);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0564");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.InputId inputId5 = node3.getInputId();
        boolean boolean6 = node3.isNot();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 10, node3);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 100, node7, 8, 40);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node17);
        boolean boolean19 = node17.isFor();
        boolean boolean20 = node17.isOptionalArg();
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node17);
        boolean boolean22 = node17.isIn();
        node17.removeProp(46);
        com.google.javascript.rhino.Node node25 = node17.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node10.addChildrenToFront(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0565");
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
        boolean boolean43 = node35.isFor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = node35.getJSDocInfo();
        boolean boolean45 = functionType20.equals((java.lang.Object) jSDocInfo44);
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
        org.junit.Assert.assertNull(jSDocInfo44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0566");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(InputId: Function)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((InputId: Function))" + "'", str1, "((InputId: Function))");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0567");
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
        functionType47.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType47.autoboxesTo();
        boolean boolean72 = functionType47.hasCachedValues();
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
        boolean boolean95 = functionType93.isParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType96 = functionType93.toObjectType();
        boolean boolean97 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType47, (com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean98 = objectType26.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean99 = functionType93.isReturnTypeInferred();
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
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objectType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0568");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.InputId inputId1 = com.google.javascript.jscomp.NodeUtil.getInputId(node0);
        org.junit.Assert.assertNull(inputId1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0569");
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
        java.lang.Appendable appendable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            node8.appendStringTree(appendable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0570");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "null.prototype", 16, 31);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), node8);
        node12.setType(43);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        boolean boolean18 = node16.isObjectLit();
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.isOr();
        boolean boolean23 = node21.isLabel();
        java.lang.String str24 = node21.toStringTree();
        node21.setVarArgs(false);
        double double27 = node21.getDouble();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(3, node12, node16, node21, 2, 49);
        boolean boolean31 = node16.isScript();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        boolean boolean39 = node34.isName();
        boolean boolean40 = node34.isComma();
        int int41 = node34.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildAfter(node16, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node has siblings.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "NUMBER -1.0\n" + "'", str24, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0571");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        node1.setSourceEncodedPositionForTree(2);
        boolean boolean4 = node1.isNoSideEffectsCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node1.getJsDocBuilderForNode();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0572");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        java.lang.String str5 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        java.lang.String str18 = node13.toStringTree();
        int int19 = node13.getChildCount();
        boolean boolean20 = node13.isArrayLit();
        node13.removeProp(3);
        boolean boolean23 = node13.isNull();
        boolean boolean24 = node13.isFor();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFrom(node13);
        boolean boolean26 = node10.isCatch();
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(46, nodeArray30);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(47, nodeArray30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(51, nodeArray30, 51, (int) ' ');
        int int36 = node10.getIndexOfChild(node35);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isAnd();
        boolean boolean41 = node38.isGetElem();
        // The following exception was thrown during execution in test generation
        try {
            node1.replaceChildAfter(node35, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER -1.0 2\n" + "'", str18, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0573");
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
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry29.createParameters(jSTypeArray30);
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
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType52.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType52.getParameterType();
        boolean boolean57 = functionType52.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType52.autoboxesTo();
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
        boolean boolean81 = functionType79.hasImplementedInterfaces();
        java.util.Set<java.lang.String> strSet82 = functionType79.getOwnPropertyNames();
        boolean boolean83 = functionType79.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] { jSType58, functionType79 };
        com.google.javascript.rhino.Node node85 = jSTypeRegistry29.createParameters(jSTypeArray84);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = jSTypeRegistry1.createOptionalParameters(jSTypeArray84);
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
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
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
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jSType58);
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
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(node85);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0574");
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
        boolean boolean50 = functionType20.isEmptyType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType20);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0575");
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
        boolean boolean48 = functionType20.isReturnTypeInferred();
        boolean boolean49 = functionType20.isConstructor();
        com.google.javascript.rhino.Node node51 = functionType20.getPropertyNode("Not declared as a type name");
        boolean boolean52 = functionType20.hasReferenceName();
        boolean boolean53 = functionType20.isTemplateType();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0576");
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
        int int24 = functionType20.getMaxArguments();
        boolean boolean25 = functionType20.isVoidType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType20.getTopMostDefiningType("NUMBER -1.0 2\n");
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
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0577");
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
        boolean boolean81 = objectType78.isTemplateType();
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0578");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        java.lang.Object[] objArray7 = strSet6.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.clearTemplateTypeNames();
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
        boolean boolean35 = jSTypeRegistry9.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType34);
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
        boolean boolean58 = functionType56.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection59 = jSTypeRegistry9.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType56);
        jSTypeRegistry9.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = jSTypeRegistry9.getErrorReporter();
        jSTypeRegistry9.clearTemplateTypeNames();
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
        int int85 = functionType84.getMaxArguments();
        boolean boolean86 = functionType84.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType84.getPropertyType("NUMBER -1.0\n");
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry9.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray90 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry9.createUnionType(jSTypeNativeArray90);
        boolean boolean92 = strSet6.equals((java.lang.Object) jSTypeNativeArray90);
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
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
        org.junit.Assert.assertNotNull(functionTypeCollection59);
        org.junit.Assert.assertNull(errorReporter62);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(jSTypeNativeArray90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0579");
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
        java.lang.String str43 = assertionFunctionSpec5.getFunctionName();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0580");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = functionType46.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType48 = functionType46.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.getParameterType();
        boolean boolean50 = functionType46.isNoObjectType();
        objectType25.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType46);
        boolean boolean52 = objectType25.isUnionType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0581");
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
        boolean boolean98 = functionType92.isNativeObjectType();
        java.lang.String str99 = null; // flaky: functionType92.toString();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "Function" + "'", str99, "Function");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0582");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0583");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0584");
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
            com.google.javascript.rhino.Node node64 = node54.getChildAtIndex(38);
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0585");
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
        boolean boolean95 = functionType23.isCheckedUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0586");
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
        jSTypeRegistry1.resetForTypeCheck();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0587");
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
        boolean boolean49 = functionType20.removeProperty("Function");
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType20.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jSType50);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0588");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("java.io.IOException: ");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.hasOneChild();
        boolean boolean6 = node4.isObjectLit();
        com.google.javascript.rhino.Node node7 = node4.removeFirstChild();
        boolean boolean8 = node4.isAssignAdd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        node4.setStaticSourceFile(staticSourceFile9);
        com.google.javascript.rhino.Node node11 = assertionFunctionSpec2.getAssertedParam(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition13 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition13.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        int int19 = namePosition13.getEndLine();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        com.google.javascript.rhino.InputId inputId26 = com.google.javascript.jscomp.NodeUtil.getInputId(node23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), node23);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node27);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        boolean boolean32 = node30.isLabel();
        boolean boolean33 = node30.isAssignAdd();
        boolean boolean34 = node30.isQualifiedName();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(30, node27, node30, 4095, (int) (short) 0);
        boolean boolean38 = node30.isWith();
        com.google.javascript.rhino.Node node39 = node30.detachFromParent();
        namePosition13.setItem(node30);
        boolean boolean41 = node30.isContinue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(36, node11, node30, (int) (short) 10, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0589");
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
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean42 = node41.hasOneChild();
        boolean boolean43 = node41.isObjectLit();
        com.google.javascript.rhino.InputId inputId44 = com.google.javascript.jscomp.NodeUtil.getInputId(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), node41);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.hasOneChild();
        boolean boolean50 = node48.isObjectLit();
        com.google.javascript.rhino.InputId inputId51 = com.google.javascript.jscomp.NodeUtil.getInputId(node48);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), node48);
        boolean boolean53 = node52.isNE();
        node45.addChildToBack(node52);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry36.createFunctionType(jSType38, node52);
        boolean boolean56 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair57 = functionType32.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType55);
        java.util.Set<java.lang.String> strSet58 = functionType32.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = strList3.removeAll((java.util.Collection<java.lang.String>) strSet58);
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(typePair57);
        org.junit.Assert.assertNotNull(strSet58);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0590");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        boolean boolean8 = node2.isRegExp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0591");
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
        boolean boolean52 = functionType20.matchesStringContext();
        boolean boolean53 = functionType20.isNoObjectType();
        boolean boolean54 = functionType20.isGlobalThisType();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0592");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        java.lang.String str10 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0593");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        com.google.javascript.rhino.Node node5 = node1.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = node5.isContinue();
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0594");
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
        boolean boolean26 = strList3.equals((java.lang.Object) 100L);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet28.union(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet30.intersection(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = booleanLiteralSet35.union(booleanLiteralSet37);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = booleanLiteralSet37.intersection(booleanLiteralSet40);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet34.intersection(booleanLiteralSet40);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = booleanLiteralSet27.union(booleanLiteralSet40);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = booleanLiteralSet44.union(booleanLiteralSet46);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet46.intersection(booleanLiteralSet49);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = booleanLiteralSet51.union(booleanLiteralSet53);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = booleanLiteralSet53.intersection(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = booleanLiteralSet50.intersection(booleanLiteralSet56);
        boolean boolean60 = booleanLiteralSet50.contains(false);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        jSTypeRegistry62.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean68 = node67.hasOneChild();
        boolean boolean69 = node67.isObjectLit();
        com.google.javascript.rhino.InputId inputId70 = com.google.javascript.jscomp.NodeUtil.getInputId(node67);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((-1), node67);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean75 = node74.hasOneChild();
        boolean boolean76 = node74.isObjectLit();
        com.google.javascript.rhino.InputId inputId77 = com.google.javascript.jscomp.NodeUtil.getInputId(node74);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((-1), node74);
        boolean boolean79 = node78.isNE();
        node71.addChildToBack(node78);
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry62.createFunctionType(jSType64, node78);
        int int82 = functionType81.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType81.collapseUnion();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = functionType81.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet[] booleanLiteralSetArray86 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[] { booleanLiteralSet40, booleanLiteralSet50, booleanLiteralSet84, booleanLiteralSet85 };
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.BooleanLiteralSet>> booleanLiteralSetEnumList87 = com.google.common.collect.ImmutableList.copyOf((java.lang.Enum<com.google.javascript.rhino.jstype.BooleanLiteralSet>[]) booleanLiteralSetArray86);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet[] booleanLiteralSetArray88 = strList3.toArray(booleanLiteralSetArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet44 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet44.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(inputId70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(inputId77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(booleanLiteralSetArray86);
        org.junit.Assert.assertNotNull(booleanLiteralSetEnumList87);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0595");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList3.containsAll((java.util.Collection<java.lang.String>) strList11);
        boolean boolean14 = strList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = strList3.reverse();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFunction();
        boolean boolean21 = node17.isSyntheticBlock();
        boolean boolean22 = node17.isCall();
        boolean boolean23 = node17.isInc();
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
        boolean boolean37 = node25.isSwitch();
        boolean boolean38 = node25.isQuotedString();
        boolean boolean39 = node25.isOr();
        com.google.javascript.rhino.Node node40 = node17.copyInformationFrom(node25);
        boolean boolean41 = node25.isIn();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.isOr();
        node44.setLineno(2);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0, node44);
        java.lang.String str49 = node44.toStringTree();
        int int50 = node44.getChildCount();
        boolean boolean51 = node44.isArrayLit();
        node44.removeProp(3);
        boolean boolean54 = node44.isNull();
        int int55 = node44.getCharno();
        int int56 = node25.getIndexOfChild(node44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = strList3.remove((java.lang.Object) node44);
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
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER -1.0\n" + "'", str28, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "NUMBER -1.0 2\n" + "'", str49, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0596");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        boolean boolean8 = node2.isCatch();
        boolean boolean9 = node2.isOr();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            node2.appendStringTree(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0597");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        node1.setVarArgs(false);
        double double7 = node1.getDouble();
        boolean boolean8 = node1.isNE();
        node1.setCharno((-1));
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isObjectLit();
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = null;
        node12.setStaticSourceFile(staticSourceFile16);
        boolean boolean18 = node12.isObjectLit();
        boolean boolean19 = node12.isAssign();
        node1.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12);
        boolean boolean23 = node22.isExprResult();
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
        com.google.javascript.rhino.Node node37 = node22.srcref(node25);
        com.google.javascript.rhino.Node node38 = node12.srcref(node25);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        node46.setType(43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean56 = node55.isOr();
        boolean boolean57 = node55.isLabel();
        java.lang.String str58 = node55.toStringTree();
        node55.setVarArgs(false);
        double double61 = node55.getDouble();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(3, node46, node50, node55, 2, 49);
        java.lang.String str68 = node55.toString(true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            node25.addChildrenToFront(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER -1.0\n" + "'", str28, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NUMBER -1.0\n" + "'", str58, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NUMBER -1.0" + "'", str68, "NUMBER -1.0");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0598");
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
        boolean boolean50 = functionType20.hasCachedValues();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0599");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0600");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("NUMBER -1.0 2\n");
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
    }
}
