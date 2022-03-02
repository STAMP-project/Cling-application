import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1401");
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
        boolean boolean46 = functionType20.isObject();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = functionType20.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType20.getAllExtendedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(jSDocInfo47);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1402");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strList3.add("InputId: Function");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1403");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1404");
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
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType20.dereference();
        boolean boolean30 = functionType20.matchesUint32Context();
        boolean boolean31 = functionType20.isObject();
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
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1405");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.isOr();
        node5.setLineno(2);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, node5);
        com.google.javascript.rhino.Node node10 = assertionFunctionSpec1.getAssertedParam(node5);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        node5.addSuppression("hi!");
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        boolean boolean19 = node16.isAssignAdd();
        boolean boolean20 = node16.isQualifiedName();
        java.lang.String str21 = node16.getSourceFileName();
        boolean boolean22 = node16.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node16);
        int int24 = node5.getIndexOfChild(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isObjectLit();
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node26);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection30 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node34);
        node38.setType(43);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node42);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        boolean boolean49 = node47.isLabel();
        java.lang.String str50 = node47.toStringTree();
        node47.setVarArgs(false);
        double double53 = node47.getDouble();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(3, node38, node42, node47, 2, 49);
        boolean boolean57 = node42.isDefaultCase();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.isOr();
        boolean boolean61 = node59.isLabel();
        boolean boolean62 = node59.isAssignAdd();
        boolean boolean63 = node59.isQualifiedName();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean67 = node66.isOr();
        boolean boolean68 = node66.isLabel();
        java.lang.String str69 = node66.toStringTree();
        boolean boolean70 = node66.isDebugger();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.hasOneChild();
        boolean boolean74 = node72.isObjectLit();
        com.google.javascript.rhino.InputId inputId75 = com.google.javascript.jscomp.NodeUtil.getInputId(node72);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection76 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node72);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isAnd();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean83 = node82.hasOneChild();
        boolean boolean84 = node82.isObjectLit();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0, node66, node72, node78, node82, 12, 0);
        boolean boolean88 = node59.isEquivalentToTyped(node78);
        com.google.javascript.jscomp.CodingConvention.Bind bind89 = new com.google.javascript.jscomp.CodingConvention.Bind(node26, node42, node78);
        boolean boolean90 = node26.isAssign();
        com.google.javascript.rhino.Node node91 = node16.useSourceInfoFromForTree(node26);
        boolean boolean92 = node26.isObjectLit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(nodeCollection30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "NUMBER -1.0\n" + "'", str50, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "NUMBER -1.0\n" + "'", str69, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(nodeCollection76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1406");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Node tree inequality:\nTree1:\nERROR\n    NUMBER -1.0\n\n\nTree2:\nDELPROP  2\n\n\nSubtree1: ERROR\n    NUMBER -1.0\n\n\nSubtree2: DELPROP  2\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1407");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = strList3.asList();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = com.google.common.collect.ImmutableList.copyOf(strArray22);
        int int25 = strList23.lastIndexOf((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.String> strItor26 = strList23.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator27 = strList23.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = strList23.asList();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = com.google.common.collect.ImmutableList.copyOf(strArray31);
        int int34 = strList32.lastIndexOf((java.lang.Object) (short) 100);
        java.util.ListIterator<java.lang.String> strItor36 = strList32.listIterator(1);
        boolean boolean37 = strList23.containsAll((java.util.Collection<java.lang.String>) strList32);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1408");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Node tree inequality:\nTree1:\nERROR 41\n\n\nTree2:\nNUMBER -1.0 2 [input_id: InputId: Function]\n\n\nSubtree1: ERROR 41\n\n\nSubtree2: NUMBER -1.0 2 [input_id: InputId: Function]\n");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1409");
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
        boolean boolean24 = node16.isIf();
        boolean boolean25 = node16.isNoSideEffectsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node16.getJSDocInfo();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSDocInfo26);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1410");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        node6.setType(43);
        node6.setSourceFileForTesting("");
        java.lang.String str11 = node6.toStringTree();
        boolean boolean12 = node6.isTry();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE [source_file: ]\n    NUMBER -1.0\n" + "'", str11, "FALSE [source_file: ]\n    NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1411");
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
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType48.getOwnerFunction();
        boolean boolean67 = functionType48.isNoType();
        boolean boolean68 = functionType48.matchesNumberContext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType48.getInstanceType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Function" + "'", str64, "Function");
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1412");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = jSTypeRegistry1.createAnonymousObjectType();
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
        boolean boolean30 = functionType28.isParameterizedType();
        java.lang.String str31 = null; // flaky: functionType28.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node33 = functionType28.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType28.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType34.getImplicitPrototype();
        boolean boolean36 = functionType34.matchesObjectContext();
        boolean boolean37 = functionType34.isStringValueType();
        boolean boolean38 = jSTypeRegistry1.declareType("(Not declared as a type name)", (com.google.javascript.rhino.jstype.JSType) functionType34);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry40.createParameters(jSTypeArray41);
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
        boolean boolean65 = functionType63.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getParameterType();
        boolean boolean68 = functionType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType63.autoboxesTo();
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
        java.util.Set<java.lang.String> strSet93 = functionType90.getOwnPropertyNames();
        boolean boolean94 = functionType90.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] { jSType69, functionType90 };
        com.google.javascript.rhino.Node node96 = jSTypeRegistry40.createParameters(jSTypeArray95);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry1.createUnionType(jSTypeArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType6);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Function" + "'", str31, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
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
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType69);
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
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1413");
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node1.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder13.append("Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n");
        fileLevelJsDocBuilder13.append("(unknown)");
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1414");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = functionType20.getImplicitPrototype();
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1415");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isLabelName();
        boolean boolean6 = node1.isDebugger();
        boolean boolean7 = node1.isThis();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node1.children();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeIterable8);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1416");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList2 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0);
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (byte) 10, 40, 49, (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1417");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.hasOneChild();
        boolean boolean6 = node4.isObjectLit();
        com.google.javascript.rhino.InputId inputId7 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), node4);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node8);
        boolean boolean10 = node8.isBreak();
        boolean boolean11 = node8.isAssignAdd();
        boolean boolean12 = node8.hasMoreThanOneChild();
        boolean boolean13 = node8.isWith();
        com.google.javascript.rhino.Node node14 = assertionFunctionSpec1.getAssertedParam(node8);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
        java.lang.Object obj17 = node8.getProp(29);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1418");
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
        boolean boolean97 = functionType75.isVoidType();
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1419");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        boolean boolean5 = node1.isInc();
        boolean boolean6 = node1.isInstanceOf();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputId3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1420");
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
        com.google.javascript.rhino.Node node46 = functionType20.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo47 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node46);
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
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1421");
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
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.isOr();
        boolean boolean35 = node33.isLabel();
        java.lang.String str36 = node33.toStringTree();
        boolean boolean37 = node33.isDebugger();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection43 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isAnd();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0, node33, node39, node45, node49, 12, 0);
        boolean boolean55 = node39.isLocalResultCall();
        double double56 = node39.getDouble();
        functionType20.setSource(node39);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType20.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType20.getInstanceType();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER -1.0\n" + "'", str36, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertNotNull(nodeCollection43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(objectType58);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1422");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isCatch();
        com.google.javascript.rhino.Node node4 = node1.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.isAssign();
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1423");
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
        jSTypeRegistry1.identifyNonNullableName("NUMBER -1.0");
        java.lang.String[] strArray32 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean41 = strList38.add("");
        boolean boolean42 = strSet33.remove((java.lang.Object) strList38);
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList38);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1424");
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
        boolean boolean28 = functionType20.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.clearTemplateTypeNames();
        boolean boolean33 = jSTypeRegistry30.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        boolean boolean39 = node35.hasMoreThanOneChild();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.clearTemplateTypeNames();
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
        boolean boolean67 = jSTypeRegistry41.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType66);
        node35.setJSType((com.google.javascript.rhino.jstype.JSType) objectType66);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression70 = jSDocInfo69.getReturnType();
        java.lang.String str71 = jSDocInfo69.getOriginalCommentString();
        boolean boolean72 = jSDocInfo69.isExterns();
        jSDocInfo69.addSuppression("hi!");
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        java.lang.String str79 = com.google.javascript.jscomp.NodeUtil.getSourceName(node76);
        jSDocInfo69.setAssociatedNode(node76);
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry30.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType66, node76);
        boolean boolean83 = objectType66.removeProperty("java.io.IOException: ");
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType20.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) objectType66);
        boolean boolean85 = functionType20.isCheckedUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType20.getTopMostDefiningType("(EQ\n)");
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
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
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
        org.junit.Assert.assertNull(jSTypeExpression70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1425");
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
        boolean boolean18 = node10.isWith();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isAnd();
        node20.setLength(50);
        node20.addSuppression("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.Node node27 = node10.copyInformationFrom(node20);
        boolean boolean28 = node20.isNumber();
        boolean boolean29 = node20.isContinue();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1426");
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
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList50 = functionType20.getSubTypes();
        boolean boolean52 = functionType20.hasOwnProperty("(EQ\n)");
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
        org.junit.Assert.assertNull(functionTypeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1427");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        boolean boolean12 = strList3.isEmpty();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.clearTemplateTypeNames();
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
        boolean boolean45 = jSTypeRegistry19.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType44);
        boolean boolean47 = objectType44.isPropertyInExterns("Function");
        boolean boolean48 = strList17.contains((java.lang.Object) boolean47);
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = jSDocInfo49.getReturnType();
        java.lang.String str51 = jSDocInfo49.getOriginalCommentString();
        boolean boolean52 = jSDocInfo49.isExterns();
        jSDocInfo49.addSuppression("");
        java.lang.String str56 = jSDocInfo49.getDescriptionForParameter("hi!");
        com.google.common.collect.ImmutableList<java.lang.String> strList57 = jSDocInfo49.getTemplateTypeNames();
        int int58 = strList57.size();
        boolean boolean59 = strList57.isEmpty();
        boolean boolean60 = strList17.containsAll((java.util.Collection<java.lang.String>) strList57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = strList3.addAll(1, (java.util.Collection<java.lang.String>) strList57);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strList17);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSTypeExpression50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1428");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.isHidden();
        java.lang.String str9 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1429");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        boolean boolean11 = jSDocInfo0.hasParameter("(JSDocInfo)");
        boolean boolean12 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1430");
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
        boolean boolean26 = functionType20.isString();
        boolean boolean27 = functionType20.isInstanceType();
        boolean boolean28 = functionType20.isParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType20);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectType29);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1431");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean6 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.clearTemplateTypeNames();
        boolean boolean11 = jSTypeRegistry8.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry8.clearNamedTypes();
        jSTypeRegistry8.forwardDeclareType("(unknown)");
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
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType36.collapseUnion();
        boolean boolean39 = jSTypeRegistry8.declareType("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n", jSType38);
        jSTypeRegistry8.clearNamedTypes();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.isOr();
        boolean boolean45 = node43.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType46 = node43.getJSType();
        boolean boolean47 = node43.isAssignAdd();
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
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType68.collapseUnion();
        boolean boolean71 = functionType68.hasAnyTemplateInternal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = functionType68.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry8.createObjectType("(InputId: Function)", node43, (com.google.javascript.rhino.jstype.ObjectType) functionType68);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray75 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry8.createUnionType(jSTypeNativeArray75);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry1.createUnionType(jSTypeNativeArray75);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSType46);
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
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(jSDocInfo72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(jSTypeNativeArray75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(jSType77);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1432");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        node1.setVarArgs(false);
        double double7 = node1.getDouble();
        boolean boolean8 = node1.isNE();
        node1.setCharno((-1));
        boolean boolean11 = node1.isTry();
        boolean boolean12 = node1.isScript();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(2);
        node15.setLineno(53);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node13, node15);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1433");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 100, 48, 50);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1434");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node6.isTry();
        boolean boolean8 = node6.isSetterDef();
        boolean boolean9 = node6.isLocalResultCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1435");
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
        boolean boolean36 = functionType35.isEmptyType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getExtendedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1436");
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
        boolean boolean54 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        boolean boolean56 = jSTypeRegistry1.hasNamespace("NUMBER -1.0\n");
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo58.getReturnType();
        java.lang.String str60 = jSDocInfo58.getOriginalCommentString();
        boolean boolean61 = jSDocInfo58.isExterns();
        jSDocInfo58.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList64 = jSDocInfo58.getExtendedInterfaces();
        boolean boolean65 = jSDocInfo58.isNoSideEffects();
        boolean boolean66 = jSDocInfo58.isNoCompile();
        boolean boolean67 = jSDocInfo58.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = jSDocInfo58.getBaseType();
        boolean boolean69 = jSDocInfo58.hasFileOverview();
        boolean boolean70 = jSDocInfo58.containsDeclaration();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.hasOneChild();
        boolean boolean74 = node72.isObjectLit();
        com.google.javascript.rhino.InputId inputId75 = com.google.javascript.jscomp.NodeUtil.getInputId(node72);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection76 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node72);
        int int77 = node72.getLineno();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean80 = node79.isOr();
        node79.setLineno(2);
        com.google.javascript.rhino.Node node83 = node72.useSourceInfoFromForTree(node79);
        jSDocInfo58.setAssociatedNode(node79);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry1.createInterfaceType("(Not declared as a type name)", node79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSTypeExpression59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSTypeExpression68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(nodeCollection76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1437");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("NUMBER -1.0 2\n", (java.lang.Throwable) iOException3);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1438");
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
            node4.setString("(EQ\n)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EXPR_RESULT is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1439");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(16, "Unknown class name");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder3 = node2.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1440");
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
        boolean boolean70 = functionType65.isRegexpType();
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1441");
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
        boolean boolean23 = functionType20.isVoidType();
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
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1442");
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
        boolean boolean14 = node1.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
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
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1443");
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
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType44.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType44.getOwnPropertyJSDocInfo("InputId: Function");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair50 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType20, (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        jSTypeRegistry52.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), node57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean65 = node64.hasOneChild();
        boolean boolean66 = node64.isObjectLit();
        com.google.javascript.rhino.InputId inputId67 = com.google.javascript.jscomp.NodeUtil.getInputId(node64);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), node64);
        boolean boolean69 = node68.isNE();
        node61.addChildToBack(node68);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry52.createFunctionType(jSType54, node68);
        int int72 = functionType71.getMaxArguments();
        boolean boolean73 = functionType71.isParameterizedType();
        java.lang.String str74 = null; // flaky: functionType71.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = functionType71.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType71.getAllExtendedInterfaces();
        boolean boolean77 = functionType71.isNoType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = functionType71.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node79 = functionType71.getRootNode();
        functionType20.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType71);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType20.getTypeOfThis();
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
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Function" + "'", str74, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(jSType81);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1444");
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
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node51 = node47.getChildAtIndex(0);
        boolean boolean52 = node51.isReturn();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1445");
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
        com.google.javascript.rhino.Node node25 = node18.removeChildren();
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1446");
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
        jSTypeRegistry1.clearTemplateTypeNames();
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
        int int77 = functionType76.getMaxArguments();
        boolean boolean78 = functionType76.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType76.getPropertyType("NUMBER -1.0\n");
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean83 = functionType76.isPropertyTypeInferred("unknown");
        boolean boolean85 = functionType76.isPropertyTypeDeclared("NUMBER -1.0 2\n");
        com.google.javascript.rhino.jstype.FunctionType functionType86 = functionType76.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType86.getPrototype();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(functionType86);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1447");
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
        boolean boolean12 = node7.isNE();
        boolean boolean13 = node7.isWhile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node7.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1448");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node28 = functionType20.getRootNode();
        boolean boolean29 = functionType20.isEnumType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType20.getCtorImplementedInterfaces();
        int int31 = functionType20.getExtendedInterfacesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType20.getOwnImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1449");
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
        boolean boolean54 = functionType46.isPropertyTypeDeclared("unknown");
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1450");
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
        com.google.javascript.rhino.Node node25 = objectType22.getPropertyNode("hi!");
        boolean boolean26 = objectType22.isUnknownType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = objectType22.getJSDocInfo();
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(jSDocInfo27);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1451");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        int int8 = typePosition0.getStartLine();
        int int9 = typePosition0.getPositionOnStartLine();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1452");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1453");
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
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec18 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str19 = assertionFunctionSpec18.getFunctionName();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.isOr();
        node22.setLineno(2);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0, node22);
        com.google.javascript.rhino.Node node27 = assertionFunctionSpec18.getAssertedParam(node22);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node22);
        node22.addSuppression("hi!");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node22);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node> nodeList32 = com.google.common.collect.ImmutableList.of(node1, node22);
        boolean boolean33 = node22.isFunction();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1454");
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
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor21 = strList17.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor21.remove();
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
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1455");
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
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList46 = functionType42.getSubTypes();
        boolean boolean47 = functionType42.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType42.getOwnerFunction();
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
        org.junit.Assert.assertNull(functionTypeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(functionType48);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1456");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType73.cloneWithoutArrowType();
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
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1457");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "null.prototype", 16, 31);
        boolean boolean5 = node4.isIn();
        int int6 = node4.getLineno();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1458");
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
        java.util.Set<java.lang.String> strSet46 = functionType20.getOwnPropertyNames();
        boolean boolean47 = functionType20.isReturnTypeInferred();
        java.lang.Iterable iterable48 = functionType20.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterable48);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1459");
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
        com.google.javascript.rhino.jstype.JSType jSType53 = node47.getJSType();
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
        org.junit.Assert.assertNull(jSType53);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1460");
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
        java.lang.String[] strArray26 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        boolean boolean35 = strList32.add("");
        boolean boolean36 = strSet27.remove((java.lang.Object) strList32);
        java.lang.String[] strArray39 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean48 = strList45.add("");
        boolean boolean49 = strSet40.remove((java.lang.Object) strList45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue50.not();
        java.lang.String str52 = ternaryValue50.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue50.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue54.not();
        java.lang.String str56 = ternaryValue54.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue54.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue53.and(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue53.not();
        boolean boolean60 = strSet40.remove((java.lang.Object) ternaryValue59);
        java.lang.Object[] objArray61 = strSet40.toArray();
        java.lang.Object obj62 = null;
        boolean boolean63 = strSet40.equals(obj62);
        java.util.HashSet[] hashSetArray65 = new java.util.HashSet[3];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray66 = (java.util.HashSet<java.lang.String>[]) hashSetArray65;
        strSetArray66[0] = strSet3;
        strSetArray66[1] = strSet27;
        strSetArray66[2] = strSet40;
        com.google.common.collect.ImmutableList<java.util.HashSet<java.lang.String>> strSetList73 = com.google.common.collect.ImmutableList.of(strSetArray66);
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "unknown" + "'", str52, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "unknown" + "'", str56, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[unknown]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[unknown]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(hashSetArray65);
        org.junit.Assert.assertNotNull(strSetArray66);
        org.junit.Assert.assertNotNull(strSetList73);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1461");
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
        boolean boolean37 = jSDocInfo24.hasThisType();
        java.util.Set<java.lang.String> strSet38 = jSDocInfo24.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo24.getThisType();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(jSTypeExpression39);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1462");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor4 = strList3.listIterator();
        java.util.stream.Stream<java.lang.String> strStream5 = strList3.stream();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = com.google.common.collect.ImmutableList.copyOf(strArray8);
        int int11 = strList9.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean13 = strList9.equals((java.lang.Object) 8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strList9.containsAll((java.util.Collection<java.lang.String>) strList17);
        int int21 = strList9.indexOf((java.lang.Object) 4095);
        java.lang.Object[] objArray22 = strList9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strList3.retainAll((java.util.Collection<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, hi!]");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1463");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        int int8 = node2.getChildCount();
        boolean boolean9 = node2.isArrayLit();
        node2.removeProp(3);
        boolean boolean12 = node2.isTrue();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node2.children();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER -1.0 2\n" + "'", str7, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable13);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1464");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
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
        functionType22.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType43);
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType22.autoboxesTo();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = objectType69.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node72 = objectType69.getPropertyNode("hi!");
        boolean boolean73 = functionType22.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType69);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = objectType69.testForEquality(jSType74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = ternaryValue76.and(ternaryValue77);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = ternaryValue75.and(ternaryValue78);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = ternaryValue80.not();
        java.lang.String str82 = ternaryValue80.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = ternaryValue84.not();
        java.lang.String str86 = ternaryValue84.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = ternaryValue84.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue88 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = ternaryValue88.not();
        java.lang.String str90 = ternaryValue88.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = ternaryValue88.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = ternaryValue87.and(ternaryValue91);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue93 = ternaryValue83.or(ternaryValue87);
        java.lang.String str94 = ternaryValue87.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = ternaryValue80.and(ternaryValue87);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = ternaryValue78.and(ternaryValue80);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = ternaryValue1.xor(ternaryValue78);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
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
        org.junit.Assert.assertNull(jSType46);
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
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(ternaryValue80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "unknown" + "'", str82, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "unknown" + "'", str86, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue87);
        org.junit.Assert.assertNotNull(ternaryValue88);
        org.junit.Assert.assertNotNull(ternaryValue89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "unknown" + "'", str90, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue91);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertNotNull(ternaryValue93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "unknown" + "'", str94, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue95);
        org.junit.Assert.assertNotNull(ternaryValue96);
        org.junit.Assert.assertNotNull(ternaryValue97);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1465");
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
        boolean boolean36 = functionType35.hasReferenceName();
        com.google.javascript.rhino.Node node38 = functionType35.getPropertyNode("NUMBER -1.0");
        com.google.javascript.rhino.jstype.ObjectType objectType39 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean40 = objectType39.isInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1466");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        java.util.Iterator<java.lang.String> strItor8 = strList3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = strList3.subList(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (100) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1467");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility91 = jSDocInfo82.getVisibility();
        boolean boolean93 = jSDocInfo82.hasParameterType("null.prototype");
        boolean boolean94 = jSDocInfo82.isExport();
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
        org.junit.Assert.assertNull(visibility91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1468");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable55 = node43.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor56 = ancestorIterable55.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor57 = ancestorIterable55.iterator();
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
        org.junit.Assert.assertNotNull(ancestorIterable55);
        org.junit.Assert.assertNotNull(nodeItor56);
        org.junit.Assert.assertNotNull(nodeItor57);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1469");
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node19.new FileLevelJsDocBuilder();
        boolean boolean22 = node19.isHook();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1470");
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
        java.lang.String str32 = node1.getSourceFileName();
        boolean boolean33 = node1.isDefaultCase();
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1471");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String str8 = strList3.toString();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor9 = strList3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = strList3.subList(15, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (15) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1472");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.isOr();
        boolean boolean36 = node34.isLabel();
        java.lang.String str37 = node34.toStringTree();
        boolean boolean38 = node34.isDebugger();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean44 = node43.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind45 = new com.google.javascript.jscomp.CodingConvention.Bind(node34, node40, node43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node50);
        node54.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind57 = new com.google.javascript.jscomp.CodingConvention.Bind(node43, node47, node54);
        node54.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node54.children();
        boolean boolean61 = node54.isBreak();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = new com.google.javascript.rhino.JSTypeExpression(node54, "");
        com.google.javascript.rhino.Node node64 = jSTypeExpression63.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression63);
        com.google.javascript.rhino.Node node66 = jSTypeExpression63.getRoot();
        com.google.javascript.rhino.JSTypeExpression[] jSTypeExpressionArray67 = new com.google.javascript.rhino.JSTypeExpression[] { jSTypeExpression32, jSTypeExpression63 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList68 = com.google.common.collect.ImmutableList.copyOf(jSTypeExpressionArray67);
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
        org.junit.Assert.assertNotNull(jSTypeExpression32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "NUMBER -1.0\n" + "'", str37, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(jSTypeExpression65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(jSTypeExpressionArray67);
        org.junit.Assert.assertNotNull(jSTypeExpressionList68);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1473");
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
        boolean boolean23 = objectType22.isNoObjectType();
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
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType44.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.getParameterType();
        boolean boolean48 = functionType44.isNoObjectType();
        boolean boolean50 = functionType44.hasProperty("(InputId: Function)");
        com.google.javascript.rhino.jstype.JSType jSType51 = objectType22.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType44);
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
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSType51);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1474");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 53, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1475");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet1.union(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = booleanLiteralSet3.intersection(booleanLiteralSet6);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = booleanLiteralSet8.union(booleanLiteralSet10);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = booleanLiteralSet10.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet7.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet0.union(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet18.union(booleanLiteralSet20);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet20.intersection(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet25.union(booleanLiteralSet27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet27.intersection(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet24.intersection(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = booleanLiteralSet17.intersection(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = booleanLiteralSet36.union(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet38.intersection(booleanLiteralSet41);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = booleanLiteralSet43.union(booleanLiteralSet45);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet48 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = booleanLiteralSet45.intersection(booleanLiteralSet48);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet42.intersection(booleanLiteralSet48);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = booleanLiteralSet35.union(booleanLiteralSet48);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList52 = com.google.common.collect.ImmutableList.of(booleanLiteralSet0, booleanLiteralSet30, booleanLiteralSet34, booleanLiteralSet35);
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType73.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType79 = functionType73.getParentScope();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet80 = functionType73.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = booleanLiteralSet0.union(booleanLiteralSet80);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet48 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet48.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(booleanLiteralSetList52);
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
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet80 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet80.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1476");
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
        java.util.Iterator<java.lang.String> strItor31 = strList30.iterator();
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
        org.junit.Assert.assertNotNull(strItor31);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1477");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        node1.setSourceEncodedPositionForTree(2);
        boolean boolean4 = node1.isUnscopedQualifiedName();
        int int5 = node1.getType();
        boolean boolean6 = node1.wasEmptyNode();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 39 + "'", int5 == 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1478");
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
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean34 = node33.isOr();
        boolean boolean35 = node33.isLabel();
        java.lang.String str36 = node33.toStringTree();
        boolean boolean37 = node33.isDebugger();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.hasOneChild();
        boolean boolean41 = node39.isObjectLit();
        com.google.javascript.rhino.InputId inputId42 = com.google.javascript.jscomp.NodeUtil.getInputId(node39);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection43 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean46 = node45.hasOneChild();
        boolean boolean47 = node45.isAnd();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0, node33, node39, node45, node49, 12, 0);
        com.google.javascript.rhino.Node node55 = node39.cloneNode();
        com.google.javascript.rhino.Node node56 = node24.useSourceInfoFrom(node55);
        boolean boolean57 = node56.isArrayLit();
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER -1.0\n" + "'", str36, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertNotNull(nodeCollection43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1479");
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
        boolean boolean26 = functionType20.isString();
        boolean boolean27 = functionType20.isInstanceType();
        boolean boolean28 = functionType20.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        boolean boolean47 = node46.isNE();
        node39.addChildToBack(node46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry30.createFunctionType(jSType32, node46);
        int int50 = functionType49.getMaxArguments();
        boolean boolean51 = functionType49.isParameterizedType();
        java.lang.String str52 = null; // flaky: functionType49.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = functionType49.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType49.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType49.getTypeOfThis();
        functionType20.setPrototypeBasedOn(objectType55);
        boolean boolean57 = objectType55.isEmptyType();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Function" + "'", str52, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1480");
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
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType42.getParentScope();
        boolean boolean49 = functionType42.isPropertyTypeInferred("unknown");
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType42.findPropertyType("hi!");
        java.util.Set<java.lang.String> strSet52 = functionType42.getOwnPropertyNames();
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
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1481");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasDescriptionForParameter("NUMBER -1.0 2\n");
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1482");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        node1.setVarArgs(false);
        double double7 = node1.getDouble();
        boolean boolean8 = node1.isNE();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        boolean boolean14 = node10.isAssignAdd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = null;
        node10.setStaticSourceFile(staticSourceFile15);
        boolean boolean17 = node10.isString();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative19 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec20 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative19);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative22 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec23 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative22);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative25 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec26 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative25);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec28 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str29 = assertionFunctionSpec28.getFunctionName();
        java.lang.String str30 = assertionFunctionSpec28.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str33 = assertionFunctionSpec32.getFunctionName();
        java.lang.String str34 = assertionFunctionSpec32.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec36 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec38 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec40 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str41 = assertionFunctionSpec40.getFunctionName();
        java.lang.String str42 = assertionFunctionSpec40.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec44 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str45 = assertionFunctionSpec44.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec47 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str48 = assertionFunctionSpec47.getFunctionName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec50 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str51 = assertionFunctionSpec50.getFunctionName();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.isOr();
        node54.setLineno(2);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0, node54);
        com.google.javascript.rhino.Node node59 = assertionFunctionSpec50.getAssertedParam(node54);
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecList60 = com.google.common.collect.ImmutableList.of(assertionFunctionSpec20, assertionFunctionSpec23, assertionFunctionSpec26, assertionFunctionSpec28, assertionFunctionSpec32, assertionFunctionSpec36, assertionFunctionSpec38, assertionFunctionSpec40, assertionFunctionSpec44, assertionFunctionSpec47, assertionFunctionSpec50);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 100, 45, 41);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        jSTypeRegistry66.clearTemplateTypeNames();
        boolean boolean69 = jSTypeRegistry66.isForwardDeclaredType("JSDocInfo");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable71 = jSTypeRegistry66.getTypesWithProperty("Function");
        com.google.javascript.rhino.jstype.JSType jSType72 = assertionFunctionSpec28.getAssertedType(node64, jSTypeRegistry66);
        boolean boolean73 = node64.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node10, node64);
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
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(assertionFunctionSpecList60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable71);
        org.junit.Assert.assertNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1483");
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
        boolean boolean36 = functionType28.isFunctionPrototypeType();
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
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1484");
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
        java.util.Set<java.lang.String> strSet13 = node1.getDirectives();
        boolean boolean14 = node1.isString();
        node1.setSourceFileForTesting("null.prototype");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        boolean boolean36 = node35.isNE();
        node28.addChildToBack(node35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry19.createFunctionType(jSType21, node35);
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
        jSTypeRegistry19.registerPropertyOnType("NUMBER -1.0\n", (com.google.javascript.rhino.jstype.JSType) functionType60);
        boolean boolean64 = functionType60.isArrayType();
        functionType60.clearCachedValues();
        node1.putProp(31, (java.lang.Object) functionType60);
        boolean boolean67 = functionType60.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NUMBER -1.0\n" + "'", str4, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(functionType38);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1485");
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = com.google.common.collect.ImmutableList.of("", "NUMBER -1.0\n", "", "unknown", "hi!", "unknown", "NUMBER -1.0\n", "", "JSDocInfo", "NUMBER -1.0\n");
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
        boolean boolean39 = node32.isBreak();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = new com.google.javascript.rhino.JSTypeExpression(node32, "");
        com.google.javascript.rhino.Node node42 = jSTypeExpression41.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression41);
        com.google.javascript.rhino.Node node44 = jSTypeExpression41.getRoot();
        boolean boolean45 = strList10.equals((java.lang.Object) node44);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor46 = strList10.iterator();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = null;
        node48.setStaticSourceFile(staticSourceFile49);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        boolean boolean52 = node51.isArrayLit();
        boolean boolean53 = node51.isDelProp();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), node57);
        java.lang.String str62 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node61);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean65 = node64.isOr();
        boolean boolean66 = node64.isLabel();
        boolean boolean67 = node64.isAssignAdd();
        boolean boolean68 = node64.isQualifiedName();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(30, node61, node64, 4095, (int) (short) 0);
        boolean boolean72 = node64.isWith();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean75 = node74.hasOneChild();
        boolean boolean76 = node74.isAnd();
        node74.setLength(50);
        node74.addSuppression("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.Node node81 = node64.copyInformationFrom(node74);
        com.google.javascript.rhino.Node node82 = node51.useSourceInfoIfMissingFromForTree(node81);
        int int83 = strList10.lastIndexOf((java.lang.Object) node81);
        boolean boolean84 = node81.wasEmptyNode();
        org.junit.Assert.assertNotNull(strList10);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeExpression43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1486");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = functionType87.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType87.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType87.getOwnerFunction();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = functionType61.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType87);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable92 = functionType61.getCtorExtendedInterfaces();
        java.lang.Iterable iterable93 = functionType61.getCtorExtendedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = functionType61.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(objectTypeIterable88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNull(functionType90);
        org.junit.Assert.assertNotNull(ternaryValue91);
        org.junit.Assert.assertNotNull(objectTypeIterable92);
        org.junit.Assert.assertNotNull(iterable93);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1487");
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
        boolean boolean18 = node10.isFor();
        boolean boolean19 = node10.isCall();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1488");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        node4.setVarArgs(false);
        boolean boolean7 = node4.isCatch();
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
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), node25);
        node29.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind32 = new com.google.javascript.jscomp.CodingConvention.Bind(node18, node22, node29);
        node29.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node29.children();
        boolean boolean36 = node29.isBreak();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node29, "");
        boolean boolean39 = node4.isEquivalentTo(node29);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node46);
        java.util.Set<java.lang.String> strSet48 = node46.getDirectives();
        com.google.javascript.rhino.Node node49 = node46.cloneNode();
        com.google.javascript.rhino.Node node50 = node4.srcrefTree(node46);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node46.siblings();
        org.junit.Assert.assertNotNull(node4);
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(strSet48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1489");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        java.util.Set<java.lang.String> strSet8 = node6.getDirectives();
        com.google.javascript.rhino.Node node9 = node6.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node6.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = node6.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(staticSourceFile10);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1490");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        node3.setLineno(2);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0, node3);
        java.lang.String str8 = node3.toStringTree();
        boolean boolean9 = node3.isLocalResultCall();
        int int10 = node3.getSideEffectFlags();
        boolean boolean11 = node3.isArrayLit();
        node3.addSuppression("null.prototype");
        double double14 = node3.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, node3, 38, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NUMBER -1.0 2\n" + "'", str8, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1491");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList80 = functionType65.getTemplateTypeNames();
        java.lang.String str81 = strList80.toString();
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
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[]" + "'", str81, "[]");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1492");
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
        java.lang.Object obj33 = null;
        int int34 = strList3.indexOf(obj33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = strList3.add("(unknown)");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1493");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.clearSideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int7 = sideEffectFlags0.valueOf();
        sideEffectFlags0.clearSideEffectFlags();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1494");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = new com.google.javascript.rhino.JSTypeExpression(node2, "(Named type with empty name component)");
        boolean boolean36 = jSTypeExpression35.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1495");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        boolean boolean8 = node6.isBreak();
        boolean boolean9 = node6.isAssignAdd();
        boolean boolean10 = node6.hasMoreThanOneChild();
        boolean boolean11 = node6.isWith();
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node6.children();
        boolean boolean14 = node6.isComma();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1496");
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
        boolean boolean46 = functionType20.isNativeObjectType();
        boolean boolean47 = functionType20.isRegexpType();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1497");
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
        boolean boolean67 = node36.isDefaultCase();
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1498");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope76 = functionType74.getParentScope();
        boolean boolean77 = functionType74.hasAnyTemplate();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.getReturnType();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean81 = node80.isOr();
        boolean boolean82 = node80.isLabel();
        java.lang.String str83 = node80.toStringTree();
        boolean boolean84 = node80.isDebugger();
        boolean boolean85 = node80.isQualifiedName();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry1.createFunctionType(jSType78, node80);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression88 = new com.google.javascript.rhino.JSTypeExpression(node80, "Node tree inequality:\nTree1:\nERROR 41\n\n\nTree2:\nNUMBER -1.0 2 [input_id: InputId: Function]\n\n\nSubtree1: ERROR 41\n\n\nSubtree2: NUMBER -1.0 2 [input_id: InputId: Function]\n");
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "NUMBER -1.0\n" + "'", str83, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(functionType86);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1499");
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
            boolean boolean46 = strList28.add("(NUMBER -1.0)");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1500");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getEndLine();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType26.getExtendedInterfaces();
        boolean boolean28 = functionType26.matchesStringContext();
        boolean boolean30 = functionType26.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection36 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node32);
        int int37 = node32.getLineno();
        boolean boolean38 = node32.isHook();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry5.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType26, node32);
        boolean boolean40 = node32.isCase();
        typePosition0.setItem(node32);
        node32.putBooleanProp((int) '4', false);
        boolean boolean45 = node32.isVoid();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(nodeCollection36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1501");
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
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType20.unboxesTo();
        boolean boolean47 = functionType20.isConstructor();
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
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1502");
        java.lang.String[] strArray5 = new java.lang.String[] { "Function", "Function", "NUMBER -1.0", "java.io.IOException: ", "Not declared as a type name" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.Object obj8 = null;
        int int9 = strList6.lastIndexOf(obj8);
        java.util.Iterator<java.lang.String> strItor10 = strList6.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
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
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry12.createFunctionType(jSType14, node28);
        int int32 = functionType31.getMaxArguments();
        boolean boolean33 = functionType31.hasImplementedInterfaces();
        java.util.Set<java.lang.String> strSet34 = functionType31.getOwnPropertyNames();
        boolean boolean35 = strList6.containsAll((java.util.Collection<java.lang.String>) strSet34);
        java.lang.Class<?>[] wildcardClassArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray37 = strList6.toArray(wildcardClassArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1503");
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
        boolean boolean22 = node21.isTypeOf();
        boolean boolean23 = node21.isDelProp();
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1504");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = functionType65.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot71 = functionType65.getSlot("Not declared as a constructor");
        functionType65.clearResolved();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean76 = jSDocInfo74.hasDescriptionForParameter("NUMBER -1.0 2\n");
        java.util.Set<java.lang.String> strSet77 = jSDocInfo74.getParameterNames();
        boolean boolean79 = jSDocInfo74.hasParameterType("Function");
        java.lang.String str80 = jSDocInfo74.getSourceName();
        functionType65.setPropertyJSDocInfo("EQ\n", jSDocInfo74);
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = functionType65.getOwnPropertyJSDocInfo("(JSDocInfo)");
        boolean boolean84 = functionType65.isUnionType();
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
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertNull(jSTypeStaticSlot71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(jSDocInfo83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1505");
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
        boolean boolean80 = jSDocInfo70.hasEnumParameterType();
        java.lang.String str81 = jSDocInfo70.getDescription();
        java.util.Set<java.lang.String> strSet82 = jSDocInfo70.getModifies();
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(strSet82);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1506");
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
        boolean boolean31 = functionType20.isString();
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1507");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor8 = strList3.iterator();
        java.lang.String[] strArray14 = new java.lang.String[] { "unknown", "NUMBER -1.0\n", "unknown", "JSDocInfo", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = jSDocInfo17.getReturnType();
        java.lang.String str19 = jSDocInfo17.getOriginalCommentString();
        boolean boolean20 = jSDocInfo17.isExterns();
        jSDocInfo17.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList23 = jSDocInfo17.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo17.getType();
        boolean boolean25 = strList15.contains((java.lang.Object) jSDocInfo17);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType50.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getPrototype();
        boolean boolean53 = jSTypeRegistry27.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType52);
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
        int int75 = functionType74.getMaxArguments();
        boolean boolean76 = functionType74.hasDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection77 = jSTypeRegistry27.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType74);
        jSTypeRegistry27.setLastGeneration(false);
        boolean boolean81 = jSTypeRegistry27.hasNamespace("EQ\n");
        java.lang.String[] strArray84 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList85 = com.google.common.collect.ImmutableList.copyOf(strArray84);
        java.util.Iterator<java.lang.String> strItor86 = strList85.iterator();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList90 = com.google.common.collect.ImmutableList.copyOf(strArray89);
        int int92 = strList90.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean93 = strList85.contains((java.lang.Object) int92);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor94 = strList85.listIterator();
        jSTypeRegistry27.setTemplateTypeNames((java.util.List<java.lang.String>) strList85);
        boolean boolean96 = strList15.retainAll((java.util.Collection<java.lang.String>) strList85);
        java.util.ListIterator<java.lang.String> strItor97 = strList85.listIterator();
        java.util.Iterator<java.lang.String> strItor98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.util.Iterator<java.lang.String>> strItorList99 = com.google.common.collect.ImmutableList.of((java.util.Iterator<java.lang.String>) strItor8, (java.util.Iterator<java.lang.String>) strItor97, strItor98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 2");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jSTypeExpression18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList23);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strItor86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(strItor94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(strItor97);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1508");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        node2.setStaticSourceFile(staticSourceFile6);
        boolean boolean8 = node2.isObjectLit();
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
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.getIndexType();
        int int33 = functionType29.getMinArguments();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str36 = assertionFunctionSpec35.getFunctionName();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.isOr();
        node39.setLineno(2);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node39);
        com.google.javascript.rhino.Node node44 = assertionFunctionSpec35.getAssertedParam(node39);
        boolean boolean45 = node39.isString();
        functionType29.setSource(node39);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), node49);
        java.lang.String str54 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node53);
        boolean boolean55 = node53.isBreak();
        boolean boolean56 = node53.isAssignAdd();
        boolean boolean57 = node53.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node58 = node39.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean59 = node39.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = null;
        node61.setStaticSourceFile(staticSourceFile62);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newExpr(node61);
        boolean boolean65 = node61.hasMoreThanOneChild();
        boolean boolean66 = node61.isAssign();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.isOr();
        node69.setLineno(2);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0, node69);
        java.lang.String str74 = node69.toStringTree();
        boolean boolean75 = node69.isLocalResultCall();
        int int76 = node69.getSideEffectFlags();
        boolean boolean77 = node69.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(2, node2, node39, node61, node69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NUMBER -1.0 2\n" + "'", str74, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1509");
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
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate89 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = functionType70.setValidator(jSTypePredicate89);
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
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1510");
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
        node12.setSourceEncodedPositionForTree(2);
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
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1511");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType27 = functionType20.toMaybeParameterizedType();
        boolean boolean28 = functionType20.isConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType20.cloneWithoutArrowType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNull(parameterizedType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1512");
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
        boolean boolean74 = functionType72.isReturnTypeInferred();
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
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1513");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("");
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        int int8 = jSDocInfo0.getParameterCount();
        boolean boolean9 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        boolean boolean11 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1514");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable6 = jSTypeRegistry1.getTypesWithProperty("Function");
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
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.getParameterType();
        boolean boolean32 = functionType28.isNoObjectType();
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
        int int75 = functionType74.getMaxArguments();
        functionType53.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType74);
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType53.autoboxesTo();
        boolean boolean78 = functionType53.hasCachedValues();
        functionType28.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType53);
        java.lang.String str80 = null; // flaky: functionType28.toString();
        java.lang.String str81 = functionType28.getReferenceName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot83 = functionType28.getOwnSlot("InputId: Function");
        boolean boolean84 = functionType28.matchesInt32Context();
        boolean boolean85 = jSTypeRegistry1.declareType("(JSDocInfo)", (com.google.javascript.rhino.jstype.JSType) functionType28);
        jSTypeRegistry1.identifyNonNullableName("null.prototype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable6);
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
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Function" + "'", str80, "Function");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(jSTypeStaticSlot83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1515");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getModifies();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1516");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        java.lang.String str6 = node1.getSourceFileName();
        boolean boolean7 = node1.isUnscopedQualifiedName();
        boolean boolean8 = node1.wasEmptyNode();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node9, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1517");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        boolean boolean2 = jSDocInfo0.isNoTypeCheck();
        boolean boolean3 = jSDocInfo0.isHidden();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str5 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1518");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = functionType65.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot71 = functionType65.getSlot("Not declared as a constructor");
        functionType65.clearResolved();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean76 = jSDocInfo74.hasDescriptionForParameter("NUMBER -1.0 2\n");
        java.util.Set<java.lang.String> strSet77 = jSDocInfo74.getParameterNames();
        boolean boolean79 = jSDocInfo74.hasParameterType("Function");
        java.lang.String str80 = jSDocInfo74.getSourceName();
        functionType65.setPropertyJSDocInfo("EQ\n", jSDocInfo74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType65.getExtendedInterfaces();
        boolean boolean83 = functionType65.isInstanceType();
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
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertNull(jSTypeStaticSlot71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1519");
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
        boolean boolean36 = functionType34.hasImplementedInterfaces();
        boolean boolean38 = functionType34.removeProperty("true");
        boolean boolean40 = functionType34.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType34.findPropertyType("InputId: Function");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType34.toMaybeFunctionType();
        boolean boolean44 = strSet6.remove((java.lang.Object) functionType34);
        strSet6.clear();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.hasOneChild();
        boolean boolean49 = node47.isAnd();
        boolean boolean50 = node47.isGetElem();
        boolean boolean51 = node47.isExprResult();
        boolean boolean52 = strSet6.remove((java.lang.Object) boolean51);
        java.lang.Object[] objArray53 = strSet6.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator54 = strSet6.spliterator();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(strSpliterator54);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1520");
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
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean69 = node68.hasOneChild();
        boolean boolean70 = node68.isObjectLit();
        com.google.javascript.rhino.InputId inputId71 = com.google.javascript.jscomp.NodeUtil.getInputId(node68);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), node68);
        java.lang.String str73 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node72);
        boolean boolean74 = node72.isBreak();
        boolean boolean75 = node72.isAssignAdd();
        boolean boolean76 = node72.isOnlyModifiesThisCall();
        boolean boolean77 = node72.isThis();
        boolean boolean78 = node72.isQuotedString();
        boolean boolean79 = node1.isEquivalentTo(node72);
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
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(inputId71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1521");
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
        boolean boolean12 = node6.isAssign();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildToBack(node13);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1522");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.hasOneChild();
        boolean boolean6 = node4.isObjectLit();
        com.google.javascript.rhino.InputId inputId7 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), node4);
        boolean boolean9 = node8.isTry();
        boolean boolean10 = node8.isCase();
        java.lang.String str11 = node8.getQualifiedName();
        java.lang.String str12 = node8.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(31, node1, node8, 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1523");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node6.isTry();
        node6.setCharno((int) (short) 1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1524");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("FALSE 0");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1525");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        int int6 = node1.getSourcePosition();
        boolean boolean7 = node1.isFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1526");
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
        com.google.javascript.rhino.jstype.JSType jSType28 = objectType26.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = jSType28.isNominalType();
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
        org.junit.Assert.assertNull(jSType28);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1527");
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
        boolean boolean46 = functionType20.isNoObjectType();
        java.util.Set<java.lang.String> strSet47 = functionType20.getOwnPropertyNames();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean51 = node50.hasOneChild();
        boolean boolean52 = node50.isObjectLit();
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node50);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node54);
        boolean boolean56 = node54.isBreak();
        boolean boolean57 = node54.isAssignAdd();
        boolean boolean58 = node54.isOnlyModifiesThisCall();
        boolean boolean59 = node54.isThis();
        java.lang.String str63 = node54.toString(false, true, true);
        boolean boolean64 = strSet47.equals((java.lang.Object) node54);
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
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ERROR" + "'", str63, "ERROR");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1528");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        int int7 = strList3.indexOf(obj6);
        boolean boolean8 = strList3.isEmpty();
        java.util.ListIterator<java.lang.String> strItor9 = strList3.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor10 = strList3.listIterator();
        java.lang.Object[] objArray11 = strList3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strList3.add("STRING (Named type with empty name component)\n");
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
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, hi!]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1529");
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
        int int48 = functionType20.getMaxArguments();
        int int49 = functionType20.getPropertiesCount();
        boolean boolean50 = functionType20.isConstructor();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1530");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getParameterType("NUMBER -1.0\n");
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1531");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(46, nodeArray3);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(47, nodeArray3);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(37, nodeArray3);
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), node10);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node14);
        boolean boolean16 = node14.isBreak();
        boolean boolean17 = node14.isAssignAdd();
        boolean boolean18 = node14.isOnlyModifiesThisCall();
        node14.setSourceEncodedPosition(36);
        boolean boolean21 = node14.isQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.isOr();
        boolean boolean25 = node23.hasMoreThanOneChild();
        boolean boolean26 = node23.isReturn();
        boolean boolean27 = node23.isScript();
        boolean boolean28 = node23.isUnscopedQualifiedName();
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node23);
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildBefore(node14, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1532");
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
        java.lang.String str35 = jSDocInfo26.toString();
        boolean boolean36 = jSDocInfo26.shouldPreserveTry();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JSDocInfo" + "'", str35, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1533");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getType();
        boolean boolean8 = jSDocInfo0.isExport();
        java.lang.String str9 = jSDocInfo0.getLicense();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
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
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.InputId inputId32 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node29);
        node33.setType(43);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node37);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.isOr();
        boolean boolean44 = node42.isLabel();
        java.lang.String str45 = node42.toStringTree();
        node42.setVarArgs(false);
        double double48 = node42.getDouble();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(3, node33, node37, node42, 2, 49);
        com.google.javascript.rhino.InputId inputId52 = null;
        node51.setInputId(inputId52);
        boolean boolean54 = strSet18.contains((java.lang.Object) node51);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = com.google.common.collect.ImmutableList.copyOf(strArray57);
        int int60 = strList58.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean62 = strList58.equals((java.lang.Object) 8);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList58.containsAll((java.util.Collection<java.lang.String>) strList66);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList72 = com.google.common.collect.ImmutableList.copyOf(strArray71);
        boolean boolean73 = strList58.contains((java.lang.Object) strArray71);
        boolean boolean74 = strSet18.removeAll((java.util.Collection<java.lang.String>) strList58);
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList76 = jSDocInfo75.getExtendedInterfaces();
        boolean boolean77 = jSDocInfo75.isImplicitCast();
        java.util.Set<java.lang.String> strSet78 = jSDocInfo75.getModifies();
        int int79 = strList58.indexOf((java.lang.Object) strSet78);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = strList10.addAll(5, (java.util.Collection<java.lang.String>) strSet78);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NUMBER -1.0\n" + "'", str45, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1534");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType20.getImplementedInterfaces();
        boolean boolean58 = functionType20.hasProperty("Not declared as a type name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo60.getReturnType();
        java.lang.String str62 = jSDocInfo60.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility63 = jSDocInfo60.getVisibility();
        java.lang.String str64 = jSDocInfo60.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo60.getParameterType("");
        boolean boolean67 = jSDocInfo60.isNoSideEffects();
        int int68 = jSDocInfo60.getParameterCount();
        boolean boolean69 = jSDocInfo60.hasFileOverview();
        com.google.common.collect.ImmutableList<java.lang.String> strList70 = jSDocInfo60.getTemplateTypeNames();
        java.lang.String str71 = jSDocInfo60.getVersion();
        functionType20.setPropertyJSDocInfo("(?)", jSDocInfo60);
        boolean boolean73 = functionType20.isInstanceType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSTypeExpression61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(visibility63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(jSTypeExpression66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1535");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        node8.setLineno(2);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0, node8);
        java.lang.String str13 = node8.toStringTree();
        int int14 = node8.getChildCount();
        boolean boolean15 = node8.isArrayLit();
        node8.removeProp(3);
        boolean boolean18 = node8.isNull();
        boolean boolean19 = node8.isFor();
        com.google.javascript.rhino.Node node20 = node5.useSourceInfoFrom(node8);
        boolean boolean21 = node8.isBlock();
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
        boolean boolean67 = functionType42.hasCachedValues();
        com.google.javascript.rhino.Node node68 = functionType42.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(1, node8, node68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NUMBER -1.0 2\n" + "'", str13, "NUMBER -1.0 2\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1536");
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
        boolean boolean17 = node1.isGetProp();
        node1.setType(6);
        boolean boolean20 = node1.isExprResult();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1537");
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
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType20.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType20.setPrototypeBasedOn(objectType47);
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
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertNull(jSType46);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1538");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation(10, 2, (int) (short) 10, (int) '4');
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        boolean boolean11 = node9.isLabel();
        boolean boolean12 = node9.isAssignAdd();
        boolean boolean13 = node9.isQualifiedName();
        java.lang.String str14 = node9.getSourceFileName();
        boolean boolean15 = node9.isUnscopedQualifiedName();
        java.lang.String str16 = node9.toString();
        namePosition0.setItem(node9);
        int int18 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "NUMBER -1.0" + "'", str16, "NUMBER -1.0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1539");
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
        boolean boolean46 = functionType20.isNativeObjectType();
        com.google.javascript.rhino.Node node47 = functionType20.getRootNode();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1540");
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
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType20.getPropertyType("");
        boolean boolean26 = jSType25.isInterface();
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
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1541");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("(Not declared as a type name)", jSTypeNative1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1542");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getBaseType();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.lang.String str9 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1543");
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
        boolean boolean24 = functionType20.isConstructor();
        boolean boolean25 = functionType20.isNominalType();
        java.lang.Iterable iterable26 = functionType20.getCtorImplementedInterfaces();
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
        boolean boolean49 = functionType47.hasDisplayName();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean52 = node51.isOr();
        boolean boolean53 = node51.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType54 = node51.getJSType();
        boolean boolean55 = node51.isAssignAdd();
        boolean boolean56 = functionType47.equals((java.lang.Object) boolean55);
        boolean boolean57 = functionType47.isVoidType();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.isOr();
        boolean boolean62 = node60.isLabel();
        java.lang.String str63 = node60.toStringTree();
        boolean boolean64 = node60.isDebugger();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean67 = node66.hasOneChild();
        boolean boolean68 = node66.isObjectLit();
        com.google.javascript.rhino.InputId inputId69 = com.google.javascript.jscomp.NodeUtil.getInputId(node66);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection70 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node66);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.hasOneChild();
        boolean boolean74 = node72.isAnd();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean77 = node76.hasOneChild();
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(0, node60, node66, node72, node76, 12, 0);
        boolean boolean82 = node66.isLocalResultCall();
        double double83 = node66.getDouble();
        functionType47.setSource(node66);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = functionType47.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType47.getTypeOfThis();
        boolean boolean87 = functionType20.hasEqualCallType(functionType47);
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
        org.junit.Assert.assertNotNull(iterable26);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "NUMBER -1.0\n" + "'", str63, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertNotNull(nodeCollection70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1544");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1 };
        com.google.common.collect.ImmutableList<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayList3 = com.google.common.collect.ImmutableList.copyOf(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayList3);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1545");
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
        java.lang.String str22 = functionType20.getDisplayName();
        java.lang.String str23 = functionType20.getReferenceName();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1546");
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
        boolean boolean47 = functionType20.isParameterizedType();
        boolean boolean49 = functionType20.removeProperty("InputId: Function");
        boolean boolean50 = functionType20.isOrdinaryFunction();
        boolean boolean51 = functionType20.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType20.getReturnType();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSType52);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1547");
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
        com.google.javascript.rhino.Node node28 = node16.getChildAtIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = node28.getChildAtIndex(8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1548");
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
        boolean boolean95 = jSTypeRegistry1.hasNamespace("[, hi!]");
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1549");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo8.getExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList13 = com.google.common.collect.ImmutableList.of(visibility10, visibility11, visibility12);
        jSDocInfo8.setVisibility(visibility11);
        jSDocInfo0.setVisibility(visibility11);
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertTrue("'" + visibility10 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility10.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility11 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility11.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(visibilityList13);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1550");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        int int8 = typePosition0.getStartLine();
        int int9 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition10 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        boolean boolean14 = node12.isAnd();
        typePosition10.setItem(node12);
        int int16 = typePosition10.getStartLine();
        int int17 = typePosition10.getEndLine();
        int int18 = typePosition10.getStartLine();
        int int19 = typePosition10.getStartLine();
        com.google.javascript.rhino.Node node20 = typePosition10.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isAnd();
        typePosition21.setItem(node23);
        int int27 = typePosition21.getStartLine();
        int int28 = typePosition21.getEndLine();
        int int29 = typePosition21.getPositionOnStartLine();
        boolean boolean30 = typePosition21.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isAnd();
        typePosition32.setItem(node34);
        boolean boolean38 = typePosition32.hasBrackets();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.isOr();
        boolean boolean42 = node40.isLabel();
        java.lang.String str43 = node40.toStringTree();
        boolean boolean44 = node40.isDebugger();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.hasOneChild();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind51 = new com.google.javascript.jscomp.CodingConvention.Bind(node40, node46, node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.hasOneChild();
        boolean boolean58 = node56.isObjectLit();
        com.google.javascript.rhino.InputId inputId59 = com.google.javascript.jscomp.NodeUtil.getInputId(node56);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), node56);
        node60.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind63 = new com.google.javascript.jscomp.CodingConvention.Bind(node49, node53, node60);
        typePosition32.setItem(node60);
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray65 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition0, typePosition10, typePosition21, typePosition31, typePosition32 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList66 = com.google.common.collect.ImmutableList.copyOf(typePositionArray65);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "NUMBER -1.0\n" + "'", str43, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(typePositionArray65);
        org.junit.Assert.assertNotNull(typePositionList66);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1551");
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
        boolean boolean22 = jSDocInfo12.hasDescriptionForParameter("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo12.getType();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = jSDocInfo12.getTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            strList24.add(4095, "Function");
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
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(visibility15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1552");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        typePosition0.setItem(node2);
        int int6 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node7 = typePosition0.getItem();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isFor();
        boolean boolean11 = node9.isReturn();
        typePosition0.setItem(node9);
        boolean boolean13 = typePosition0.hasBrackets();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1553");
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
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType20.getParameterType();
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
        org.junit.Assert.assertNull(jSType69);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1554");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        java.lang.String str2 = ternaryValue0.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue4.not();
        java.lang.String str6 = ternaryValue4.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue3.and(ternaryValue7);
        boolean boolean10 = ternaryValue8.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue8.not();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unknown" + "'", str2, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unknown" + "'", str6, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1555");
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
        boolean boolean27 = node21.isReturn();
        boolean boolean28 = node21.isOnlyModifiesThisCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = node21.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1556");
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
        com.google.javascript.rhino.Node node27 = objectType26.getRootNode();
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1557");
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
        sideEffectFlags17.setMutatesGlobalState();
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
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1558");
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
        com.google.javascript.rhino.jstype.ObjectType objectType48 = functionType20.getTypeOfThis();
        com.google.javascript.rhino.Node node49 = functionType20.getRootNode();
        boolean boolean51 = functionType20.isPropertyTypeDeclared("DELPROP  [input_id: InputId: Function]");
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
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1559");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(visibility5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1560");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        node2.setType(52);
        node2.detachChildren();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.isLabel();
        java.lang.String str22 = node19.toStringTree();
        node19.setVarArgs(false);
        double double25 = node19.getDouble();
        boolean boolean26 = node19.isNE();
        node17.addChildrenToBack(node19);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearTemplateTypeNames();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType52.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType52.getPrototype();
        boolean boolean55 = jSTypeRegistry29.declareType("", (com.google.javascript.rhino.jstype.JSType) objectType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = objectType54.getParameterType();
        node17.setJSType(jSType56);
        boolean boolean58 = node17.isWhile();
        boolean boolean59 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId60 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        boolean boolean61 = node17.isLocalResultCall();
        com.google.javascript.rhino.Node node62 = node2.srcref(node17);
        boolean boolean63 = node2.isVar();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "NUMBER -1.0\n" + "'", str22, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1561");
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
        boolean boolean79 = functionType73.matchesObjectContext();
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1562");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node6 = jSTypeRegistry4.createParameters(jSTypeArray5);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node20);
        boolean boolean25 = node24.isNE();
        node17.addChildToBack(node24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry8.createFunctionType(jSType10, node24);
        int int28 = functionType27.getMaxArguments();
        boolean boolean29 = functionType27.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType27.getParameterType();
        boolean boolean32 = functionType27.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType27.autoboxesTo();
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
        boolean boolean56 = functionType54.hasImplementedInterfaces();
        java.util.Set<java.lang.String> strSet57 = functionType54.getOwnPropertyNames();
        boolean boolean58 = functionType54.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] { jSType33, functionType54 };
        com.google.javascript.rhino.Node node60 = jSTypeRegistry4.createParameters(jSTypeArray59);
        com.google.javascript.rhino.Node node61 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray59);
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
        com.google.javascript.rhino.jstype.FunctionType functionType88 = functionType82.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType82.toMaybeFunctionType();
        boolean boolean91 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType89, "Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n");
        com.google.common.collect.ImmutableList<java.lang.String> strList92 = functionType89.getTemplateTypeNames();
        java.util.ListIterator<java.lang.String> strItor93 = strList92.listIterator();
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
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
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(node60);
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
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strItor93);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1563");
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
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry1.getType("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isObjectLit();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), node35);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        boolean boolean47 = node46.isNE();
        node39.addChildToBack(node46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry30.createFunctionType(jSType32, node46);
        int int50 = functionType49.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType49.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry27.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType49);
        boolean boolean53 = functionType49.matchesInt32Context();
        jSTypeRegistry1.unregisterPropertyOnType("(InputId: Function)", (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isObjectLit();
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getSourceName(node57);
        boolean boolean61 = node57.isOnlyModifiesThisCall();
        java.util.Set<java.lang.String> strSet62 = node57.getDirectives();
        boolean boolean63 = node57.isOnlyModifiesThisCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry1.createInterfaceType("true", node57);
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
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(errorReporter24);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(strSet62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1564");
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
        boolean boolean26 = functionType20.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = functionType20.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node28 = functionType20.getRootNode();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1565");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("(JSDocInfo)");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean5 = node4.hasOneChild();
        boolean boolean6 = node4.isObjectLit();
        com.google.javascript.rhino.InputId inputId7 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), node4);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node8);
        boolean boolean10 = node8.isBreak();
        boolean boolean11 = node8.isAssignAdd();
        boolean boolean12 = node8.hasMoreThanOneChild();
        boolean boolean13 = node8.isWith();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node8);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node8.children();
        boolean boolean16 = inputId1.equals((java.lang.Object) nodeIterable15);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator17 = nodeIterable15.spliterator();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1566");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        java.util.Spliterator<java.lang.String> strSpliterator9 = strSet8.spliterator();
        java.lang.Object[] objArray10 = strSet8.toArray();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1567");
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
        boolean boolean18 = node17.isFunction();
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(46, nodeArray22);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(47, nodeArray22);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(37, nodeArray22);
        boolean boolean26 = node25.isFalse();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node25.siblings();
        boolean boolean28 = node17.hasChild(node25);
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
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1568");
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
        boolean boolean93 = functionType68.hasCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = functionType68.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType95 = functionType68.restrictByNotNullOrUndefined();
        jSTypeRegistry1.registerPropertyOnType("InputId: Function", jSType95);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable98 = jSTypeRegistry1.getTypesWithProperty("(Named type with empty name component)");
        com.google.javascript.rhino.ErrorReporter errorReporter99 = jSTypeRegistry1.getErrorReporter();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(jSTypeIterable98);
        org.junit.Assert.assertNull(errorReporter99);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1569");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet1.union(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = booleanLiteralSet3.intersection(booleanLiteralSet6);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = booleanLiteralSet8.union(booleanLiteralSet10);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = booleanLiteralSet10.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet7.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet0.intersection(booleanLiteralSet13);
        boolean boolean18 = booleanLiteralSet13.contains(false);
        boolean boolean20 = booleanLiteralSet13.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1570");
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
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.isOr();
        boolean boolean22 = node20.isLabel();
        java.lang.String str23 = node20.toStringTree();
        node20.setVarArgs(false);
        double double26 = node20.getDouble();
        boolean boolean27 = node20.isNE();
        node18.addChildrenToBack(node20);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(31, "?", 41, 50);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node33);
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceChildAfter(node18, node33);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NUMBER -1.0\n" + "'", str23, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1571");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = null;
        jSDocInfo12.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getReturnType();
        jSDocInfo12.setDeprecated(true);
        java.util.Set<java.lang.String> strSet19 = jSDocInfo12.getSuppressions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = com.google.common.collect.ImmutableList.copyOf(strArray22);
        java.util.Iterator<java.lang.String> strItor24 = strList23.iterator();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.copyOf(strArray27);
        int int30 = strList28.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean31 = strList23.contains((java.lang.Object) int30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = jSDocInfo32.getReturnType();
        java.lang.String str34 = jSDocInfo32.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = jSDocInfo32.getVisibility();
        java.lang.String str36 = jSDocInfo32.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo32.getParameterType("");
        int int39 = jSDocInfo32.getExtendedInterfacesCount();
        boolean boolean40 = strList23.equals((java.lang.Object) jSDocInfo32);
        boolean boolean41 = strSet19.removeAll((java.util.Collection<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = strList3.removeAll((java.util.Collection<java.lang.String>) strList23);
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
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(visibility35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1572");
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
        jSTypeRegistry1.identifyNonNullableName("NUMBER -1.0");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry1.getNativeType(jSTypeNative69);
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
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1573");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isSyntheticBlock();
        boolean boolean8 = node2.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1574");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.isOr();
        boolean boolean5 = node3.isLabel();
        boolean boolean6 = node3.isAssignAdd();
        boolean boolean7 = node3.isQualifiedName();
        java.lang.String str8 = node3.getSourceFileName();
        boolean boolean9 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        com.google.javascript.rhino.InputId inputId14 = com.google.javascript.jscomp.NodeUtil.getInputId(node11);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node11);
        int int16 = node11.getLineno();
        boolean boolean17 = node11.isHook();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean32 = node31.hasOneChild();
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.InputId inputId34 = com.google.javascript.jscomp.NodeUtil.getInputId(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), node31);
        boolean boolean36 = node35.isNE();
        node28.addChildToBack(node35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry19.createFunctionType(jSType21, node35);
        int int39 = functionType38.getMaxArguments();
        boolean boolean40 = functionType38.isParameterizedType();
        java.lang.String str41 = null; // flaky: functionType38.toAnnotationString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = functionType38.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node43 = functionType38.getParametersNode();
        com.google.javascript.rhino.Node node44 = node43.detachFromParent();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node44.getStaticSourceFile();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        node47.setLineno(2);
        com.google.javascript.rhino.Node node51 = node47.cloneTree();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(2, node3, node11, node44, node51, 42, 2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 1, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeCollection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Function" + "'", str41, "Function");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1575");
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
        com.google.javascript.rhino.Node node47 = functionType42.getPropertyNode("Node tree inequality:\nTree1:\nERROR 41\n\n\nTree2:\nNUMBER -1.0 2 [input_id: InputId: Function]\n\n\nSubtree1: ERROR 41\n\n\nSubtree2: NUMBER -1.0 2 [input_id: InputId: Function]\n");
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
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1576");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(54, "Node tree inequality:\nTree1:\nERROR\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 2\n\n\nSubtree1: ERROR\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 2\n", 24, 29);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, 0, 16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo9.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = null;
        jSDocInfo9.setVisibility(visibility11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo9.getReturnType();
        boolean boolean14 = jSDocInfo9.isConsistentIdGenerator();
        boolean boolean15 = jSDocInfo9.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo9.getParameterNames();
        node8.setDirectives(strSet16);
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1577");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope76 = functionType74.getParentScope();
        boolean boolean77 = functionType74.hasAnyTemplate();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.getReturnType();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean81 = node80.isOr();
        boolean boolean82 = node80.isLabel();
        java.lang.String str83 = node80.toStringTree();
        boolean boolean84 = node80.isDebugger();
        boolean boolean85 = node80.isQualifiedName();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry1.createFunctionType(jSType78, node80);
        com.google.javascript.rhino.Node node87 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node88 = node80.useSourceInfoIfMissingFromForTree(node87);
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
        org.junit.Assert.assertNotNull(jSTypeStaticScope76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "NUMBER -1.0\n" + "'", str83, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(functionType86);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1578");
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
        com.google.javascript.rhino.jstype.JSType jSType48 = objectType46.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean49 = jSType48.isNominalConstructor();
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
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1579");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("hi!", throwable2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder7 = com.google.common.collect.ImmutableList.builder();
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("hi!", throwable9);
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException("hi!", throwable12);
        iOException10.addSuppressed((java.lang.Throwable) iOException13);
        com.google.common.collect.ImmutableList.Builder<java.lang.Exception> exceptionBuilder15 = exceptionBuilder7.add((java.lang.Exception) iOException13);
        java.lang.Throwable[] throwableArray16 = iOException13.getSuppressed();
        java.lang.Exception[] exceptionArray17 = new java.lang.Exception[] { iOException3, iOException13 };
        java.lang.Exception[][] exceptionArray18 = new java.lang.Exception[][] { exceptionArray17 };
        com.google.common.collect.ImmutableList<java.lang.Exception[]> exceptionArrayList19 = com.google.common.collect.ImmutableList.copyOf(exceptionArray18);
        com.google.common.collect.ImmutableList<java.lang.Throwable[]> throwableArrayList20 = com.google.common.collect.ImmutableList.copyOf((java.lang.Throwable[][]) exceptionArray18);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(exceptionBuilder7);
        org.junit.Assert.assertNotNull(exceptionBuilder15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(exceptionArray17);
        org.junit.Assert.assertNotNull(exceptionArray18);
        org.junit.Assert.assertNotNull(exceptionArrayList19);
        org.junit.Assert.assertNotNull(throwableArrayList20);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1580");
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
        functionType65.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType86);
        boolean boolean89 = functionType20.hasEqualCallType(functionType65);
        int int90 = functionType20.getPropertiesCount();
        boolean boolean91 = functionType20.isParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType92 = functionType20.getInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1581");
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
        com.google.javascript.rhino.jstype.JSType jSType53 = objectType52.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = jSType53.isNoResolvedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(jSType53);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1582");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        int int5 = strList3.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean7 = strList3.equals((java.lang.Object) 8);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList11.spliterator();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        boolean boolean20 = node16.isDebugger();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean23 = node22.hasOneChild();
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.hasOneChild();
        boolean boolean30 = node28.isAnd();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean33 = node32.hasOneChild();
        boolean boolean34 = node32.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0, node16, node22, node28, node32, 12, 0);
        boolean boolean38 = strList11.contains((java.lang.Object) node32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = strList3.removeAll((java.util.Collection<java.lang.String>) strList11);
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
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER -1.0\n" + "'", str19, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1583");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesThis();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1584");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        jSDocInfo0.addSuppression("(Unknown class name)");
        boolean boolean12 = jSDocInfo0.hasParameterType("Node tree inequality:\nTree1:\nERROR\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 2\n\n\nSubtree1: ERROR\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 2\n");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(visibility13);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1585");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        java.lang.String str5 = node1.getSourceFileName();
        boolean boolean6 = node1.isOr();
        boolean boolean7 = node1.isSwitch();
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1586");
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
        com.google.javascript.rhino.Node node48 = functionType20.getSource();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType20.getPropertyType("function (): {230041977}");
        com.google.javascript.rhino.jstype.FunctionType functionType51 = functionType20.toMaybeFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = functionType51.getParameters();
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
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(nodeIterable52);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1587");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("java.io.IOException: ");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.Node node6 = node3.removeFirstChild();
        boolean boolean7 = node3.isAssignAdd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = null;
        node3.setStaticSourceFile(staticSourceFile8);
        com.google.javascript.rhino.Node node10 = assertionFunctionSpec1.getAssertedParam(node3);
        com.google.javascript.rhino.Node node11 = node3.getLastChild();
        int int12 = node3.getSideEffectFlags();
        boolean boolean13 = node3.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1588");
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
        boolean boolean31 = node1.isString();
        node1.addSuppression("Node tree inequality:\nTree1:\nLT 29\n\n\nTree2:\nERROR\n    NUMBER -1.0\n\n\nSubtree1: LT 29\n\n\nSubtree2: ERROR\n    NUMBER -1.0\n");
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
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1589");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList74 = jSDocInfo73.getExtendedInterfaces();
        functionType20.setPropertyJSDocInfo("hi!", jSDocInfo73);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot77 = functionType20.getOwnSlot("");
        boolean boolean78 = functionType20.isStringObjectType();
        boolean boolean80 = functionType20.removeProperty("");
        boolean boolean82 = functionType20.hasOwnProperty("[, hi!]");
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
        org.junit.Assert.assertNotNull(jSTypeExpressionList74);
        org.junit.Assert.assertNull(jSTypeStaticSlot77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1590");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnEndLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1591");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = functionType65.getJSDocInfo();
        boolean boolean70 = functionType65.isNominalType();
        boolean boolean71 = functionType65.isStringObjectType();
        boolean boolean72 = functionType65.isRecordType();
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
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1592");
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
        boolean boolean29 = node2.isWith();
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1593");
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
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor21 = strList17.iterator();
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(46, nodeArray26);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray26);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(31, nodeArray26);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray26, (int) (short) 1, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node[] nodeArray33 = strList17.toArray(nodeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(nodeArray26);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1594");
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
        boolean boolean31 = functionType20.isNominalType();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1595");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        boolean boolean4 = node1.isFunction();
        boolean boolean5 = node1.isSyntheticBlock();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node1);
        boolean boolean7 = node1.isAnd();
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        boolean boolean9 = node1.isDo();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1596");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node3 = jSTypeRegistry1.createParameters(jSTypeArray2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.hasOneChild();
        boolean boolean15 = node13.isObjectLit();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isObjectLit();
        com.google.javascript.rhino.InputId inputId23 = com.google.javascript.jscomp.NodeUtil.getInputId(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node20);
        boolean boolean25 = node24.isNE();
        node17.addChildToBack(node24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry8.createFunctionType(jSType10, node24);
        int int28 = functionType27.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry5.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.Node node31 = functionType27.getRootNode();
        boolean boolean32 = functionType27.isResolved();
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
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType54.toMaybeFunctionType();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.isOr();
        boolean boolean65 = node63.isLabel();
        java.lang.String str66 = node63.toStringTree();
        boolean boolean67 = node63.isDebugger();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean73 = node72.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind74 = new com.google.javascript.jscomp.CodingConvention.Bind(node63, node69, node72);
        boolean boolean75 = node69.isSetterDef();
        java.lang.String str76 = com.google.javascript.jscomp.NodeUtil.getSourceName(node69);
        node69.setSourceEncodedPositionForTree(42);
        boolean boolean79 = node69.isFalse();
        boolean boolean80 = node69.isFalse();
        boolean boolean81 = functionType27.defineDeclaredProperty("java.io.IOException: ", (com.google.javascript.rhino.jstype.JSType) functionType61, node69);
        boolean boolean82 = functionType27.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        com.google.javascript.rhino.jstype.JSType jSType84 = objectType83.getParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NUMBER -1.0\n" + "'", str66, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNull(jSType84);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1597");
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
        boolean boolean70 = functionType45.isFunctionPrototypeType();
        boolean boolean71 = functionType45.hasInstanceType();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        boolean boolean74 = node73.isOr();
        boolean boolean75 = node73.wasEmptyNode();
        boolean boolean76 = functionType20.defineInferredProperty("Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n", (com.google.javascript.rhino.jstype.JSType) functionType45, node73);
        boolean boolean77 = functionType45.matchesObjectContext();
        boolean boolean79 = functionType45.removeProperty("(?)");
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1598");
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
        boolean boolean28 = jSType27.matchesUint32Context();
        boolean boolean29 = jSType27.isBooleanValueType();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1599");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean4 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), node8);
        node12.setType(43);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node21);
        boolean boolean23 = node21.isBreak();
        boolean boolean24 = node21.isAssignAdd();
        boolean boolean25 = node21.hasMoreThanOneChild();
        java.lang.String str26 = node21.getQualifiedName();
        com.google.javascript.rhino.Node node27 = node12.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = null;
        node29.setStaticSourceFile(staticSourceFile33);
        boolean boolean35 = node29.isObjectLit();
        node21.addChildToBack(node29);
        node29.detachChildren();
        boolean boolean38 = node29.isLabelName();
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
        boolean boolean61 = functionType59.isParameterizedType();
        java.lang.String str62 = null; // flaky: functionType59.toAnnotationString();
        boolean boolean63 = functionType59.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType59, jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = typePair65.typeA;
        com.google.javascript.rhino.jstype.JSType jSType67 = typePair65.typeA;
        com.google.javascript.rhino.jstype.EnumType enumType68 = jSTypeRegistry1.createEnumType("{1265766742}", node29, jSType67);
        int int69 = enumType68.getPropertiesCount();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType70 = enumType68.getElementsType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = enumType68.getOwnPropertyJSDocInfo("FALSE [source_file: ]\n    NUMBER -1.0\n");
        boolean boolean74 = enumType68.hasProperty("(JSDocInfo)");
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = enumType68.isSubtype(jSType75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
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
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Function" + "'", str62, "Function");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(enumType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(enumElementType70);
        org.junit.Assert.assertNull(jSDocInfo72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test1600");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isAnd();
        node2.setLength(50);
        node2.addSuppression("Node tree inequality:\nTree1:\nEQ\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: EQ\n\n\nSubtree2: NUMBER -1.0\n");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node10.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node10.isFor();
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
        com.google.javascript.rhino.Node node41 = node10.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean42 = node2.isEquivalentToTyped(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 1, node41, (int) (short) 100, 37);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean49 = node48.isOr();
        boolean boolean50 = node48.isLabel();
        java.lang.String str51 = node48.toStringTree();
        boolean boolean52 = node48.isDebugger();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean55 = node54.hasOneChild();
        boolean boolean56 = node54.isObjectLit();
        com.google.javascript.rhino.InputId inputId57 = com.google.javascript.jscomp.NodeUtil.getInputId(node54);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection58 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean61 = node60.hasOneChild();
        boolean boolean62 = node60.isAnd();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean65 = node64.hasOneChild();
        boolean boolean66 = node64.isObjectLit();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(0, node48, node54, node60, node64, 12, 0);
        boolean boolean70 = node54.isLocalResultCall();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.isOr();
        boolean boolean75 = node73.isLabel();
        java.lang.String str76 = node73.toStringTree();
        node73.setVarArgs(false);
        double double79 = node73.getDouble();
        boolean boolean80 = node73.isNE();
        node73.setCharno((-1));
        boolean boolean83 = node73.isTry();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(6, node73, 32, 53);
        // The following exception was thrown during execution in test generation
        try {
            node41.addChildBefore(node54, node86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "NUMBER -1.0\n" + "'", str51, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(nodeCollection58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "NUMBER -1.0\n" + "'", str76, "NUMBER -1.0\n");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }
}
