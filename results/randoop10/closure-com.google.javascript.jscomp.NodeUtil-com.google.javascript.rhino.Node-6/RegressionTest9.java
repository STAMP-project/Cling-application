import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01801");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getOwnSlot("Named type with empty name component");
        boolean boolean13 = functionType9.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01802");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str69 = functionType15.getNormalizedReferenceName();
        boolean boolean70 = functionType15.isNoResolvedType();
        boolean boolean71 = functionType15.canBeCalled();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = functionType15.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        jSTypeRegistry75.unregisterPropertyOnType("(Not declared as a type name)", jSType77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry75.createFunctionType(jSType79, true, jSTypeArray81);
        com.google.common.collect.ImmutableList<java.lang.String> strList83 = functionType82.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot85 = functionType82.getSlot("NUMBER 0.0 100\n");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = functionType82.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = booleanLiteralSet72.intersection(booleanLiteralSet86);
        boolean boolean89 = booleanLiteralSet86.contains(true);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(staticSlot85);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01803");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        int int3 = stringPosition0.getPositionOnEndLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        int int5 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setPositionInformation(1, (int) (short) 1, 51, 53);
        int int11 = stringPosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(32, 50, 29, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 29");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01804");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = functionType15.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node22 = functionType15.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean33 = functionType32.isReturnTypeInferred();
        boolean boolean34 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean35 = functionType32.isResolved();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        jSTypeRegistry38.unregisterPropertyOnType("(Not declared as a type name)", jSType40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType(jSType42, true, jSTypeArray44);
        boolean boolean47 = functionType45.removeProperty("false");
        boolean boolean48 = functionType45.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType32.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.Node node50 = functionType32.getRootNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType51 = functionType32.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01805");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01806");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        boolean boolean5 = node1.isFalse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean10 = node9.isEmpty();
        node1.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 100, node14, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node21 = node14.cloneNode();
        com.google.javascript.rhino.Node node22 = node1.clonePropsFrom(node14);
        node1.putIntProp((int) (byte) 100, 36);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node29.isAssignAdd();
        boolean boolean31 = node29.isFalse();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(32, node39);
        boolean boolean44 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        boolean boolean47 = node46.isCall();
        com.google.javascript.rhino.Node node48 = node46.cloneTree();
        com.google.javascript.jscomp.CodingConvention.Bind bind49 = new com.google.javascript.jscomp.CodingConvention.Bind(node33, node39, node46);
        int int50 = node29.getIndexOfChild(node46);
        com.google.javascript.rhino.Node node51 = node1.useSourceInfoFromForTree(node46);
        // The following exception was thrown during execution in test generation
        try {
            node51.setSideEffectFlags(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01807");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node4.isNE();
        boolean boolean13 = node4.isCall();
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        int int23 = node17.getLineno();
        boolean boolean24 = node17.hasChildren();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node17.hasChild(node26);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node32.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0, node26, node32, node38);
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.Node node41 = node4.getLastChild();
        com.google.javascript.rhino.Node node43 = node4.getAncestor(38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(staticSourceFile34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01808");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue1.not();
        java.lang.String str3 = ternaryValue1.toString();
        boolean boolean5 = ternaryValue1.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue6.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList15 = com.google.common.collect.ImmutableList.of(ternaryValue0, ternaryValue1, ternaryValue7, ternaryValue8, ternaryValue13, ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue17.not();
        java.lang.String str19 = ternaryValue17.toString();
        boolean boolean21 = ternaryValue17.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue22.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue24.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue24.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue27.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue27.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList31 = com.google.common.collect.ImmutableList.of(ternaryValue16, ternaryValue17, ternaryValue23, ternaryValue24, ternaryValue29, ternaryValue30);
        boolean boolean33 = ternaryValue29.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue14.or(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false" + "'", str3, "false");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValueList15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "false" + "'", str19, "false");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValueList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(ternaryValue34);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01809");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isResolved();
        boolean boolean13 = functionType9.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01810");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        boolean boolean31 = functionType28.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry15.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType9.forceResolve(errorReporter12, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType28);
        boolean boolean34 = jSType33.isUnknownType();
        boolean boolean35 = jSType33.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01811");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType29.autoboxesTo();
        java.lang.String str31 = functionType29.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = functionType41.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot44 = functionType41.getSlot("NUMBER 0.0 100\n");
        boolean boolean45 = functionType41.isAllType();
        boolean boolean46 = functionType29.hasEqualCallType(functionType41);
        boolean boolean47 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType57.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType57.toObjectType();
        boolean boolean60 = objectType59.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = objectType59.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType63 = objectType59.getPropertyType("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair64 = functionType15.getTypesUnderEquality(jSType63);
        boolean boolean65 = jSType63.isGlobalThisType();
        boolean boolean66 = jSType63.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(staticSlot44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(typePair64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01812");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        java.lang.Iterable iterable12 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean15 = jSType14.isNumberValueType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertNotNull(iterable12);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01813");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.clearAllFlags();
        boolean boolean5 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setThrows();
        boolean boolean7 = sideEffectFlags1.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01814");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 0, 43);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        boolean boolean7 = node6.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isReturn();
        com.google.javascript.rhino.InputId inputId15 = node10.getInputId();
        node10.setWasEmptyNode(true);
        boolean boolean18 = node10.isLabel();
        boolean boolean19 = node10.isTry();
        com.google.javascript.rhino.Node node20 = node6.srcref(node10);
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean22 = node6.isIn();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(52, node6);
        int int24 = node23.getSourcePosition();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node23.children();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable25);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01815");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList11 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator16 = charSequenceList14.spliterator();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        node19.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(32, node19);
        boolean boolean24 = node23.isGetterDef();
        boolean boolean25 = charSequenceList14.equals((java.lang.Object) boolean24);
        boolean boolean27 = charSequenceList14.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean28 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isStringKey();
        boolean boolean35 = node30.isThrow();
        int int36 = charSequenceList11.indexOf((java.lang.Object) node30);
        boolean boolean37 = node3.isEquivalentTo(node30);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean42 = node41.isEmpty();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList49 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList52 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator54 = charSequenceList52.spliterator();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(32, node57);
        boolean boolean62 = node61.isGetterDef();
        boolean boolean63 = charSequenceList52.equals((java.lang.Object) boolean62);
        boolean boolean65 = charSequenceList52.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean66 = charSequenceList49.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        node68.putIntProp((-1), 35);
        boolean boolean72 = node68.isStringKey();
        boolean boolean73 = node68.isThrow();
        int int74 = charSequenceList49.indexOf((java.lang.Object) node68);
        boolean boolean75 = node41.isEquivalentTo(node68);
        com.google.javascript.rhino.Node node76 = node30.srcref(node41);
        boolean boolean77 = node76.isNE();
        boolean boolean78 = node76.isInstanceOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceList11);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceList49);
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01816");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        boolean boolean25 = node24.isGetterDef();
        boolean boolean26 = node24.isNumber();
        int int27 = node24.getLineno();
        node24.setSourceEncodedPosition((int) 'a');
        boolean boolean30 = node24.isIf();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01817");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node40.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = node40.getNext();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        boolean boolean51 = node45.isEmpty();
        com.google.javascript.rhino.Node node52 = node40.copyInformationFrom(node45);
        boolean boolean53 = node52.isGetProp();
        boolean boolean54 = node52.isThrow();
        boolean boolean55 = node52.isHook();
        node38.addChildrenToFront(node52);
        boolean boolean57 = node38.isComma();
        boolean boolean58 = node38.isNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01818");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(35, node4, node7);
        boolean boolean9 = node8.isComma();
        boolean boolean10 = node8.isWith();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isStringKey();
        boolean boolean20 = node15.isThrow();
        boolean boolean21 = node15.isEmpty();
        com.google.javascript.rhino.Node node22 = node12.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoIfMissingFrom(node12);
        com.google.javascript.rhino.Node node24 = node23.cloneNode();
        boolean boolean25 = node24.isVar();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01819");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.lang.Object[] objArray5 = charSequenceList2.toArray();
        charSequenceList2.clear();
        java.util.Iterator<java.lang.CharSequence> charSequenceItor7 = charSequenceList2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(charSequenceItor7);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01820");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.asList();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList31 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList38 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList41 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator43 = charSequenceList41.spliterator();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(32, node46);
        boolean boolean51 = node50.isGetterDef();
        boolean boolean52 = charSequenceList41.equals((java.lang.Object) boolean51);
        boolean boolean54 = charSequenceList41.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean55 = charSequenceList38.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor56 = charSequenceList38.listIterator();
        boolean boolean57 = charSequenceList31.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor58 = charSequenceList38.listIterator();
        boolean boolean59 = charSequenceList24.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.CharSequence> charSequenceItor61 = charSequenceList38.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (35) must not be greater than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceList31);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceList38);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charSequenceItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charSequenceItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01821");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        node4.detachChildren();
        com.google.javascript.rhino.Node node6 = node4.getLastSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01822");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean62 = parameterizedType61.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getIndexType();
        com.google.javascript.rhino.Node node65 = parameterizedType61.getPropertyNode("function (): {259080799}");
        boolean boolean66 = parameterizedType61.hasReferenceName();
        boolean boolean67 = parameterizedType61.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasThisType();
        boolean boolean71 = jSDocInfo69.shouldPreserveTry();
        boolean boolean72 = jSDocInfo69.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo69.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean75 = jSDocInfo69.shouldPreserveTry();
        boolean boolean76 = jSDocInfo69.isOverride();
        boolean boolean77 = jSDocInfo69.isNoSideEffects();
        boolean boolean78 = jSDocInfo69.isConstant();
        boolean boolean79 = jSDocInfo69.hasFileOverview();
        boolean boolean80 = jSDocInfo69.isDefine();
        parameterizedType61.setJSDocInfo(jSDocInfo69);
        java.lang.Iterable iterable82 = parameterizedType61.getCtorImplementedInterfaces();
        boolean boolean83 = parameterizedType61.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNull(staticSlot40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(functionType43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "function (): ?" + "'", str60, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSTypeExpression74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(iterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01823");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean74 = functionType72.removeProperty("false");
        boolean boolean75 = functionType72.isNativeObjectType();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        node78.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 100, node78, 49, (int) (byte) 1);
        boolean boolean85 = functionType33.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType72, node78);
        boolean boolean86 = functionType72.isNominalType();
        boolean boolean88 = functionType72.isPropertyTypeInferred("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType72.getOwnerFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType72.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType90.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(functionType89);
        org.junit.Assert.assertNotNull(functionType90);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01824");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.reverse();
        boolean boolean25 = charSequenceList6.isEmpty();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList32 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator37 = charSequenceList35.spliterator();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        node40.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(32, node40);
        boolean boolean45 = node44.isGetterDef();
        boolean boolean46 = charSequenceList35.equals((java.lang.Object) boolean45);
        boolean boolean48 = charSequenceList35.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean49 = charSequenceList32.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        int int57 = charSequenceList32.indexOf((java.lang.Object) node51);
        java.lang.Object[] objArray58 = charSequenceList32.toArray();
        boolean boolean59 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int60 = charSequenceList6.size();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator61 = charSequenceList6.spliterator();
        int int63 = charSequenceList6.lastIndexOf((java.lang.Object) "{proxy:function (): {917481896}}");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceList32);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertNotNull(charSequenceSpliterator61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01825");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = functionType9.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType9.getPossibleToBooleanOutcomes();
        boolean boolean52 = functionType9.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType9.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType9.findPropertyType("function (): {2030222149}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType9.getOwnPropertyJSDocInfo("NUMBER -1.0\n");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertNull(jSDocInfo58);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01826");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        java.lang.String str3 = assertionFunctionSpec2.getFunctionName();
        java.lang.String str4 = assertionFunctionSpec2.getFunctionName();
        java.lang.String str5 = assertionFunctionSpec2.getFunctionName();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator17 = charSequenceList15.spliterator();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(32, node20);
        boolean boolean25 = node24.isGetterDef();
        boolean boolean26 = charSequenceList15.equals((java.lang.Object) boolean25);
        boolean boolean28 = charSequenceList15.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean29 = charSequenceList12.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        node31.putIntProp((-1), 35);
        boolean boolean35 = node31.isStringKey();
        boolean boolean36 = node31.isThrow();
        int int37 = charSequenceList12.indexOf((java.lang.Object) node31);
        boolean boolean38 = node31.isContinue();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean43 = node42.isEmpty();
        com.google.javascript.rhino.InputId inputId44 = null;
        node42.setInputId(inputId44);
        boolean boolean46 = node42.isIf();
        boolean boolean47 = node42.isOnlyModifiesThisCall();
        node31.addChildrenToBack(node42);
        com.google.javascript.rhino.Node node49 = assertionFunctionSpec2.getAssertedParam(node31);
        // The following exception was thrown during execution in test generation
        try {
            node49.setString("function (): {41182746}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01827");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01828");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.getJsDocBuilderForNode();
        boolean boolean7 = node1.isTypeOf();
        boolean boolean8 = node1.isLabelName();
        boolean boolean9 = node1.isFromExterns();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(32, node12);
        boolean boolean17 = node12.hasMoreThanOneChild();
        boolean boolean18 = node12.isDebugger();
        boolean boolean19 = node12.isTry();
        java.lang.String str20 = node12.getSourceFileName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = node1.removeChildAfter(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01829");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean27 = functionType26.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        boolean boolean39 = functionType37.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        boolean boolean52 = functionType50.removeProperty("false");
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        boolean boolean58 = node54.isStringKey();
        boolean boolean59 = node54.isThrow();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj65 = node63.getProp((int) (byte) 10);
        boolean boolean66 = node54.isEquivalentToTyped(node63);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(0);
        node69.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(32, node69);
        boolean boolean74 = node73.isInstanceOf();
        com.google.javascript.rhino.Node node75 = node63.useSourceInfoFromForTree(node73);
        boolean boolean76 = node73.isDo();
        boolean boolean77 = functionType37.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType50, node73);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair78 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType26, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry13.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType26);
        java.lang.String str80 = functionType26.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        jSTypeRegistry83.unregisterPropertyOnType("(Not declared as a type name)", jSType85);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry83.createFunctionType(jSType87, true, jSTypeArray89);
        com.google.javascript.rhino.jstype.JSType jSType91 = functionType90.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType92 = functionType90.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType93 = functionType90.toMaybeFunctionType();
        boolean boolean94 = functionType26.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType90);
        jSTypeRegistry2.registerPropertyOnType("function (): {2068438814}", (com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean97 = jSTypeRegistry2.hasNamespace("function (): {726684091}");
        jSTypeRegistry2.resetForTypeCheck();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertNull(enumType92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01830");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasThisType();
        boolean boolean6 = jSDocInfo4.shouldPreserveTry();
        boolean boolean7 = jSDocInfo4.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo4.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo9.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = null;
        jSDocInfo9.setVisibility(visibility12);
        boolean boolean14 = jSDocInfo9.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo15.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        jSDocInfo15.setVisibility(visibility18);
        boolean boolean20 = jSDocInfo15.isExport();
        java.lang.String str21 = jSDocInfo15.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList28 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo2, jSDocInfo3, jSDocInfo4, jSDocInfo9, jSDocInfo15, jSDocInfo22);
        boolean boolean29 = jSDocInfo3.hasReturnType();
        boolean boolean31 = jSDocInfo3.hasParameter("{proxy:function (): {1458539419}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01831");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType9.getBindReturnType((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        boolean boolean26 = functionType24.isNullType();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean31 = node30.isEmpty();
        boolean boolean32 = node30.isDebugger();
        boolean boolean33 = node30.isEmpty();
        boolean boolean34 = functionType13.defineInferredProperty("function (): {1362718865}", (com.google.javascript.rhino.jstype.JSType) functionType24, node30);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType44.autoboxesTo();
        java.lang.String str46 = functionType44.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        jSTypeRegistry49.unregisterPropertyOnType("(Not declared as a type name)", jSType51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry49.createFunctionType(jSType53, true, jSTypeArray55);
        com.google.common.collect.ImmutableList<java.lang.String> strList57 = functionType56.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot59 = functionType56.getSlot("NUMBER 0.0 100\n");
        boolean boolean60 = functionType56.isAllType();
        boolean boolean61 = functionType44.hasEqualCallType(functionType56);
        functionType44.clearCachedValues();
        boolean boolean63 = functionType13.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean65 = functionType13.hasOwnProperty("{proxy:function (): {545083368}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNull(staticSlot59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01832");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        boolean boolean4 = node3.isCall();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(35, node5, node8);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node8.getJsDocBuilderForNode();
        java.util.Set<java.lang.String> strSet11 = node8.getDirectives();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(14, "function (): {848299148}", 8, 40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(44, node8, node16, 25, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01833");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType54 = parameterizedType48.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(enumElementType54);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01834");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 0, 43);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node5);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isReturn();
        com.google.javascript.rhino.InputId inputId14 = node9.getInputId();
        node9.setWasEmptyNode(true);
        boolean boolean17 = node9.isLabel();
        boolean boolean18 = node9.isTry();
        com.google.javascript.rhino.Node node19 = node5.srcref(node9);
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoIfMissingFromForTree(node5);
        boolean boolean21 = node3.isFromExterns();
        node3.addSuppression("function (): {2140273663}");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean28 = node27.isEmpty();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList35 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator40 = charSequenceList38.spliterator();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(32, node43);
        boolean boolean48 = node47.isGetterDef();
        boolean boolean49 = charSequenceList38.equals((java.lang.Object) boolean48);
        boolean boolean51 = charSequenceList38.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean52 = charSequenceList35.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        boolean boolean58 = node54.isStringKey();
        boolean boolean59 = node54.isThrow();
        int int60 = charSequenceList35.indexOf((java.lang.Object) node54);
        boolean boolean61 = node27.isEquivalentTo(node54);
        boolean boolean62 = node54.isSyntheticBlock();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        boolean boolean68 = node64.isStringKey();
        boolean boolean69 = node64.isThrow();
        boolean boolean70 = node64.isEmpty();
        boolean boolean71 = node64.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildrenAfter(node54, node64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceList35);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01835");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        jSTypeRegistry29.unregisterPropertyOnType("(Not declared as a type name)", jSType31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType(jSType33, true, jSTypeArray35);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType36.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot39 = functionType36.getSlot("NUMBER 0.0 100\n");
        boolean boolean40 = functionType36.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        boolean boolean52 = functionType50.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.findPropertyType("Not declared as a type name");
        boolean boolean55 = functionType36.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType50);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType50.getImplementedInterfaces();
        boolean boolean57 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType50);
        boolean boolean58 = functionType9.isNumber();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType9.autobox();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate60 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = functionType9.setValidator(jSTypePredicate60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(staticSlot39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSType59);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01836");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = jSTypeRegistry2.hasNamespace("hi!");
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry2.getType("NUMBER 0.0");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = functionType33.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot36 = functionType33.getSlot("NUMBER 0.0 100\n");
        boolean boolean37 = functionType33.isAllType();
        java.lang.Iterable iterable38 = functionType33.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = functionType33.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType49.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = functionType49.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean70 = functionType68.removeProperty("false");
        boolean boolean71 = functionType68.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry55.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType49.forceResolve(errorReporter52, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType68.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry2.createFunctionTypeWithNewReturnType(functionType33, (com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean76 = functionType33.matchesStringContext();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(staticSlot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterable38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01837");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType22.autobox();
        java.lang.String str53 = functionType22.toString();
        boolean boolean54 = functionType22.matchesObjectContext();
        boolean boolean55 = functionType22.hasDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "function (): ?" + "'", str53, "function (): ?");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01838");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        boolean boolean52 = functionType22.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType22.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType22.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(functionType53);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01839");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType5 = node4.getJSType();
        boolean boolean6 = node4.isHook();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        java.lang.String str15 = node12.getSourceFileName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node17.getNext();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        boolean boolean28 = node22.isEmpty();
        com.google.javascript.rhino.Node node29 = node17.copyInformationFrom(node22);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isStringKey();
        boolean boolean38 = node33.isThrow();
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoFrom(node33);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isCall();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList50 = com.google.common.collect.ImmutableList.of((java.lang.Object) node17, (java.lang.Object) node33, (java.lang.Object) node41, (java.lang.Object) 53, (java.lang.Object) node45);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        boolean boolean53 = node52.isInstanceOf();
        node45.addChildrenToFront(node52);
        int int55 = node45.getSourceOffset();
        boolean boolean56 = node45.isVoid();
        com.google.javascript.rhino.Node node57 = node12.useSourceInfoIfMissingFrom(node45);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(54, node4, node8, node57);
        java.lang.Class<?> wildcardClass59 = node58.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objList50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01840");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node11 = node1.srcrefTree(node10);
        boolean boolean12 = node11.isWhile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01841");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node7 = node3.getAncestor(54);
        int int8 = node3.getCharno();
        node3.setWasEmptyNode(true);
        boolean boolean11 = node3.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01842");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        int int3 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01843");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        int int32 = node26.getLineno();
        boolean boolean33 = node26.hasChildren();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node26.hasChild(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node41.getStaticSourceFile();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0, node35, node41, node47);
        boolean boolean49 = charSequenceList6.contains((java.lang.Object) node41);
        int int50 = charSequenceList6.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor51 = charSequenceList6.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType61.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType61.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean82 = functionType80.removeProperty("false");
        boolean boolean83 = functionType80.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry67.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType61.forceResolve(errorReporter64, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType80);
        boolean boolean86 = functionType61.isCheckedUnknownType();
        boolean boolean87 = functionType61.isTemplateType();
        boolean boolean88 = functionType61.hasAnyTemplateInternal();
        boolean boolean89 = charSequenceList6.equals((java.lang.Object) functionType61);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(charSequenceItor51);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01844");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = functionType9.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType9.getPossibleToBooleanOutcomes();
        boolean boolean52 = functionType9.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType9.restrictByNotNullOrUndefined();
        boolean boolean54 = jSType53.isUnionType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01845");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(32, node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean9 = jSDocInfo8.hasThisType();
        boolean boolean10 = jSDocInfo8.shouldPreserveTry();
        boolean boolean11 = jSDocInfo8.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo8.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean14 = jSDocInfo8.shouldPreserveTry();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        boolean boolean17 = node16.isCall();
        com.google.javascript.rhino.Node node18 = node16.cloneTree();
        boolean boolean19 = node16.isNull();
        jSDocInfo8.setAssociatedNode(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        boolean boolean29 = node23.isEmpty();
        boolean boolean30 = node23.isArrayLit();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node7, node16, node23);
        boolean boolean32 = node7.isAssignAdd();
        boolean boolean33 = node7.isAdd();
        node7.setLength(43);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01846");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01847");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType9.getBindReturnType((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        boolean boolean26 = functionType24.isNullType();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean31 = node30.isEmpty();
        boolean boolean32 = node30.isDebugger();
        boolean boolean33 = node30.isEmpty();
        boolean boolean34 = functionType13.defineInferredProperty("function (): {1362718865}", (com.google.javascript.rhino.jstype.JSType) functionType24, node30);
        boolean boolean35 = functionType13.isNominalConstructor();
        boolean boolean36 = functionType13.isNumberValueType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType13.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01848");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean59 = parameterizedType48.isUnknownType();
        boolean boolean60 = parameterizedType48.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01849");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        boolean boolean6 = node3.isFor();
        boolean boolean7 = node3.isCall();
        boolean boolean8 = node3.isTypeOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01850");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.hasParameterType("");
        boolean boolean11 = jSDocInfo0.isNoCompile();
        int int12 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean13 = jSDocInfo0.hasReturnType();
        boolean boolean14 = jSDocInfo0.isExterns();
        java.lang.String str15 = jSDocInfo0.toString();
        boolean boolean16 = jSDocInfo0.hasTypedefType();
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSDocInfo" + "'", str15, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01851");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection8 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("function (): {2129138287}");
        boolean boolean12 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(markerCollection8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01852");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException7 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException(throwable10);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        iOException11.addSuppressed((java.lang.Throwable) iOException14);
        java.lang.Throwable throwable16 = null;
        java.io.IOException iOException17 = new java.io.IOException(throwable16);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        iOException17.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException20.getSuppressed();
        java.lang.Throwable throwable23 = null;
        java.io.IOException iOException24 = new java.io.IOException(throwable23);
        java.lang.Throwable[] throwableArray25 = iOException24.getSuppressed();
        java.io.IOException iOException27 = new java.io.IOException("");
        java.io.IOException iOException29 = new java.io.IOException("");
        java.lang.Throwable throwable31 = null;
        java.io.IOException iOException32 = new java.io.IOException(throwable31);
        java.lang.Throwable[] throwableArray33 = iOException32.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray35 = iOException32.getSuppressed();
        java.lang.Throwable throwable37 = null;
        java.io.IOException iOException38 = new java.io.IOException(throwable37);
        java.lang.Throwable[] throwableArray39 = iOException38.getSuppressed();
        java.io.IOException iOException40 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException38);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList41 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException5, (java.lang.Throwable) iOException7, (java.lang.Throwable) iOException9, (java.lang.Throwable) iOException14, (java.lang.Throwable) iOException20, (java.lang.Throwable) iOException24, (java.lang.Throwable) iOException27, (java.lang.Throwable) iOException29, (java.lang.Throwable) iOException32, (java.lang.Throwable) iOException38);
        iOException1.addSuppressed((java.lang.Throwable) iOException29);
        java.lang.Throwable throwable44 = null;
        java.io.IOException iOException45 = new java.io.IOException(throwable44);
        java.lang.Throwable[] throwableArray46 = iOException45.getSuppressed();
        java.io.IOException iOException47 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException45);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) iOException47);
        java.lang.Throwable[] throwableArray49 = iOException47.getSuppressed();
        java.io.IOException iOException51 = new java.io.IOException();
        java.io.IOException iOException53 = new java.io.IOException();
        java.io.IOException iOException54 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException53);
        iOException51.addSuppressed((java.lang.Throwable) iOException53);
        java.io.IOException iOException56 = new java.io.IOException("function (): {1568223225}", (java.lang.Throwable) iOException53);
        java.lang.Throwable throwable57 = null;
        java.io.IOException iOException58 = new java.io.IOException(throwable57);
        java.lang.Throwable[] throwableArray59 = iOException58.getSuppressed();
        java.lang.Throwable throwable60 = null;
        java.io.IOException iOException61 = new java.io.IOException(throwable60);
        iOException58.addSuppressed((java.lang.Throwable) iOException61);
        java.lang.Throwable throwable64 = null;
        java.io.IOException iOException65 = new java.io.IOException(throwable64);
        java.lang.Throwable[] throwableArray66 = iOException65.getSuppressed();
        java.io.IOException iOException67 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException65);
        java.lang.Throwable[] throwableArray68 = iOException65.getSuppressed();
        java.io.IOException iOException69 = new java.io.IOException((java.lang.Throwable) iOException65);
        java.io.IOException iOException70 = new java.io.IOException((java.lang.Throwable) iOException69);
        java.lang.Throwable throwable72 = null;
        java.io.IOException iOException73 = new java.io.IOException(throwable72);
        java.lang.Throwable[] throwableArray74 = iOException73.getSuppressed();
        java.io.IOException iOException75 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException73);
        java.lang.Throwable[] throwableArray76 = iOException73.getSuppressed();
        java.io.IOException iOException77 = new java.io.IOException((java.lang.Throwable) iOException73);
        java.lang.Throwable throwable79 = null;
        java.io.IOException iOException80 = new java.io.IOException(throwable79);
        java.lang.Throwable[] throwableArray81 = iOException80.getSuppressed();
        java.io.IOException iOException82 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException80);
        java.lang.Throwable[] throwableArray83 = iOException80.getSuppressed();
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList84 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException1, (java.lang.Throwable) iOException47, (java.lang.Throwable) iOException56, (java.lang.Throwable) iOException58, (java.lang.Throwable) iOException69, (java.lang.Throwable) iOException73, (java.lang.Throwable) iOException80);
        java.io.IOException iOException85 = new java.io.IOException((java.lang.Throwable) iOException58);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableList41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableList84);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01853");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType22.unboxesTo();
        boolean boolean53 = functionType22.matchesStringContext();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01854");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasThisType();
        boolean boolean57 = jSDocInfo55.shouldPreserveTry();
        boolean boolean58 = jSDocInfo55.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo55.getParameterType("[hi!, hi!, , , hi!]");
        int int61 = jSDocInfo55.getExtendedInterfacesCount();
        java.lang.String str62 = jSDocInfo55.getOriginalCommentString();
        boolean boolean63 = jSDocInfo55.isNoTypeCheck();
        parameterizedType48.setPropertyJSDocInfo("function (): {308723303}", jSDocInfo55);
        com.google.javascript.rhino.jstype.UnionType unionType65 = parameterizedType48.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = unionType65.isNoType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSTypeExpression60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(unionType65);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01855");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        int int7 = node1.getLineno();
        boolean boolean8 = node1.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(32, node11);
        boolean boolean16 = node11.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node17 = node1.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean18 = node1.isUnscopedQualifiedName();
        com.google.javascript.rhino.InputId inputId20 = new com.google.javascript.rhino.InputId("NUMBER 0.0 100\n");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        boolean boolean32 = functionType30.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry36.createFunctionType(jSType40, true, jSTypeArray42);
        boolean boolean45 = functionType43.removeProperty("false");
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj58 = node56.getProp((int) (byte) 10);
        boolean boolean59 = node47.isEquivalentToTyped(node56);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(32, node62);
        boolean boolean67 = node66.isInstanceOf();
        com.google.javascript.rhino.Node node68 = node56.useSourceInfoFromForTree(node66);
        boolean boolean69 = node66.isDo();
        boolean boolean70 = functionType30.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType43, node66);
        java.lang.String str71 = functionType43.getReferenceName();
        boolean boolean72 = inputId20.equals((java.lang.Object) str71);
        node1.setInputId(inputId20);
        boolean boolean74 = node1.isVoid();
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01856");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isNot();
        java.lang.String str7 = node1.getQualifiedName();
        java.lang.String str8 = node1.getQualifiedName();
        node1.removeProp(48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01857");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isCall();
        boolean boolean42 = node40.isThrow();
        boolean boolean43 = node40.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = assertionFunctionSpec2.getAssertedType(node40, jSTypeRegistry45);
        jSTypeRegistry45.setLastGeneration(false);
        jSTypeRegistry45.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry58.createFunctionType(jSType62, true, jSTypeArray64);
        boolean boolean67 = functionType65.removeProperty("false");
        boolean boolean68 = functionType65.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry52.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType80.autoboxesTo();
        boolean boolean82 = jSTypeRegistry52.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry45.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType80);
        jSTypeRegistry45.forwardDeclareType("{proxy:function (): {290151067}}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType83);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01858");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.Node node13 = functionType9.getSource();
        boolean boolean14 = functionType9.isEmptyType();
        functionType9.clearResolved();
        boolean boolean16 = functionType9.isNumberObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType9.getCtorExtendedInterfaces();
        boolean boolean18 = functionType9.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01859");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {1341612873}");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "function (): {1341612873}" + "'", str2, "function (): {1341612873}");
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01860");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition8 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isStringKey();
        boolean boolean17 = node12.isThrow();
        com.google.javascript.rhino.Node node18 = node10.useSourceInfoFrom(node12);
        namePosition8.setItem(node10);
        boolean boolean20 = node10.isTry();
        node10.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node25.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node25.getNext();
        boolean boolean29 = node25.isFalse();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean34 = node33.isEmpty();
        node25.addChildrenToBack(node33);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship36 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType7, node10, node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node10);
        com.google.javascript.rhino.Node node38 = node10.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isCall();
        com.google.javascript.rhino.Node node43 = node41.cloneTree();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(35, node43, node46);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node46.getJsDocBuilderForNode();
        node46.setOptionalArg(true);
        boolean boolean51 = node10.hasChild(node46);
        int int52 = node3.getIndexOfChild(node10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + subclassType7 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType7.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01861");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 10, 100, 44);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isWhile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01862");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        com.google.common.collect.UnmodifiableIterator<java.lang.CharSequence> charSequenceItor32 = charSequenceList6.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = functionType54.getParameters();
        boolean boolean61 = charSequenceList6.contains((java.lang.Object) nodeIterable60);
        boolean boolean62 = charSequenceList6.isEmpty();
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor63 = charSequenceList6.listIterator();
        boolean boolean64 = charSequenceList6.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry67.createFunctionType(jSType71, true, jSTypeArray73);
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType74.restrictByNotNullOrUndefined();
        java.lang.String str76 = functionType74.toString();
        int int77 = functionType74.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType74.getCtorImplementedInterfaces();
        java.lang.Iterable iterable79 = functionType74.getCtorExtendedInterfaces();
        int int80 = charSequenceList6.lastIndexOf((java.lang.Object) functionType74);
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType74.getRestrictedTypeGivenToBooleanOutcome(true);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor32);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNull(jSType43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(staticSlot57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(charSequenceItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "function (): ?" + "'", str76, "function (): ?");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNotNull(iterable79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(jSType82);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01863");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean70 = jSTypeRegistry2.hasNamespace("Not declared as a type name");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = jSTypeRegistry2.getEachReferenceTypeWithProperty("(Not declared as a type name)");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative73 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry2.getNativeType(jSTypeNative73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01864");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType9.getImplicitPrototype();
        java.util.Set<java.lang.String> strSet13 = objectType12.getPropertyNames();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator18 = charSequenceList16.spliterator();
        java.lang.Object[] objArray19 = charSequenceList16.toArray();
        boolean boolean20 = strSet13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        java.util.Spliterator<java.lang.String> strSpliterator21 = strSet13.spliterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isIdGenerator();
        java.lang.String str28 = jSDocInfo22.getLendsName();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection29 = jSDocInfo22.getMarkers();
        java.lang.String str30 = jSDocInfo22.getBlockDescription();
        boolean boolean31 = jSDocInfo22.hasModifies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = strSet13.remove((java.lang.Object) jSDocInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.JSDocInfo cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(markerCollection29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01865");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType27.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType27.toObjectType();
        jSTypeRegistry2.registerPropertyOnType("Function", (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isReturn();
        boolean boolean38 = node33.isAssignAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType48.autoboxesTo();
        java.lang.String str50 = functionType48.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = functionType60.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot63 = functionType60.getSlot("NUMBER 0.0 100\n");
        boolean boolean64 = functionType60.isAllType();
        boolean boolean65 = functionType48.hasEqualCallType(functionType60);
        boolean boolean66 = functionType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry2.createObjectType("function (): {480423885}", node33, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNull(staticSlot63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01866");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("Unknown class name");
        boolean boolean13 = functionType9.matchesInt32Context();
        int int14 = functionType9.getPropertiesCount();
        boolean boolean16 = functionType9.hasOwnProperty("{proxy:function (): {2016683788}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01867");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.findPropertyType("false");
        boolean boolean15 = functionType9.isPropertyTypeDeclared("function (): {2068438814}");
        boolean boolean17 = functionType9.isPropertyTypeInferred("function (): {367372378}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType9.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01868");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(32, node16);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoFromForTree(node20);
        boolean boolean23 = node20.isDo();
        boolean boolean24 = node20.isIn();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean29 = node28.isEmpty();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList36 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList39.spliterator();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(32, node44);
        boolean boolean49 = node48.isGetterDef();
        boolean boolean50 = charSequenceList39.equals((java.lang.Object) boolean49);
        boolean boolean52 = charSequenceList39.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean53 = charSequenceList36.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        node55.putIntProp((-1), 35);
        boolean boolean59 = node55.isStringKey();
        boolean boolean60 = node55.isThrow();
        int int61 = charSequenceList36.indexOf((java.lang.Object) node55);
        boolean boolean62 = node28.isEquivalentTo(node55);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        boolean boolean68 = node64.isReturn();
        com.google.javascript.rhino.InputId inputId69 = node64.getInputId();
        node64.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node72 = node28.useSourceInfoIfMissingFrom(node64);
        boolean boolean73 = node64.isGetElem();
        com.google.javascript.rhino.Node node74 = node20.useSourceInfoIfMissingFrom(node64);
        boolean boolean75 = node20.isSetterDef();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(31);
        boolean boolean78 = node77.hasOneChild();
        node20.addChildToFront(node77);
        boolean boolean80 = node20.isVoid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceList36);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01869");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.TemplateType templateType88 = parameterizedType48.toMaybeTemplateType();
        boolean boolean89 = parameterizedType48.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType48.findPropertyType("{proxy:function (): {907975010}}");
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(staticSlot66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(templateType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(jSType91);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01870");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean60 = parameterizedType48.isPropertyTypeDeclared("(function (): {1826660093})");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        boolean boolean72 = functionType70.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        jSTypeRegistry75.unregisterPropertyOnType("(Not declared as a type name)", jSType77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry75.createFunctionType(jSType79, true, jSTypeArray81);
        boolean boolean83 = functionType82.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType70.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType82);
        boolean boolean85 = functionType70.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType70.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = parameterizedType48.testForEquality(jSType86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(jSType86);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01871");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isTry();
        boolean boolean11 = node1.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType12 = node1.getJSType();
        boolean boolean13 = node1.isNull();
        int int14 = node1.getLineno();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01872");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str69 = functionType15.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType79.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType81 = functionType79.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = functionType79.toMaybeFunctionType();
        boolean boolean83 = functionType15.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType79);
        java.lang.String str84 = functionType15.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType85 = functionType15.dereference();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType15.getPropertyType("function (): {360974815}");
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNull(enumType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNotNull(jSType87);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01873");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        com.google.javascript.rhino.InputId inputId5 = null;
        node3.setInputId(inputId5);
        boolean boolean7 = node3.isParamList();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        boolean boolean11 = node10.isCall();
        com.google.javascript.rhino.Node node12 = node10.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(35, node12, node15);
        boolean boolean17 = node16.isComma();
        boolean boolean18 = node16.isWith();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        boolean boolean29 = node23.isEmpty();
        com.google.javascript.rhino.Node node30 = node20.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node31 = node16.useSourceInfoIfMissingFrom(node20);
        com.google.javascript.rhino.Node node32 = node3.useSourceInfoIfMissingFrom(node20);
        node3.setOptionalArg(false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01874");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isArrayLit();
        boolean boolean7 = node1.isQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            node1.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01875");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        java.util.Set<java.lang.String> strSet38 = node4.getDirectives();
        com.google.javascript.rhino.Node node39 = assertionFunctionSpec2.getAssertedParam(node4);
        boolean boolean40 = node4.isDelProp();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01876");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(40, 47, 53);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01877");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node2.setSourceEncodedPositionForTree(54);
        boolean boolean5 = node2.isSetterDef();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isCall();
        boolean boolean9 = node7.isDefaultCase();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        boolean boolean12 = node11.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node11.getStaticSourceFile();
        node11.setLineno((int) '4');
        com.google.javascript.rhino.Node node16 = node7.srcref(node11);
        int int17 = node11.getCharno();
        boolean boolean18 = node11.isComma();
        boolean boolean19 = node11.isDefaultCase();
        boolean boolean20 = node11.isQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node11.children();
        node2.addChildToBack(node11);
        java.lang.String str23 = node2.getQualifiedName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01878");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {2066726531}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01879");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node3.isNE();
        java.lang.String str7 = node3.toString();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        boolean boolean10 = node9.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node9.getStaticSourceFile();
        java.lang.String str12 = node9.getSourceFileName();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node17 = node14.getNext();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        node19.putIntProp((-1), 35);
        boolean boolean23 = node19.isStringKey();
        boolean boolean24 = node19.isThrow();
        boolean boolean25 = node19.isEmpty();
        com.google.javascript.rhino.Node node26 = node14.copyInformationFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isStringKey();
        boolean boolean35 = node30.isThrow();
        com.google.javascript.rhino.Node node36 = node28.useSourceInfoFrom(node30);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        boolean boolean39 = node38.isCall();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node42.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) node14, (java.lang.Object) node30, (java.lang.Object) node38, (java.lang.Object) 53, (java.lang.Object) node42);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        boolean boolean50 = node49.isInstanceOf();
        node42.addChildrenToFront(node49);
        int int52 = node42.getSourceOffset();
        boolean boolean53 = node42.isVoid();
        com.google.javascript.rhino.Node node54 = node9.useSourceInfoIfMissingFrom(node42);
        boolean boolean55 = node42.wasEmptyNode();
        java.lang.Object obj57 = node42.getProp((int) '#');
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node42, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER 2.0 39" + "'", str7, "NUMBER 2.0 39");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01880");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        boolean boolean13 = functionType9.isPropertyTypeInferred("Not declared as a type name");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType14 = functionType9.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = parameterizedType14.isEnumType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterizedType14);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01881");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isReturn();
        com.google.javascript.rhino.Node node20 = node13.srcref(node15);
        boolean boolean21 = node20.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection28 = jSDocInfo22.getMarkers();
        java.util.Collection<java.lang.String> strCollection29 = jSDocInfo22.getAuthors();
        jSDocInfo22.setDeprecated(false);
        node20.setJSDocInfo(jSDocInfo22);
        boolean boolean33 = jSDocInfo22.isHidden();
        jSDocInfo22.addSuppression("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(markerCollection28);
        org.junit.Assert.assertNull(strCollection29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01882");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.Node node13 = functionType9.getSource();
        boolean boolean14 = functionType9.isEmptyType();
        functionType9.clearResolved();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType9.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType29.autoboxesTo();
        java.lang.String str31 = functionType29.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = functionType41.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot44 = functionType41.getSlot("NUMBER 0.0 100\n");
        boolean boolean45 = functionType41.isAllType();
        boolean boolean46 = functionType29.hasEqualCallType(functionType41);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = functionType41.getOwnerFunction();
        java.util.Set<java.lang.String> strSet48 = functionType41.getOwnPropertyNames();
        boolean boolean49 = functionType41.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        boolean boolean60 = functionType59.isReturnTypeInferred();
        boolean boolean61 = functionType59.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = functionType59.getBindReturnType((int) (short) 1);
        java.lang.String str64 = functionType63.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType65 = jSTypeRegistry19.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType41, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        jSTypeRegistry68.unregisterPropertyOnType("(Not declared as a type name)", jSType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        boolean boolean83 = functionType81.removeProperty("false");
        boolean boolean84 = functionType81.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry68.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType81);
        boolean boolean87 = functionType81.hasProperty("(Not declared as a type name)");
        int int88 = functionType81.getPropertiesCount();
        boolean boolean89 = functionType81.isNominalType();
        boolean boolean90 = parameterizedType65.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType81);
        functionType9.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) parameterizedType65);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType92 = parameterizedType65.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(staticSlot44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(functionType47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "function (): ?" + "'", str64, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType65);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(enumElementType92);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01883");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList13 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator18 = charSequenceList16.spliterator();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(32, node21);
        boolean boolean26 = node25.isGetterDef();
        boolean boolean27 = charSequenceList16.equals((java.lang.Object) boolean26);
        boolean boolean29 = charSequenceList16.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean30 = charSequenceList13.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor31 = charSequenceList13.listIterator();
        boolean boolean32 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj45 = node43.getProp((int) (byte) 10);
        boolean boolean46 = node34.isEquivalentToTyped(node43);
        com.google.javascript.rhino.Node node47 = node43.removeChildren();
        int int48 = charSequenceList6.lastIndexOf((java.lang.Object) node43);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator49 = charSequenceList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence52 = charSequenceList6.set(0, (java.lang.CharSequence) "[hi!, , , hi!, hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceList13);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charSequenceItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator49);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01884");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        node5.putIntProp((-1), 35);
        boolean boolean9 = node5.isStringKey();
        boolean boolean10 = node5.isThrow();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFrom(node5);
        namePosition1.setItem(node3);
        boolean boolean13 = node3.isTry();
        node3.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        boolean boolean19 = node18.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = node18.getNext();
        boolean boolean22 = node18.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean27 = node26.isEmpty();
        node18.addChildrenToBack(node26);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node3);
        com.google.javascript.rhino.Node node31 = node3.cloneTree();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node33);
        com.google.javascript.rhino.Node node36 = node31.srcrefTree(node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean41 = node40.isEmpty();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList48 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator53 = charSequenceList51.spliterator();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(32, node56);
        boolean boolean61 = node60.isGetterDef();
        boolean boolean62 = charSequenceList51.equals((java.lang.Object) boolean61);
        boolean boolean64 = charSequenceList51.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean65 = charSequenceList48.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(0);
        node67.putIntProp((-1), 35);
        boolean boolean71 = node67.isStringKey();
        boolean boolean72 = node67.isThrow();
        int int73 = charSequenceList48.indexOf((java.lang.Object) node67);
        boolean boolean74 = node40.isEquivalentTo(node67);
        com.google.javascript.rhino.Node node75 = node67.removeFirstChild();
        boolean boolean76 = node67.isGetProp();
        com.google.javascript.rhino.Node node77 = node33.clonePropsFrom(node67);
        node77.setLineno(46);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node77);
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceList48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01885");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType4 = node3.getJSType();
        com.google.javascript.rhino.InputId inputId5 = node3.getInputId();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isStringKey();
        boolean boolean37 = node32.isThrow();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj43 = node41.getProp((int) (byte) 10);
        boolean boolean44 = node32.isEquivalentToTyped(node41);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(32, node47);
        boolean boolean52 = node51.isInstanceOf();
        com.google.javascript.rhino.Node node53 = node41.useSourceInfoFromForTree(node51);
        boolean boolean54 = node51.isDo();
        boolean boolean55 = functionType15.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType28, node51);
        node3.addChildToBack(node51);
        node3.setSourceEncodedPositionForTree(12);
        com.google.javascript.rhino.Node node59 = node3.getLastSibling();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = node59.getJSDocInfo();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(jSDocInfo60);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01886");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {405212503}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01887");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = functionType33.getOwnerFunction();
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType33.getTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType33.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01888");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 38);
        boolean boolean2 = node1.isNew();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01889");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        functionType9.clearCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        boolean boolean31 = functionType28.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry15.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSType32.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean35 = functionType9.isEquivalentTo(jSType32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType36 = functionType9.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01890");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        int int12 = functionType9.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType9.getCtorImplementedInterfaces();
        boolean boolean14 = functionType9.isEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        boolean boolean32 = functionType30.removeProperty("false");
        boolean boolean33 = functionType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry17.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative46 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec47 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative46);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoFrom(node51);
        boolean boolean58 = node57.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry67.createFunctionType(jSType71, true, jSTypeArray73);
        boolean boolean76 = functionType74.removeProperty("false");
        boolean boolean77 = functionType74.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry61.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.jstype.JSType jSType79 = assertionFunctionSpec47.getAssertedType(node57, jSTypeRegistry61);
        jSTypeRegistry61.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node83 = jSTypeRegistry61.createOptionalParameters(jSTypeArray82);
        com.google.javascript.rhino.Node node84 = jSTypeRegistry37.createOptionalParameters(jSTypeArray82);
        com.google.javascript.rhino.Node node85 = jSTypeRegistry17.createParameters(jSTypeArray82);
        jSTypeRegistry17.forwardDeclareType("function (): {2068438814}");
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry17.createAnonymousObjectType();
        functionType9.matchConstraint(objectType88);
        com.google.javascript.rhino.Node node90 = objectType88.getRootNode();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNull(node90);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01891");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean70 = jSTypeRegistry2.hasNamespace("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        boolean boolean73 = jSTypeRegistry2.declareType("function (): {1685012791}", jSType72);
        jSTypeRegistry2.incrementGeneration();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01892");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isDebugger();
        boolean boolean6 = node1.isNoSideEffectsCall();
        java.lang.Object obj8 = node1.getProp(15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01893");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isInterface();
        java.lang.String str6 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01894");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        boolean boolean4 = node1.isNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = node1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01895");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        boolean boolean4 = node2.isThrow();
        int int5 = node2.getCharno();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node11.isReturn();
        com.google.javascript.rhino.InputId inputId16 = node11.getInputId();
        node11.setWasEmptyNode(true);
        boolean boolean19 = node11.isLabel();
        boolean boolean20 = node11.isTry();
        com.google.javascript.rhino.Node node21 = node7.srcref(node11);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean26 = node25.isTypeOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        boolean boolean30 = node29.isCall();
        boolean boolean31 = node29.isThrow();
        int int32 = node29.getCharno();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(15, node2, node21, node25, node29);
        node29.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node37 = node29.getAncestor(0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01896");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isConstant();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01897");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node2.setSourceEncodedPositionForTree(54);
        boolean boolean5 = node2.isSetterDef();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isCall();
        boolean boolean9 = node7.isDefaultCase();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        boolean boolean12 = node11.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node11.getStaticSourceFile();
        node11.setLineno((int) '4');
        com.google.javascript.rhino.Node node16 = node7.srcref(node11);
        int int17 = node11.getCharno();
        boolean boolean18 = node11.isComma();
        boolean boolean19 = node11.isDefaultCase();
        boolean boolean20 = node11.isQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node11.children();
        node2.addChildToBack(node11);
        boolean boolean23 = node2.isTrue();
        boolean boolean24 = node2.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01898");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {2068438814}", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj15 = node13.getProp((int) (byte) 10);
        boolean boolean16 = node4.isEquivalentToTyped(node13);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        node19.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(32, node19);
        boolean boolean24 = node23.isInstanceOf();
        com.google.javascript.rhino.Node node25 = node13.useSourceInfoFromForTree(node23);
        boolean boolean26 = node23.isDo();
        boolean boolean27 = node23.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType40.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType42 = functionType40.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType40.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry30.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType40);
        jSTypeRegistry30.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        jSTypeRegistry49.unregisterPropertyOnType("(Not declared as a type name)", jSType51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry49.createFunctionType(jSType53, true, jSTypeArray55);
        boolean boolean58 = functionType56.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        jSTypeRegistry62.unregisterPropertyOnType("(Not declared as a type name)", jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType(jSType66, true, jSTypeArray68);
        boolean boolean71 = functionType69.removeProperty("false");
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        boolean boolean77 = node73.isStringKey();
        boolean boolean78 = node73.isThrow();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj84 = node82.getProp((int) (byte) 10);
        boolean boolean85 = node73.isEquivalentToTyped(node82);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(0);
        node88.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(32, node88);
        boolean boolean93 = node92.isInstanceOf();
        com.google.javascript.rhino.Node node94 = node82.useSourceInfoFromForTree(node92);
        boolean boolean95 = node92.isDo();
        boolean boolean96 = functionType56.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType69, node92);
        jSTypeRegistry30.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.JSType jSType98 = assertionFunctionSpec2.getAssertedType(node23, jSTypeRegistry30);
        boolean boolean99 = node23.isAdd();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNull(enumType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01899");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = jSDocInfo0.getVisibility();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(visibility5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01900");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType9.getImplicitPrototype();
        java.util.Set<java.lang.String> strSet13 = objectType12.getPropertyNames();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator18 = charSequenceList16.spliterator();
        java.lang.Object[] objArray19 = charSequenceList16.toArray();
        boolean boolean20 = strSet13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        charSequenceList16.clear();
        com.google.common.collect.ImmutableList<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionList22 = com.google.common.collect.ImmutableList.of((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor23 = charSequenceList16.iterator();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList30 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList33 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator35 = charSequenceList33.spliterator();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(32, node38);
        boolean boolean43 = node42.isGetterDef();
        boolean boolean44 = charSequenceList33.equals((java.lang.Object) boolean43);
        boolean boolean46 = charSequenceList33.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean47 = charSequenceList30.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isStringKey();
        boolean boolean54 = node49.isThrow();
        int int55 = charSequenceList30.indexOf((java.lang.Object) node49);
        java.lang.Object[] objArray56 = charSequenceList30.toArray();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList57 = charSequenceList30.asList();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj63 = node61.getProp((int) (byte) 10);
        int int64 = node61.getSourcePosition();
        boolean boolean65 = charSequenceList57.contains((java.lang.Object) node61);
        boolean boolean66 = charSequenceList16.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList57.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charSequenceCollectionList22);
        org.junit.Assert.assertNotNull(charSequenceItor23);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceList30);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceList57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 409700 + "'", int64 == 409700);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01901");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable11 = jSTypeRegistry2.getEachReferenceTypeWithProperty("NUMBER 0.0 100\n");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode12 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode13 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode15 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList16 = com.google.common.collect.ImmutableList.of(resolveMode12, resolveMode13, resolveMode14, resolveMode15);
        jSTypeRegistry2.setResolveMode(resolveMode12);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType.Property property20 = objectType18.getSlot("function (): {548870186}");
        boolean boolean21 = objectType18.matchesObjectContext();
        boolean boolean22 = objectType18.isNumberValueType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertTrue("'" + resolveMode12 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode12.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode13 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode13.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode14 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode14.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode15 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode15.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList16);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01902");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node15 = node12.getNext();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        boolean boolean23 = node17.isEmpty();
        com.google.javascript.rhino.Node node24 = node12.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        node28.putIntProp((-1), 35);
        boolean boolean32 = node28.isStringKey();
        boolean boolean33 = node28.isThrow();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isCall();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        node40.putIntProp((-1), 35);
        boolean boolean44 = node40.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList45 = com.google.common.collect.ImmutableList.of((java.lang.Object) node12, (java.lang.Object) node28, (java.lang.Object) node36, (java.lang.Object) 53, (java.lang.Object) node40);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship46 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node10, node40);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj52 = node50.getProp((int) (byte) 10);
        boolean boolean53 = node50.isGetProp();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative55 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec56 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative55);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile60 = node58.getStaticSourceFile();
        com.google.javascript.rhino.Node node61 = node58.getNext();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        node63.putIntProp((-1), 35);
        boolean boolean67 = node63.isStringKey();
        boolean boolean68 = node63.isThrow();
        boolean boolean69 = node63.isEmpty();
        com.google.javascript.rhino.Node node70 = node58.copyInformationFrom(node63);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0);
        node74.putIntProp((-1), 35);
        boolean boolean78 = node74.isStringKey();
        boolean boolean79 = node74.isThrow();
        com.google.javascript.rhino.Node node80 = node72.useSourceInfoFrom(node74);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(0);
        boolean boolean83 = node82.isCall();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(0);
        node86.putIntProp((-1), 35);
        boolean boolean90 = node86.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList91 = com.google.common.collect.ImmutableList.of((java.lang.Object) node58, (java.lang.Object) node74, (java.lang.Object) node82, (java.lang.Object) 53, (java.lang.Object) node86);
        com.google.javascript.rhino.Node node92 = assertionFunctionSpec56.getAssertedParam(node86);
        com.google.javascript.rhino.Node node93 = node50.copyInformationFromForTree(node86);
        com.google.javascript.rhino.Node node94 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship95 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node86, node94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objList45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(staticSourceFile60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objList91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01903");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        boolean boolean12 = objectType11.isFunctionPrototypeType();
        boolean boolean13 = objectType11.isDateType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = objectType11.getOwnSlot("function (): {1685012791}");
        com.google.javascript.rhino.Node node16 = objectType11.getRootNode();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01904");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = functionType21.getOwnPropertyJSDocInfo("function (): {2068438814}");
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getReturnType();
        int int30 = functionType21.getMaxArguments();
        boolean boolean31 = functionType21.isUnknownType();
        boolean boolean32 = functionType21.hasReferenceName();
        boolean boolean33 = functionType21.isNumber();
        boolean boolean34 = functionType21.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01905");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        boolean boolean50 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.jstype.TemplateType templateType52 = parameterizedType48.toMaybeTemplateType();
        boolean boolean53 = parameterizedType48.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNull(templateType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01906");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        java.lang.Iterable iterable12 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType9, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = objectType14.getNormalizedReferenceName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertNotNull(iterable12);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01907");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node40.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = node40.getNext();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        boolean boolean51 = node45.isEmpty();
        com.google.javascript.rhino.Node node52 = node40.copyInformationFrom(node45);
        boolean boolean53 = node52.isGetProp();
        boolean boolean54 = node52.isThrow();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        jSTypeRegistry57.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType60 = assertionFunctionSpec2.getAssertedType(node52, jSTypeRegistry57);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable61 = node52.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor62 = ancestorIterable61.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertNotNull(ancestorIterable61);
        org.junit.Assert.assertNotNull(nodeItor62);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01908");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean56 = parameterizedType48.isPropertyTypeDeclared("function (): {367372378}");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("true");
        boolean boolean60 = parameterizedType48.isPropertyInExterns("function (): {360974815}");
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01909");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: ", throwable1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList3 = com.google.common.collect.ImmutableList.of(throwable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01910");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node1);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        node5.putIntProp((-1), 35);
        boolean boolean9 = node5.isReturn();
        com.google.javascript.rhino.InputId inputId10 = node5.getInputId();
        node5.setWasEmptyNode(true);
        boolean boolean13 = node5.isLabel();
        boolean boolean14 = node5.isTry();
        com.google.javascript.rhino.Node node15 = node1.srcref(node5);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        int int23 = node17.getLineno();
        boolean boolean24 = node17.hasChildren();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(32, node27);
        boolean boolean32 = node27.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node33 = node17.useSourceInfoIfMissingFromForTree(node27);
        boolean boolean34 = node5.hasChild(node17);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isInstanceOf();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        boolean boolean45 = node39.isEmpty();
        com.google.javascript.rhino.Node node46 = node36.useSourceInfoFrom(node39);
        boolean boolean47 = node39.isNE();
        boolean boolean48 = node39.isCall();
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        boolean boolean56 = node52.isStringKey();
        boolean boolean57 = node52.isThrow();
        int int58 = node52.getLineno();
        boolean boolean59 = node52.hasChildren();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        boolean boolean65 = node52.hasChild(node61);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(0);
        boolean boolean68 = node67.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile69 = node67.getStaticSourceFile();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0, node61, node67, node73);
        com.google.javascript.rhino.Node node75 = node39.useSourceInfoFromForTree(node61);
        boolean boolean76 = node61.wasEmptyNode();
        com.google.javascript.rhino.InputId inputId77 = com.google.javascript.jscomp.NodeUtil.getInputId(node61);
        int int78 = node5.getIndexOfChild(node61);
        com.google.javascript.rhino.Node node79 = node5.removeChildren();
        node5.addSuppression("function (): {2140273663}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(staticSourceFile69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(inputId77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNull(node79);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01911");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj5 = node3.getProp((int) (byte) 10);
        boolean boolean6 = node3.isGetProp();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative8 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec9 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative8);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        boolean boolean12 = node11.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node11.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node11.getNext();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        boolean boolean20 = node16.isStringKey();
        boolean boolean21 = node16.isThrow();
        boolean boolean22 = node16.isEmpty();
        com.google.javascript.rhino.Node node23 = node11.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isCall();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList44 = com.google.common.collect.ImmutableList.of((java.lang.Object) node11, (java.lang.Object) node27, (java.lang.Object) node35, (java.lang.Object) 53, (java.lang.Object) node39);
        com.google.javascript.rhino.Node node45 = assertionFunctionSpec9.getAssertedParam(node39);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFromForTree(node39);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoFrom(node51);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        node51.setJSType(jSType58);
        node51.detachChildren();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj66 = node64.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(0);
        node70.putIntProp((-1), 35);
        boolean boolean74 = node70.isStringKey();
        boolean boolean75 = node70.isThrow();
        com.google.javascript.rhino.Node node76 = node68.useSourceInfoFrom(node70);
        boolean boolean77 = node76.isIn();
        com.google.javascript.rhino.Node node78 = node64.clonePropsFrom(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0);
        boolean boolean81 = node80.isInstanceOf();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(0);
        node83.putIntProp((-1), 35);
        boolean boolean87 = node83.isStringKey();
        boolean boolean88 = node83.isThrow();
        boolean boolean89 = node83.isEmpty();
        com.google.javascript.rhino.Node node90 = node80.useSourceInfoFrom(node83);
        boolean boolean91 = node83.isNE();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(31, node51, node64, node83);
        boolean boolean93 = node51.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node94 = node39.useSourceInfoIfMissingFromForTree(node51);
        com.google.javascript.rhino.jstype.JSType jSType95 = node51.getJSType();
        java.lang.String str96 = node51.getQualifiedName();
        boolean boolean97 = node51.isReturn();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node98 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objList44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNull(jSType95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01912");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType21.getOwnerFunction();
        java.util.Set<java.lang.String> strSet28 = functionType21.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getTypeOfThis();
        boolean boolean31 = functionType21.isPropertyTypeDeclared("hi!");
        java.lang.String str32 = functionType21.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType21.findPropertyType("function (): {1120480319}");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        boolean boolean59 = functionType57.removeProperty("false");
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        boolean boolean65 = node61.isStringKey();
        boolean boolean66 = node61.isThrow();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj72 = node70.getProp((int) (byte) 10);
        boolean boolean73 = node61.isEquivalentToTyped(node70);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(0);
        node76.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(32, node76);
        boolean boolean81 = node80.isInstanceOf();
        com.google.javascript.rhino.Node node82 = node70.useSourceInfoFromForTree(node80);
        boolean boolean83 = node80.isDo();
        boolean boolean84 = functionType44.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType57, node80);
        java.lang.Iterable iterable85 = functionType44.getCtorExtendedInterfaces();
        boolean boolean86 = functionType44.isBooleanValueType();
        boolean boolean87 = functionType44.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType44, "function (): {2068438814}");
        functionType21.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType44);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable91 = functionType21.getExtendedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(functionType27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(iterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(objectType89);
        org.junit.Assert.assertNotNull(objectTypeIterable91);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01913");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node5.getStaticSourceFile();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.Node node10 = node1.srcref(node5);
        int int11 = node5.getCharno();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        boolean boolean14 = node13.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node13.getStaticSourceFile();
        com.google.javascript.rhino.Node node16 = node13.getNext();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        node18.putIntProp((-1), 35);
        boolean boolean22 = node18.isStringKey();
        boolean boolean23 = node18.isThrow();
        boolean boolean24 = node18.isEmpty();
        com.google.javascript.rhino.Node node25 = node13.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isStringKey();
        boolean boolean34 = node29.isThrow();
        com.google.javascript.rhino.Node node35 = node27.useSourceInfoFrom(node29);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isCall();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        boolean boolean45 = node41.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList46 = com.google.common.collect.ImmutableList.of((java.lang.Object) node13, (java.lang.Object) node29, (java.lang.Object) node37, (java.lang.Object) 53, (java.lang.Object) node41);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        boolean boolean49 = node48.isInstanceOf();
        node41.addChildrenToFront(node48);
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getSourceName(node48);
        boolean boolean52 = node48.isArrayLit();
        com.google.javascript.rhino.Node node53 = node5.copyInformationFromForTree(node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        boolean boolean56 = node55.isInstanceOf();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        boolean boolean64 = node58.isEmpty();
        com.google.javascript.rhino.Node node65 = node55.useSourceInfoFrom(node58);
        boolean boolean66 = node58.isNE();
        boolean boolean67 = node58.isCall();
        boolean boolean68 = node58.isNew();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        boolean boolean75 = node71.isStringKey();
        boolean boolean76 = node71.isThrow();
        int int77 = node71.getLineno();
        boolean boolean78 = node71.hasChildren();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0);
        node80.putIntProp((-1), 35);
        boolean boolean84 = node71.hasChild(node80);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(0);
        boolean boolean87 = node86.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile88 = node86.getStaticSourceFile();
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(0, node80, node86, node92);
        com.google.javascript.rhino.Node node94 = node58.useSourceInfoFromForTree(node80);
        boolean boolean95 = node58.isQualifiedName();
        com.google.javascript.rhino.Node node96 = node48.srcrefTree(node58);
        boolean boolean97 = node96.hasMoreThanOneChild();
        boolean boolean99 = node96.getBooleanProp(4095);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(staticSourceFile88);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01914");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType9.getReturnType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType9.getCtorImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        boolean boolean47 = functionType44.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry31.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry51.createFunctionType(jSType55, true, jSTypeArray57);
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType58.autoboxesTo();
        java.lang.String str60 = functionType58.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        com.google.common.collect.ImmutableList<java.lang.String> strList71 = functionType70.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot73 = functionType70.getSlot("NUMBER 0.0 100\n");
        boolean boolean74 = functionType70.isAllType();
        boolean boolean75 = functionType58.hasEqualCallType(functionType70);
        boolean boolean76 = functionType44.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        jSTypeRegistry79.unregisterPropertyOnType("(Not declared as a type name)", jSType81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry79.createFunctionType(jSType83, true, jSTypeArray85);
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType86.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType88 = functionType86.toObjectType();
        boolean boolean89 = objectType88.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet90 = objectType88.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType92 = objectType88.getPropertyType("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair93 = functionType44.getTypesUnderEquality(jSType92);
        com.google.javascript.rhino.jstype.JSType jSType94 = typePair93.typeB;
        com.google.javascript.rhino.jstype.JSType jSType95 = typePair93.typeA;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType9.getTypesUnderShallowEquality(jSType95);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType98 = functionType9.getTopMostDefiningType("Not declared as a constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNull(staticSlot73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet90 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet90.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType92);
        org.junit.Assert.assertNotNull(typePair93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(typePair96);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01915");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType9.getBindReturnType((int) (short) 1);
        functionType13.clearCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01916");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("function ");
        stringPosition0.setItem("{proxy:function (): {374905701}}");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(15, 51, (int) (short) 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 15?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01917");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean5 = node4.isTypeOf();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(31, node4);
        com.google.javascript.rhino.Node node7 = node6.removeChildren();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj20 = node18.getProp((int) (byte) 10);
        boolean boolean21 = node9.isEquivalentToTyped(node18);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        node24.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(32, node24);
        boolean boolean29 = node28.isInstanceOf();
        com.google.javascript.rhino.Node node30 = node18.useSourceInfoFromForTree(node28);
        boolean boolean31 = node18.isExprResult();
        boolean boolean32 = node18.isIn();
        com.google.javascript.rhino.Node node33 = node6.clonePropsFrom(node18);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isInstanceOf();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isStringKey();
        boolean boolean43 = node38.isThrow();
        boolean boolean44 = node38.isEmpty();
        com.google.javascript.rhino.Node node45 = node35.useSourceInfoFrom(node38);
        boolean boolean46 = node45.isVar();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        boolean boolean49 = node48.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node48.getStaticSourceFile();
        node48.setLineno((int) '4');
        com.google.javascript.rhino.Node node53 = node45.useSourceInfoIfMissingFrom(node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isStringKey();
        boolean boolean62 = node57.isThrow();
        com.google.javascript.rhino.Node node63 = node55.useSourceInfoFrom(node57);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        boolean boolean67 = node66.isCall();
        com.google.javascript.rhino.Node node68 = node66.cloneTree();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(35, node68, node71);
        com.google.javascript.rhino.Node node73 = node55.copyInformationFrom(node68);
        com.google.javascript.rhino.Node node74 = node53.useSourceInfoIfMissingFrom(node73);
        java.lang.String str75 = node53.getSourceFileName();
        node53.setWasEmptyNode(true);
        node33.addChildrenToBack(node53);
        boolean boolean79 = node53.isGetElem();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01918");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function (): {726684091}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function (): {726684091})" + "'", str1, "(function (): {726684091})");
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01919");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue1.not();
        java.lang.String str3 = ternaryValue1.toString();
        boolean boolean5 = ternaryValue1.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue6.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList15 = com.google.common.collect.ImmutableList.of(ternaryValue0, ternaryValue1, ternaryValue7, ternaryValue8, ternaryValue13, ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue7.not();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false" + "'", str3, "false");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValueList15);
        org.junit.Assert.assertNotNull(ternaryValue16);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01920");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator20 = charSequenceList18.spliterator();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        boolean boolean28 = node27.isGetterDef();
        boolean boolean29 = charSequenceList18.equals((java.lang.Object) boolean28);
        boolean boolean31 = charSequenceList18.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean32 = charSequenceList15.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList15.asList();
        node1.putProp(49, (java.lang.Object) charSequenceList33);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList35 = charSequenceList33.asList();
        boolean boolean36 = charSequenceList35.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence39 = charSequenceList35.set(46, (java.lang.CharSequence) "function (): {697129060}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01921");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str7 = jSDocInfo0.getDescription();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01922");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        boolean boolean14 = node13.isCall();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(35, node15, node18);
        boolean boolean20 = node19.isComma();
        boolean boolean21 = node19.isWith();
        boolean boolean22 = node19.isStringKey();
        com.google.javascript.rhino.Node node23 = node3.srcref(node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node34 = node3.srcref(node25);
        int int35 = node25.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01923");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setMutatesGlobalState();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        boolean boolean4 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setReturnsTainted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01924");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean37 = functionType35.removeProperty("false");
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj50 = node48.getProp((int) (byte) 10);
        boolean boolean51 = node39.isEquivalentToTyped(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(32, node54);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoFromForTree(node58);
        boolean boolean61 = node58.isDo();
        boolean boolean62 = functionType22.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType35, node58);
        boolean boolean63 = functionType35.isUnknownType();
        java.util.Set<java.lang.String> strSet64 = functionType35.getPropertyNames();
        node8.setJSType((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean66 = functionType35.isEmptyType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate67 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType35.setValidator(jSTypePredicate67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01925");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        boolean boolean4 = node3.isAssignAdd();
        boolean boolean5 = node3.isFalse();
        boolean boolean6 = node3.hasMoreThanOneChild();
        boolean boolean7 = node3.isLabelName();
        node3.putBooleanProp((int) ' ', false);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node15 = node12.getNext();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        boolean boolean23 = node17.isEmpty();
        com.google.javascript.rhino.Node node24 = node12.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isReturn();
        com.google.javascript.rhino.Node node31 = node24.srcref(node26);
        boolean boolean32 = node31.isOr();
        boolean boolean33 = node31.isCatch();
        node31.setSourceFileForTesting("function (): {405212503}");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node31);
        node3.setStaticSourceFile(staticSourceFile36);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = staticSourceFile36.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not call getLineOffset with line number 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(staticSourceFile36);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01926");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        jSTypeRegistry29.unregisterPropertyOnType("(Not declared as a type name)", jSType31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType(jSType33, true, jSTypeArray35);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType36.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot39 = functionType36.getSlot("NUMBER 0.0 100\n");
        boolean boolean40 = functionType36.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        boolean boolean52 = functionType50.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.findPropertyType("Not declared as a type name");
        boolean boolean55 = functionType36.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType50);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType50.getImplementedInterfaces();
        boolean boolean57 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node58 = functionType9.getParametersNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType9.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType9.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(staticSlot39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(functionType60);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01927");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative31);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoFrom(node36);
        boolean boolean43 = node42.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        jSTypeRegistry46.unregisterPropertyOnType("(Not declared as a type name)", jSType48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        boolean boolean61 = functionType59.removeProperty("false");
        boolean boolean62 = functionType59.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry46.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec32.getAssertedType(node42, jSTypeRegistry46);
        jSTypeRegistry46.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node68 = jSTypeRegistry46.createOptionalParameters(jSTypeArray67);
        com.google.javascript.rhino.Node node69 = jSTypeRegistry22.createOptionalParameters(jSTypeArray67);
        com.google.javascript.rhino.Node node70 = jSTypeRegistry2.createParameters(jSTypeArray67);
        jSTypeRegistry2.forwardDeclareType("function (): {2068438814}");
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.identifyNonNullableName("NUMBER 0.0 100\n");
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(objectType73);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01928");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.hasReferenceName();
        com.google.javascript.rhino.Node node12 = functionType9.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType27 = functionType25.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType25.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry15.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType25);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        jSTypeRegistry45.unregisterPropertyOnType("(Not declared as a type name)", jSType47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry45.createFunctionType(jSType49, true, jSTypeArray51);
        boolean boolean54 = functionType52.removeProperty("false");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isStringKey();
        boolean boolean61 = node56.isThrow();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj67 = node65.getProp((int) (byte) 10);
        boolean boolean68 = node56.isEquivalentToTyped(node65);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(32, node71);
        boolean boolean76 = node75.isInstanceOf();
        com.google.javascript.rhino.Node node77 = node65.useSourceInfoFromForTree(node75);
        boolean boolean78 = node75.isDo();
        boolean boolean79 = functionType39.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType52, node75);
        boolean boolean80 = functionType52.isUnknownType();
        java.util.Set<java.lang.String> strSet81 = functionType52.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry15.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType52, "Named type with empty name component");
        boolean boolean84 = functionType9.isSubtype(jSType83);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSType83.getRestrictedTypeGivenToBooleanOutcome(false);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNull(enumType27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jSType86);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01929");
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder1 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder2 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList3 = com.google.common.collect.ImmutableList.of(strArrayBuilder0, strArrayBuilder1, strArrayBuilder2);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder4 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder5 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder6 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList7 = com.google.common.collect.ImmutableList.of(strArrayBuilder4, strArrayBuilder5, strArrayBuilder6);
        java.lang.String[] strArray11 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray15 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray19 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray23 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray27 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray11, strArray15, strArray19, strArray23, strArray27 };
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder29 = strArrayBuilder5.add(strArray28);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder30 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder31 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder32 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList33 = com.google.common.collect.ImmutableList.of(strArrayBuilder30, strArrayBuilder31, strArrayBuilder32);
        java.lang.String[] strArray37 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray41 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray45 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray49 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[] strArray53 = new java.lang.String[] { "InputId: NUMBER 0.0 100\n", "function (): {1442205556}", "NUMBER 0.0" };
        java.lang.String[][] strArray54 = new java.lang.String[][] { strArray37, strArray41, strArray45, strArray49, strArray53 };
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder55 = strArrayBuilder31.add(strArray54);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder56 = strArrayBuilder5.add(strArray54);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder57 = strArrayBuilder0.add(strArray54);
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList58 = strArrayBuilder0.build();
        org.junit.Assert.assertNotNull(strArrayBuilder0);
        org.junit.Assert.assertNotNull(strArrayBuilder1);
        org.junit.Assert.assertNotNull(strArrayBuilder2);
        org.junit.Assert.assertNotNull(strArrayBuilderList3);
        org.junit.Assert.assertNotNull(strArrayBuilder4);
        org.junit.Assert.assertNotNull(strArrayBuilder5);
        org.junit.Assert.assertNotNull(strArrayBuilder6);
        org.junit.Assert.assertNotNull(strArrayBuilderList7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArrayBuilder29);
        org.junit.Assert.assertNotNull(strArrayBuilder30);
        org.junit.Assert.assertNotNull(strArrayBuilder31);
        org.junit.Assert.assertNotNull(strArrayBuilder32);
        org.junit.Assert.assertNotNull(strArrayBuilderList33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArrayBuilder55);
        org.junit.Assert.assertNotNull(strArrayBuilder56);
        org.junit.Assert.assertNotNull(strArrayBuilder57);
        org.junit.Assert.assertNotNull(strArrayList58);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01930");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node4.isNE();
        boolean boolean13 = node4.isCall();
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        int int23 = node17.getLineno();
        boolean boolean24 = node17.hasChildren();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node17.hasChild(node26);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node32.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0, node26, node32, node38);
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.Node node42 = node4.getAncestor(0);
        node4.setOptionalArg(true);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        boolean boolean47 = node46.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node46.getStaticSourceFile();
        com.google.javascript.rhino.Node node49 = node46.getNext();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        boolean boolean57 = node51.isEmpty();
        com.google.javascript.rhino.Node node58 = node46.copyInformationFrom(node51);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        boolean boolean64 = node60.isReturn();
        com.google.javascript.rhino.Node node65 = node58.srcref(node60);
        boolean boolean66 = node65.isOr();
        boolean boolean67 = node65.isCatch();
        java.lang.String str68 = node65.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node69 = node4.removeChildAfter(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(staticSourceFile34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(staticSourceFile48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01931");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node7 = node3.getAncestor(54);
        int int8 = node3.getCharno();
        node3.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = node3.useSourceInfoFrom(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01932");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        boolean boolean6 = jSTypeExpression5.isVarArgs();
        boolean boolean7 = jSTypeExpression5.isVarArgs();
        com.google.javascript.rhino.Node node8 = jSTypeExpression5.getRoot();
        boolean boolean9 = jSTypeExpression5.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01933");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = functionType33.getOwnerFunction();
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType33.getTemplateTypeNames();
        functionType33.clearResolved();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType33.getImplementedInterfaces();
        boolean boolean67 = functionType33.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01934");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01935");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isCall();
        boolean boolean9 = node7.isThrow();
        boolean boolean10 = node7.isExprResult();
        boolean boolean11 = strSet5.equals((java.lang.Object) node7);
        boolean boolean12 = strSet5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01936");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isArrayLit();
        boolean boolean11 = node1.isDefaultCase();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01937");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean60 = parameterizedType48.isPropertyTypeDeclared("(function (): {1826660093})");
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType48.collapseUnion();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType61);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01938");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue3.not();
        java.lang.String str5 = ternaryValue3.toString();
        boolean boolean7 = ternaryValue3.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList17 = com.google.common.collect.ImmutableList.of(ternaryValue2, ternaryValue3, ternaryValue9, ternaryValue10, ternaryValue15, ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue1.xor(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue0.or(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "false" + "'", str5, "false");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValueList17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01939");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.asList();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream25 = charSequenceList6.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = charSequenceList6.add((java.lang.CharSequence) "function (): {1535634566}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertNotNull(charSequenceStream25);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01940");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.String str50 = functionType22.getReferenceName();
        boolean boolean51 = functionType22.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType22.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.ObjectType.Property property55 = functionType22.getSlot("function (): {1568223225}");
        boolean boolean56 = functionType22.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(property55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01941");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.hasImplementedInterfaces();
        boolean boolean52 = functionType22.hasCachedValues();
        java.lang.String str53 = functionType22.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType22.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry58.createFunctionType(jSType62, true, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType.Property property68 = functionType65.getOwnSlot("Named type with empty name component");
        boolean boolean69 = functionType65.isEmptyType();
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType65.getReturnType();
        com.google.javascript.rhino.jstype.JSType jSType71 = jSType55.getLeastSupertype(jSType70);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNull(property68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(jSType71);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01942");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isTry();
        node1.setWasEmptyNode(true);
        node1.setCharno((int) (byte) 100);
        node1.setLength(0);
        node1.setSourceEncodedPositionForTree(36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01943");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        com.google.javascript.rhino.Node node51 = functionType22.getPropertyNode("java.io.IOException");
        java.lang.String str52 = functionType22.toDebugHashCodeString();
        boolean boolean54 = functionType22.hasOwnProperty("");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType22.getBindReturnType(37);
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType56.getTypeOfThis();
        com.google.javascript.rhino.jstype.UnionType unionType58 = functionType56.toMaybeUnionType();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType56.getPropertyType("function (): {367372378}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = functionType56.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(node51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {1251710684}" + "'", str52, "function (): {1251710684}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNull(unionType58);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNull(jSDocInfo61);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01944");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01945");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str69 = functionType15.getNormalizedReferenceName();
        boolean boolean70 = functionType15.isNoResolvedType();
        boolean boolean71 = functionType15.canBeCalled();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = functionType15.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        jSTypeRegistry75.unregisterPropertyOnType("(Not declared as a type name)", jSType77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry75.createFunctionType(jSType79, true, jSTypeArray81);
        com.google.common.collect.ImmutableList<java.lang.String> strList83 = functionType82.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot85 = functionType82.getSlot("NUMBER 0.0 100\n");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = functionType82.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = booleanLiteralSet72.intersection(booleanLiteralSet86);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean91 = booleanLiteralSet89.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet93 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet94 = booleanLiteralSet89.intersection(booleanLiteralSet93);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet95 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet96 = booleanLiteralSet94.union(booleanLiteralSet95);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet97 = booleanLiteralSet86.union(booleanLiteralSet96);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(staticSlot85);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet93 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet93.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet94 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet94.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet95 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet95.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet96 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet96.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet97 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet97.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01946");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasThisType();
        boolean boolean6 = jSDocInfo4.shouldPreserveTry();
        boolean boolean7 = jSDocInfo4.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo4.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo9.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = null;
        jSDocInfo9.setVisibility(visibility12);
        boolean boolean14 = jSDocInfo9.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo15.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        jSDocInfo15.setVisibility(visibility18);
        boolean boolean20 = jSDocInfo15.isExport();
        java.lang.String str21 = jSDocInfo15.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList28 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo2, jSDocInfo3, jSDocInfo4, jSDocInfo9, jSDocInfo15, jSDocInfo22);
        java.lang.String str29 = jSDocInfo22.toString();
        boolean boolean30 = jSDocInfo22.isInterface();
        int int31 = jSDocInfo22.getParameterCount();
        java.lang.String str32 = jSDocInfo22.getFileOverview();
        boolean boolean33 = jSDocInfo22.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JSDocInfo" + "'", str29, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01947");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType9.getBindReturnType((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType9.getImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        boolean boolean26 = functionType24.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        boolean boolean39 = functionType37.removeProperty("false");
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        boolean boolean45 = node41.isStringKey();
        boolean boolean46 = node41.isThrow();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj52 = node50.getProp((int) (byte) 10);
        boolean boolean53 = node41.isEquivalentToTyped(node50);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(32, node56);
        boolean boolean61 = node60.isInstanceOf();
        com.google.javascript.rhino.Node node62 = node50.useSourceInfoFromForTree(node60);
        boolean boolean63 = node60.isDo();
        boolean boolean64 = functionType24.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType37, node60);
        boolean boolean65 = functionType9.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.ObjectType.Property property67 = functionType9.getSlot("function (): {348645273}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType9.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(property67);
        org.junit.Assert.assertNotNull(objectTypeIterable68);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01948");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(47);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01949");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        boolean boolean15 = functionType9.hasProperty("Not declared as a type name");
        boolean boolean17 = functionType9.isPropertyInExterns("function (): {1568223225}");
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = functionType9.getTemplateTypeNames();
        int int19 = functionType9.getMinArguments();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = functionType9.getParameters();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeIterable20);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01950");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean70 = jSTypeRegistry2.hasNamespace("Not declared as a type name");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = jSTypeRegistry2.getEachReferenceTypeWithProperty("(Not declared as a type name)");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative73 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry2.getNativeObjectType(jSTypeNative73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01951");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        namePosition0.setItem(node2);
        int int12 = namePosition0.getPositionOnStartLine();
        int int13 = namePosition0.getStartLine();
        int int14 = namePosition0.getPositionOnEndLine();
        int int15 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 10, (int) (short) -1, 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01952");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException(throwable1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException(throwable6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException13 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable throwable16 = null;
        java.io.IOException iOException17 = new java.io.IOException(throwable16);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        iOException17.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable throwable22 = null;
        java.io.IOException iOException23 = new java.io.IOException(throwable22);
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException();
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        iOException23.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray28 = iOException26.getSuppressed();
        java.lang.Throwable throwable29 = null;
        java.io.IOException iOException30 = new java.io.IOException(throwable29);
        java.lang.Throwable[] throwableArray31 = iOException30.getSuppressed();
        java.io.IOException iOException33 = new java.io.IOException("");
        java.io.IOException iOException35 = new java.io.IOException("");
        java.lang.Throwable throwable37 = null;
        java.io.IOException iOException38 = new java.io.IOException(throwable37);
        java.lang.Throwable[] throwableArray39 = iOException38.getSuppressed();
        java.io.IOException iOException40 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException38);
        java.lang.Throwable[] throwableArray41 = iOException38.getSuppressed();
        java.lang.Throwable throwable43 = null;
        java.io.IOException iOException44 = new java.io.IOException(throwable43);
        java.lang.Throwable[] throwableArray45 = iOException44.getSuppressed();
        java.io.IOException iOException46 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException44);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList47 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException11, (java.lang.Throwable) iOException13, (java.lang.Throwable) iOException15, (java.lang.Throwable) iOException20, (java.lang.Throwable) iOException26, (java.lang.Throwable) iOException30, (java.lang.Throwable) iOException33, (java.lang.Throwable) iOException35, (java.lang.Throwable) iOException38, (java.lang.Throwable) iOException44);
        iOException7.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.Throwable throwable50 = null;
        java.io.IOException iOException51 = new java.io.IOException(throwable50);
        java.lang.Throwable[] throwableArray52 = iOException51.getSuppressed();
        java.io.IOException iOException53 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException51);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException53);
        java.lang.Throwable[] throwableArray55 = iOException53.getSuppressed();
        java.io.IOException iOException57 = new java.io.IOException();
        java.io.IOException iOException59 = new java.io.IOException();
        java.io.IOException iOException60 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException59);
        iOException57.addSuppressed((java.lang.Throwable) iOException59);
        java.io.IOException iOException62 = new java.io.IOException("function (): {1568223225}", (java.lang.Throwable) iOException59);
        java.lang.Throwable throwable63 = null;
        java.io.IOException iOException64 = new java.io.IOException(throwable63);
        java.lang.Throwable[] throwableArray65 = iOException64.getSuppressed();
        java.lang.Throwable throwable66 = null;
        java.io.IOException iOException67 = new java.io.IOException(throwable66);
        iOException64.addSuppressed((java.lang.Throwable) iOException67);
        java.lang.Throwable throwable70 = null;
        java.io.IOException iOException71 = new java.io.IOException(throwable70);
        java.lang.Throwable[] throwableArray72 = iOException71.getSuppressed();
        java.io.IOException iOException73 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException71);
        java.lang.Throwable[] throwableArray74 = iOException71.getSuppressed();
        java.io.IOException iOException75 = new java.io.IOException((java.lang.Throwable) iOException71);
        java.io.IOException iOException76 = new java.io.IOException((java.lang.Throwable) iOException75);
        java.lang.Throwable throwable78 = null;
        java.io.IOException iOException79 = new java.io.IOException(throwable78);
        java.lang.Throwable[] throwableArray80 = iOException79.getSuppressed();
        java.io.IOException iOException81 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException79);
        java.lang.Throwable[] throwableArray82 = iOException79.getSuppressed();
        java.io.IOException iOException83 = new java.io.IOException((java.lang.Throwable) iOException79);
        java.lang.Throwable throwable85 = null;
        java.io.IOException iOException86 = new java.io.IOException(throwable85);
        java.lang.Throwable[] throwableArray87 = iOException86.getSuppressed();
        java.io.IOException iOException88 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException86);
        java.lang.Throwable[] throwableArray89 = iOException86.getSuppressed();
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList90 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException7, (java.lang.Throwable) iOException53, (java.lang.Throwable) iOException62, (java.lang.Throwable) iOException64, (java.lang.Throwable) iOException75, (java.lang.Throwable) iOException79, (java.lang.Throwable) iOException86);
        iOException2.addSuppressed((java.lang.Throwable) iOException79);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableList47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableList90);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01953");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        boolean boolean4 = node3.isCall();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isVoid();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        boolean boolean10 = node9.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node9.getNext();
        boolean boolean13 = node9.isFalse();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean18 = node17.isEmpty();
        node9.addChildrenToBack(node17);
        boolean boolean20 = node5.isEquivalentTo(node9);
        com.google.javascript.rhino.Node node21 = node5.removeFirstChild();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        java.lang.Object obj28 = node23.getProp(29);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative30 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec31 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative30);
        java.lang.String str32 = assertionFunctionSpec31.getFunctionName();
        java.lang.String str33 = assertionFunctionSpec31.getFunctionName();
        java.lang.String str34 = assertionFunctionSpec31.getFunctionName();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList41 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList44 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator46 = charSequenceList44.spliterator();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(32, node49);
        boolean boolean54 = node53.isGetterDef();
        boolean boolean55 = charSequenceList44.equals((java.lang.Object) boolean54);
        boolean boolean57 = charSequenceList44.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean58 = charSequenceList41.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        boolean boolean64 = node60.isStringKey();
        boolean boolean65 = node60.isThrow();
        int int66 = charSequenceList41.indexOf((java.lang.Object) node60);
        boolean boolean67 = node60.isContinue();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean72 = node71.isEmpty();
        com.google.javascript.rhino.InputId inputId73 = null;
        node71.setInputId(inputId73);
        boolean boolean75 = node71.isIf();
        boolean boolean76 = node71.isOnlyModifiesThisCall();
        node60.addChildrenToBack(node71);
        com.google.javascript.rhino.Node node78 = assertionFunctionSpec31.getAssertedParam(node60);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0);
        node80.putIntProp((-1), 35);
        boolean boolean84 = node80.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder85 = node80.getJsDocBuilderForNode();
        boolean boolean86 = node80.isTypeOf();
        com.google.javascript.rhino.Node node87 = node80.removeChildren();
        boolean boolean88 = node80.isGetElem();
        com.google.javascript.rhino.Node[] nodeArray89 = new com.google.javascript.rhino.Node[] { node5, node23, node78, node80 };
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray89);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(53, nodeArray89, 14, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceList41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(nodeArray89);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01954");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        boolean boolean57 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = parameterizedType48.testForEquality(jSType58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01955");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        jSTypeRegistry12.unregisterPropertyOnType("(Not declared as a type name)", jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry12.createFunctionType(jSType16, true, jSTypeArray18);
        boolean boolean21 = functionType19.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean34 = functionType32.removeProperty("false");
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj47 = node45.getProp((int) (byte) 10);
        boolean boolean48 = node36.isEquivalentToTyped(node45);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node51);
        boolean boolean56 = node55.isInstanceOf();
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoFromForTree(node55);
        boolean boolean58 = node55.isDo();
        boolean boolean59 = functionType19.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType32, node55);
        boolean boolean60 = functionType32.isUnknownType();
        java.util.Set<java.lang.String> strSet61 = functionType32.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32, "Unknown class name", "Unknown class name", 41, 2);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        jSTypeRegistry69.unregisterPropertyOnType("(Not declared as a type name)", jSType71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry69.createFunctionType(jSType73, true, jSTypeArray75);
        boolean boolean78 = functionType76.removeProperty("false");
        boolean boolean79 = functionType76.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        jSTypeRegistry82.unregisterPropertyOnType("(Not declared as a type name)", jSType84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry82.createFunctionType(jSType86, true, jSTypeArray88);
        boolean boolean90 = functionType89.hasReferenceName();
        boolean boolean91 = functionType76.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType89);
        boolean boolean92 = functionType89.hasAnyTemplate();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType89);
        boolean boolean95 = functionType89.isPropertyTypeInferred("NUMBER 0.0");
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType89.getIndexType();
        boolean boolean97 = functionType89.isArrayType();
        java.util.Set<java.lang.String> strSet98 = functionType89.getOwnPropertyNames();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(strSet98);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01956");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = functionType15.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node22 = functionType15.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean33 = functionType32.isReturnTypeInferred();
        boolean boolean34 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean35 = functionType32.isResolved();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot37 = functionType32.getSlot("function (): {2140273663}");
        boolean boolean38 = functionType32.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSlot37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01957");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        jSDocInfo0.setLicense("(function (): {480423885})");
        boolean boolean11 = jSDocInfo0.hasModifies();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01958");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        com.google.javascript.rhino.Node node51 = functionType22.getPropertyNode("java.io.IOException");
        java.lang.String str52 = functionType22.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType22.unboxesTo();
        boolean boolean54 = functionType22.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType22.findPropertyType("NUMBER 0.0\n");
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType22.getTypeOfThis();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(node51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {632158032}" + "'", str52, "function (): {632158032}");
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01959");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType22.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean48 = functionType46.removeProperty("false");
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        boolean boolean54 = node50.isStringKey();
        boolean boolean55 = node50.isThrow();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj61 = node59.getProp((int) (byte) 10);
        boolean boolean62 = node50.isEquivalentToTyped(node59);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(0);
        node65.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(32, node65);
        boolean boolean70 = node69.isInstanceOf();
        com.google.javascript.rhino.Node node71 = node59.useSourceInfoFromForTree(node69);
        boolean boolean72 = node69.isDo();
        boolean boolean73 = functionType33.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType46, node69);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = functionType33.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = functionType33.getPossibleToBooleanOutcomes();
        boolean boolean76 = functionType33.matchesNumberContext();
        boolean boolean77 = functionType22.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean79 = functionType33.isPropertyTypeDeclared("(Not declared as a type name)");
        boolean boolean80 = functionType33.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair81 = functionType9.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = functionType9.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType9.getConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        jSTypeRegistry86.unregisterPropertyOnType("(Not declared as a type name)", jSType88);
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry86.createFunctionType(jSType90, true, jSTypeArray92);
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType93.restrictByNotNullOrUndefined();
        java.lang.String str95 = functionType93.toString();
        int int96 = functionType93.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType97 = functionType93.restrictByNotNullOrUndefined();
        boolean boolean98 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, jSType97);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typePair81);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet82 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet82.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "function (): ?" + "'", str95, "function (): ?");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01960");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType9.getPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        boolean boolean25 = functionType23.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        jSTypeRegistry29.unregisterPropertyOnType("(Not declared as a type name)", jSType31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType(jSType33, true, jSTypeArray35);
        boolean boolean38 = functionType36.removeProperty("false");
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        node40.putIntProp((-1), 35);
        boolean boolean44 = node40.isStringKey();
        boolean boolean45 = node40.isThrow();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj51 = node49.getProp((int) (byte) 10);
        boolean boolean52 = node40.isEquivalentToTyped(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        node55.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(32, node55);
        boolean boolean60 = node59.isInstanceOf();
        com.google.javascript.rhino.Node node61 = node49.useSourceInfoFromForTree(node59);
        boolean boolean62 = node59.isDo();
        boolean boolean63 = functionType23.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType36, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        jSTypeRegistry66.unregisterPropertyOnType("(Not declared as a type name)", jSType68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry66.createFunctionType(jSType70, true, jSTypeArray72);
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType73.restrictByNotNullOrUndefined();
        node59.setJSType(jSType74);
        boolean boolean76 = jSType74.isNoResolvedType();
        boolean boolean77 = functionType9.canTestForShallowEqualityWith(jSType74);
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = jSDocInfo79.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility82 = null;
        jSDocInfo79.setVisibility(visibility82);
        boolean boolean84 = jSDocInfo79.isIdGenerator();
        java.lang.String str85 = jSDocInfo79.getLendsName();
        functionType9.setPropertyJSDocInfo("function (): {1120480319}", jSDocInfo79);
        java.lang.String str87 = jSDocInfo79.getLendsName();
        boolean boolean88 = jSDocInfo79.isJavaDispatch();
        boolean boolean89 = jSDocInfo79.isNoAlias();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(jSTypeExpression81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01961");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType21.getOwnerFunction();
        java.util.Set<java.lang.String> strSet28 = functionType21.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getTypeOfThis();
        boolean boolean31 = functionType21.isPropertyTypeDeclared("hi!");
        java.lang.String str32 = functionType21.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType21.findPropertyType("function (): {1120480319}");
        java.util.Set<java.lang.String> strSet35 = functionType21.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        jSTypeRegistry38.unregisterPropertyOnType("(Not declared as a type name)", jSType40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType(jSType42, true, jSTypeArray44);
        boolean boolean47 = functionType45.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry51.createFunctionType(jSType55, true, jSTypeArray57);
        boolean boolean60 = functionType58.removeProperty("false");
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        boolean boolean66 = node62.isStringKey();
        boolean boolean67 = node62.isThrow();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj73 = node71.getProp((int) (byte) 10);
        boolean boolean74 = node62.isEquivalentToTyped(node71);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        node77.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(32, node77);
        boolean boolean82 = node81.isInstanceOf();
        com.google.javascript.rhino.Node node83 = node71.useSourceInfoFromForTree(node81);
        boolean boolean84 = node81.isDo();
        boolean boolean85 = functionType45.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType58, node81);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType45.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = functionType45.getPossibleToBooleanOutcomes();
        boolean boolean88 = functionType45.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType45.restrictByNotNullOrUndefined();
        boolean boolean91 = functionType45.hasProperty("InputId: NUMBER 0.0 100\n");
        boolean boolean92 = functionType45.isNominalConstructor();
        boolean boolean94 = functionType45.hasProperty("function (): {1685012791}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = strSet35.contains((java.lang.Object) functionType45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.jstype.FunctionType cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(functionType27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01962");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "hi!");
        com.google.javascript.rhino.Node node5 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.Node node6 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.Node node7 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isReturn();
        com.google.javascript.rhino.InputId inputId14 = node9.getInputId();
        node9.setWasEmptyNode(true);
        boolean boolean17 = node9.isLabel();
        boolean boolean18 = node9.isArrayLit();
        boolean boolean19 = node9.isLabelName();
        boolean boolean20 = node9.isDelProp();
        boolean boolean21 = node9.isNumber();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        jSTypeRegistry24.unregisterPropertyOnType("(Not declared as a type name)", jSType26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry24.createFunctionType(jSType28, true, jSTypeArray30);
        boolean boolean33 = functionType31.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        node48.putIntProp((-1), 35);
        boolean boolean52 = node48.isStringKey();
        boolean boolean53 = node48.isThrow();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj59 = node57.getProp((int) (byte) 10);
        boolean boolean60 = node48.isEquivalentToTyped(node57);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        node63.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(32, node63);
        boolean boolean68 = node67.isInstanceOf();
        com.google.javascript.rhino.Node node69 = node57.useSourceInfoFromForTree(node67);
        boolean boolean70 = node67.isDo();
        boolean boolean71 = functionType31.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType44, node67);
        boolean boolean72 = functionType44.isUnknownType();
        java.util.Set<java.lang.String> strSet73 = functionType44.getPropertyNames();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0);
        boolean boolean76 = node75.isInstanceOf();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        node78.putIntProp((-1), 35);
        boolean boolean82 = node78.isStringKey();
        boolean boolean83 = node78.isThrow();
        boolean boolean84 = node78.isEmpty();
        com.google.javascript.rhino.Node node85 = node75.useSourceInfoFrom(node78);
        boolean boolean86 = strSet73.equals((java.lang.Object) node75);
        boolean boolean87 = node75.isDebugger();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection88 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node75);
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceChildAfter(node9, node75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(nodeCollection88);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01963");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.Iterable iterable50 = functionType9.getCtorExtendedInterfaces();
        boolean boolean51 = functionType9.isBooleanValueType();
        boolean boolean52 = functionType9.matchesInt32Context();
        boolean boolean53 = functionType9.isUnknownType();
        com.google.javascript.rhino.Node node54 = functionType9.getRootNode();
        boolean boolean55 = functionType9.matchesNumberContext();
        boolean boolean57 = functionType9.isPropertyTypeDeclared("Node tree inequality:\nTree1:\nSTRING (function (): {480423885}) 32\n\n\nTree2:\nNUMBER 2.0 39\n\n\nSubtree1: STRING (function (): {480423885}) 32\n\n\nSubtree2: NUMBER 2.0 39\n");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType9.getTopMostDefiningType("{proxy:function (): {839059875}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01964");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean37 = functionType35.removeProperty("false");
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj50 = node48.getProp((int) (byte) 10);
        boolean boolean51 = node39.isEquivalentToTyped(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(32, node54);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoFromForTree(node58);
        boolean boolean61 = node58.isDo();
        boolean boolean62 = functionType22.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType35, node58);
        boolean boolean63 = functionType35.isUnknownType();
        java.util.Set<java.lang.String> strSet64 = functionType35.getPropertyNames();
        node8.setJSType((com.google.javascript.rhino.jstype.JSType) functionType35);
        int int66 = functionType35.getExtendedInterfacesCount();
        boolean boolean67 = functionType35.hasInstanceType();
        java.lang.String str68 = functionType35.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "function (): ?" + "'", str68, "function (): ?");
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01965");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(32, node16);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoFromForTree(node20);
        boolean boolean23 = node20.isDo();
        boolean boolean24 = node20.isIn();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.hasThisType();
        boolean boolean27 = jSDocInfo25.hasEnumParameterType();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo25.getTemplateTypeNames();
        java.util.Set<java.lang.String> strSet29 = jSDocInfo25.getSuppressions();
        node20.setDirectives(strSet29);
        boolean boolean31 = strSet29.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01966");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        java.lang.String str7 = node2.getQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("true");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 100, node13, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj32 = node30.getProp((int) (byte) 10);
        boolean boolean33 = node21.isEquivalentToTyped(node30);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(32, node36);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.Node node42 = node30.useSourceInfoFromForTree(node40);
        boolean boolean43 = node42.isStringKey();
        com.google.javascript.rhino.Node node44 = node19.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(54, node10, node42);
        com.google.javascript.rhino.Node node46 = node2.useSourceInfoIfMissingFrom(node45);
        boolean boolean47 = node46.isCall();
        boolean boolean48 = node46.isWhile();
        boolean boolean49 = node46.isOptionalArg();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01967");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isTry();
        node1.putBooleanProp(39, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01968");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable11 = jSTypeRegistry2.getEachReferenceTypeWithProperty("NUMBER 0.0 100\n");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode12 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode13 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode15 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList16 = com.google.common.collect.ImmutableList.of(resolveMode12, resolveMode13, resolveMode14, resolveMode15);
        jSTypeRegistry2.setResolveMode(resolveMode12);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.hasThisType();
        boolean boolean22 = jSDocInfo20.shouldPreserveTry();
        boolean boolean23 = jSDocInfo20.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo20.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean26 = jSDocInfo20.shouldPreserveTry();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node30 = node28.cloneTree();
        boolean boolean31 = node28.isNull();
        jSDocInfo20.setAssociatedNode(node28);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean44 = functionType42.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean57 = functionType55.removeProperty("false");
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        node59.putIntProp((-1), 35);
        boolean boolean63 = node59.isStringKey();
        boolean boolean64 = node59.isThrow();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj70 = node68.getProp((int) (byte) 10);
        boolean boolean71 = node59.isEquivalentToTyped(node68);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0);
        node74.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(32, node74);
        boolean boolean79 = node78.isInstanceOf();
        com.google.javascript.rhino.Node node80 = node68.useSourceInfoFromForTree(node78);
        boolean boolean81 = node78.isDo();
        boolean boolean82 = functionType42.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType55, node78);
        boolean boolean83 = functionType55.isUnknownType();
        java.util.Set<java.lang.String> strSet84 = functionType55.getPropertyNames();
        node28.setJSType((com.google.javascript.rhino.jstype.JSType) functionType55);
        boolean boolean86 = functionType55.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType55.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = functionType55.getOwnPropertyJSDocInfo("function (): {1825464447}");
        boolean boolean90 = jSTypeRegistry2.declareType("{proxy:function (): {1556474225}}", (com.google.javascript.rhino.jstype.JSType) functionType55);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable91 = functionType55.getExtendedInterfaces();
        boolean boolean92 = functionType55.matchesInt32Context();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertTrue("'" + resolveMode12 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode12.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode13 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode13.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode14 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode14.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode15 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode15.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList16);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(jSDocInfo89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01969");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = functionType9.getTemplateTypeNames();
        boolean boolean14 = functionType9.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01970");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj7 = node5.getProp((int) (byte) 10);
        boolean boolean8 = node5.isGetProp();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        boolean boolean11 = node10.isInstanceOf();
        boolean boolean12 = node10.isWhile();
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] { node5, node10 };
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray13, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(29, nodeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray13);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01971");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isReturn();
        com.google.javascript.rhino.Node node20 = node13.srcref(node15);
        boolean boolean21 = node20.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection28 = jSDocInfo22.getMarkers();
        java.util.Collection<java.lang.String> strCollection29 = jSDocInfo22.getAuthors();
        jSDocInfo22.setDeprecated(false);
        node20.setJSDocInfo(jSDocInfo22);
        java.util.Collection<java.lang.String> strCollection33 = jSDocInfo22.getAuthors();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo22.getReturnType();
        boolean boolean36 = jSDocInfo22.hasParameterType("{proxy:function (): {545083368}}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(markerCollection28);
        org.junit.Assert.assertNull(strCollection29);
        org.junit.Assert.assertNull(strCollection33);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01972");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(35, node4, node7);
        boolean boolean9 = node8.isComma();
        boolean boolean10 = node8.isWith();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isStringKey();
        boolean boolean20 = node15.isThrow();
        boolean boolean21 = node15.isEmpty();
        com.google.javascript.rhino.Node node22 = node12.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoIfMissingFrom(node12);
        com.google.javascript.rhino.Node node24 = node23.cloneNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node24.new FileLevelJsDocBuilder();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01973");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(32);
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.clearAllFlags();
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01974");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        com.google.javascript.rhino.Node node24 = functionType21.getRootNode();
        com.google.javascript.rhino.Node node25 = functionType21.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType21.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jSType26.isCheckedUnknownType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(jSType26);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01975");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node4.isNE();
        boolean boolean13 = node4.isCall();
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        int int23 = node17.getLineno();
        boolean boolean24 = node17.hasChildren();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node17.hasChild(node26);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node32.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0, node26, node32, node38);
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node4, "function (): {1385595472}");
        com.google.javascript.rhino.Node node43 = jSTypeExpression42.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(staticSourceFile34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeExpression44);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01976");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType29.autoboxesTo();
        java.lang.String str31 = functionType29.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = functionType41.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot44 = functionType41.getSlot("NUMBER 0.0 100\n");
        boolean boolean45 = functionType41.isAllType();
        boolean boolean46 = functionType29.hasEqualCallType(functionType41);
        boolean boolean47 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType57.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType57.toObjectType();
        boolean boolean60 = objectType59.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = objectType59.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType63 = objectType59.getPropertyType("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair64 = functionType15.getTypesUnderEquality(jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = typePair64.typeB;
        com.google.javascript.rhino.jstype.JSType jSType66 = typePair64.typeB;
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(staticSlot44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(typePair64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(jSType66);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01977");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue2.not();
        java.lang.String str4 = ternaryValue2.toString();
        boolean boolean6 = ternaryValue2.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue7.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue9.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue9.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue12.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue12.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList16 = com.google.common.collect.ImmutableList.of(ternaryValue1, ternaryValue2, ternaryValue8, ternaryValue9, ternaryValue14, ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue0.xor(ternaryValue14);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        boolean boolean29 = functionType27.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj55 = node53.getProp((int) (byte) 10);
        boolean boolean56 = node44.isEquivalentToTyped(node53);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        node59.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(32, node59);
        boolean boolean64 = node63.isInstanceOf();
        com.google.javascript.rhino.Node node65 = node53.useSourceInfoFromForTree(node63);
        boolean boolean66 = node63.isDo();
        boolean boolean67 = functionType27.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType40, node63);
        java.lang.String str68 = functionType40.getReferenceName();
        boolean boolean69 = functionType40.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        boolean boolean81 = functionType79.removeProperty("false");
        boolean boolean82 = functionType79.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType79.getPrototype();
        boolean boolean84 = objectType83.isVoidType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType40.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType83);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str88 = ternaryValue87.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = ternaryValue85.or(ternaryValue87);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = ternaryValue0.xor(ternaryValue89);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValueList16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(ternaryValue87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "false" + "'", str88, "false");
        org.junit.Assert.assertNotNull(ternaryValue89);
        org.junit.Assert.assertNotNull(ternaryValue90);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01978");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(35, node4, node7);
        boolean boolean9 = node8.isComma();
        boolean boolean10 = node8.isWith();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isStringKey();
        boolean boolean20 = node15.isThrow();
        boolean boolean21 = node15.isEmpty();
        com.google.javascript.rhino.Node node22 = node12.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoIfMissingFrom(node12);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        boolean boolean27 = node26.isInstanceOf();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isStringKey();
        boolean boolean34 = node29.isThrow();
        boolean boolean35 = node29.isEmpty();
        com.google.javascript.rhino.Node node36 = node26.useSourceInfoFrom(node29);
        boolean boolean37 = node29.isNE();
        boolean boolean38 = node29.isCall();
        boolean boolean39 = node29.isNew();
        node29.setIsSyntheticBlock(true);
        int int42 = node29.getCharno();
        boolean boolean43 = node29.isNoSideEffectsCall();
        boolean boolean44 = node23.isEquivalentToTyped(node29);
        // The following exception was thrown during execution in test generation
        try {
            node29.setString("function (): {620032704}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01979");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.reverse();
        boolean boolean25 = charSequenceList6.isEmpty();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList32 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator37 = charSequenceList35.spliterator();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        node40.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(32, node40);
        boolean boolean45 = node44.isGetterDef();
        boolean boolean46 = charSequenceList35.equals((java.lang.Object) boolean45);
        boolean boolean48 = charSequenceList35.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean49 = charSequenceList32.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        int int57 = charSequenceList32.indexOf((java.lang.Object) node51);
        java.lang.Object[] objArray58 = charSequenceList32.toArray();
        boolean boolean59 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int60 = charSequenceList6.size();
        java.lang.Object obj61 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = charSequenceList6.remove(obj61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceList32);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01980");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        boolean boolean14 = node6.isBreak();
        node6.setWasEmptyNode(true);
        boolean boolean17 = node6.isParamList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = node6.getProp((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01981");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        boolean boolean25 = node11.hasOneChild();
        com.google.javascript.rhino.Node node27 = node11.getAncestor((int) (byte) 1);
        boolean boolean28 = node11.isCatch();
        boolean boolean29 = node11.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01982");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec2.getAssertedType(node12, jSTypeRegistry16);
        jSTypeRegistry16.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry16.getNativeObjectType(jSTypeNative36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01983");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        java.lang.Iterable iterable14 = functionType9.getCtorImplementedInterfaces();
        boolean boolean15 = functionType9.isNumberObjectType();
        com.google.javascript.rhino.Node node16 = functionType9.getParametersNode();
        boolean boolean17 = functionType9.isNumberValueType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType9.getReturnType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType18);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01984");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        boolean boolean7 = node2.hasMoreThanOneChild();
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isTry();
        java.lang.String str10 = node2.getSourceFileName();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node2.getAncestors();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(ancestorIterable11);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01985");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        node40.putIntProp((-1), 35);
        boolean boolean44 = node40.isStringKey();
        boolean boolean45 = node40.isThrow();
        int int46 = node40.getLineno();
        boolean boolean47 = node40.hasChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(32, node50);
        boolean boolean55 = node50.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node56 = node40.useSourceInfoIfMissingFromForTree(node50);
        node32.addChildrenToFront(node40);
        boolean boolean58 = node40.isNull();
        boolean boolean59 = node40.isLabel();
        node40.setSourceEncodedPositionForTree((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01986");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        boolean boolean11 = functionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean34 = functionType32.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        jSTypeRegistry38.unregisterPropertyOnType("(Not declared as a type name)", jSType40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType(jSType42, true, jSTypeArray44);
        boolean boolean47 = functionType45.removeProperty("false");
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isStringKey();
        boolean boolean54 = node49.isThrow();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj60 = node58.getProp((int) (byte) 10);
        boolean boolean61 = node49.isEquivalentToTyped(node58);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(32, node64);
        boolean boolean69 = node68.isInstanceOf();
        com.google.javascript.rhino.Node node70 = node58.useSourceInfoFromForTree(node68);
        boolean boolean71 = node68.isDo();
        boolean boolean72 = functionType32.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType45, node68);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType21, (com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = functionType45.getPossibleToBooleanOutcomes();
        boolean boolean75 = functionType45.hasDisplayName();
        boolean boolean76 = functionType45.isString();
        boolean boolean77 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean79 = functionType9.isPropertyTypeInferred("function (): {1614074355}");
        boolean boolean81 = functionType9.isPropertyInExterns("Function");
        int int82 = functionType9.getPropertiesCount();
        boolean boolean83 = functionType9.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet74 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet74.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01987");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean23 = functionType22.hasReferenceName();
        boolean boolean24 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean25 = functionType22.hasAnyTemplate();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.hasThisType();
        boolean boolean29 = jSDocInfo27.shouldPreserveTry();
        boolean boolean30 = jSDocInfo27.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo27.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean33 = jSDocInfo27.shouldPreserveTry();
        boolean boolean34 = jSDocInfo27.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection35 = jSDocInfo27.getAuthors();
        java.lang.String str36 = jSDocInfo27.getReturnDescription();
        boolean boolean37 = jSDocInfo27.isOverride();
        functionType22.setPropertyJSDocInfo("(Not declared as a type name)", jSDocInfo27);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType22.getExtendedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = functionType22.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strCollection35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01988");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        java.lang.Iterable iterable14 = functionType9.getCtorImplementedInterfaces();
        boolean boolean16 = functionType9.isPropertyTypeDeclared("{proxy:function (): {677068937}}");
        boolean boolean17 = functionType9.isStringValueType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterable14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01989");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        com.google.common.collect.UnmodifiableIterator<java.lang.CharSequence> charSequenceItor32 = charSequenceList6.iterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream33 = charSequenceList6.parallelStream();
        java.lang.String str34 = charSequenceList6.toString();
        java.util.Iterator<java.lang.CharSequence> charSequenceItor35 = charSequenceList6.iterator();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isStringKey();
        boolean boolean43 = node38.isThrow();
        int int44 = node38.getLineno();
        boolean boolean45 = node38.hasChildren();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node38.hasChild(node47);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        boolean boolean54 = node53.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile55 = node53.getStaticSourceFile();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0, node47, node53, node59);
        int int62 = node53.getIntProp((int) (byte) 100);
        boolean boolean63 = charSequenceList6.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor32);
        org.junit.Assert.assertNotNull(charSequenceStream33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str34, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceItor35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(staticSourceFile55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01990");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry2.createNamedType("function (): {687989446}", "function (): {405212503}", 53, 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode25 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode26 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode27 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode28 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList29 = com.google.common.collect.ImmutableList.of(resolveMode25, resolveMode26, resolveMode27, resolveMode28);
        jSTypeRegistry2.setResolveMode(resolveMode26);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry2.getNativeObjectType(jSTypeNative31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertTrue("'" + resolveMode25 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode25.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode26 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode26.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode27 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode27.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode28 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode28.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList29);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01991");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = functionType21.getOwnPropertyJSDocInfo("function (): {2068438814}");
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getReturnType();
        int int30 = functionType21.getMaxArguments();
        boolean boolean31 = functionType21.matchesStringContext();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01992");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean7 = node1.isObjectLit();
        boolean boolean8 = node1.isNoSideEffectsCall();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01993");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = jSTypeRegistry2.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType24.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType26 = functionType24.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType24.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry14.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType24);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry14.createAnonymousObjectType();
        jSTypeRegistry14.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry14.createNamedType("function (): {687989446}", "function (): {405212503}", 53, 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode37 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode39 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode40 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList41 = com.google.common.collect.ImmutableList.of(resolveMode37, resolveMode38, resolveMode39, resolveMode40);
        jSTypeRegistry14.setResolveMode(resolveMode38);
        jSTypeRegistry2.setResolveMode(resolveMode38);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry2.getNativeObjectType(jSTypeNative44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNull(enumType26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertTrue("'" + resolveMode37 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode37.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode39 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode39.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode40 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode40.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList41);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01994");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((-1), "");
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01995");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.autobox();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterable54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{proxy:function (): {1541746238}}" + "'", str55, "{proxy:function (): {1541746238}}");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "{proxy:function (): {1541746238}}" + "'", str56, "{proxy:function (): {1541746238}}");
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01996");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node6);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        boolean boolean17 = node16.isCall();
        com.google.javascript.rhino.Node node18 = node16.cloneTree();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(35, node18, node21);
        boolean boolean23 = node22.isComma();
        boolean boolean24 = node22.isWith();
        boolean boolean25 = node22.isStringKey();
        com.google.javascript.rhino.Node node26 = node6.srcref(node22);
        typePosition0.setItem(node6);
        int int28 = typePosition0.getPositionOnEndLine();
        int int29 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        boolean boolean32 = node31.isInstanceOf();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        boolean boolean40 = node34.isEmpty();
        com.google.javascript.rhino.Node node41 = node31.useSourceInfoFrom(node34);
        boolean boolean42 = node41.isVar();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        boolean boolean45 = node44.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node44.getStaticSourceFile();
        node44.setLineno((int) '4');
        com.google.javascript.rhino.Node node49 = node41.useSourceInfoIfMissingFrom(node44);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj55 = node53.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node56 = node44.copyInformationFrom(node53);
        boolean boolean57 = node53.isFor();
        typePosition0.setItem(node53);
        int int59 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01997");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        boolean boolean27 = functionType9.isCheckedUnknownType();
        boolean boolean28 = functionType9.isGlobalThisType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01998");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getFileOverview();
        boolean boolean2 = jSDocInfo0.isConstant();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test01999");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        boolean boolean12 = objectType11.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        boolean boolean25 = functionType22.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType22.getImplicitPrototype();
        boolean boolean27 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean28 = functionType22.isVoidType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType22.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType22.findPropertyType("Function");
        boolean boolean33 = functionType22.hasOwnProperty("Named type with empty name component");
        boolean boolean35 = functionType22.hasOwnProperty("function (): {2002213484}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test02000");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.String str54 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.EnumType enumType55 = parameterizedType48.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = parameterizedType48.getConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "{proxy:function (): {1741741985}}" + "'", str54, "{proxy:function (): {1741741985}}");
        org.junit.Assert.assertNull(enumType55);
        org.junit.Assert.assertNull(functionType56);
    }
}
